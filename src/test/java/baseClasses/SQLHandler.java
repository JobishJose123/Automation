package baseClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.*;
import java.util.Enumeration;

public class SQLHandler {
	
		    private Statement statement = null;
		    private PreparedStatement preparedStatement = null;
		    private ResultSet resultSet = null;
		    private Connection conn = null;
		    String JDBC_DRIVER = "";  
		     String DB_URL = "";
		     String USER = "";
		     String PASS = "";
		    
		    public void init(String dbUrl,String username,String password) throws Exception {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        	JDBC_DRIVER = "com.mysql.jdbc.Driver";  
			    DB_URL = dbUrl;
			    USER = username;
			    PASS = password; 

		   conn = DriverManager.getConnection(DB_URL,USER,PASS);
		   statement = conn.createStatement();
		    }
        private void writeResultSet(ResultSet resultSet) throws SQLException {
        	
        	 
             // Result set get the result of the SQL query
             resultSet = statement.executeQuery("select a.PARTNER_PROFILE_FIELD_NAME,b.ATTRIBUTE_ID , b.ATTRIBUTE_NAME from app_partner_profile_field as a,oz_entity_attribute as b where a.PARTNER_PROFILE_FIELD_ID=b.ATTRIBUTE_NAME and b.ENTITY_TYPE_ID=1 AND a.PARTNER_PROFILE_FIELD_NAME = 'Age_q11';");
             writeResultSet(resultSet);
            // ResultSet is initially before the first data set
            while (resultSet.next()) {
                // It is possible to get the columns via name
                // also possible to get the columns via the column number
                // which starts at 1
                // e.g. resultSet.getSTring(2);
                String fieldName = resultSet.getString("PARTNER_PROFILE_FIELD_NAME");
                String fieldId = resultSet.getString("ATTRIBUTE_ID");
                System.out.println(fieldName);
                System.out.println(fieldId);
            }
        }
        public ResultSet executeQuery(String query) throws SQLException {
        	return statement.executeQuery(query);
        }
        public int executeUpdate(String query) throws SQLException {
        	return statement.executeUpdate(query);
        }
        public int getNumberOfRows() throws SQLException {
        	resultSet.last();
        	return resultSet.getRow();
        }
        public int getStringOfQuery(String query) throws SQLException {
            resultSet = statement.executeQuery(query);
            resultSet.next();
            if(resultSet.isLast()) {
            	return resultSet.getInt(1);
            }
            else {
            	return -1;
            }
        }
        public int getTouchpointID(String touchpointName) throws SQLException {
            resultSet = statement.executeQuery("select touchpoint_id from im_touchpoint where NAME='"+touchpointName+"';");
            resultSet.next();
            if(resultSet.isLast()) {
            	return resultSet.getInt(1);
            }
            else {
            	return -1;
            }
        }
        
        public void getIpAddress() throws UnknownHostException, SocketException {
        	// getting the list of interfaces in the local machine
            Enumeration<NetworkInterface> n = NetworkInterface.getNetworkInterfaces();
            while( n.hasMoreElements()){ //for each interface
                System.out.println("----------------------------------------------------");
                NetworkInterface e = n.nextElement();
            //name of the interface
                System.out.println("Interface Name: " + e.getName());
            /* A interface may be binded to many IP addresses like IPv4 and IPv6
                hence getting the Enumeration of list of IP addresses  */
                Enumeration<InetAddress> a = e.getInetAddresses();
                while( a.hasMoreElements()){
                    InetAddress addr = a.nextElement();
                    String add = addr.getHostAddress().toString();
                    if( add.length() < 17 )
                        System.out.println("IPv4 Address: " + add);
                    else
                        System.out.println("IPv6 Address: " + add);
                }
                if(e.getHardwareAddress() != null){
                            // getting the mac address of the particular network interface
                    byte[] mac = e.getHardwareAddress();
                            // properly formatting the mac address
                    StringBuilder macAddress = new StringBuilder();
                    for(int i =0; i < mac.length; i++){
                        macAddress.append(String.format("%03X%s", mac[i],(i < mac.length -1) ? "-":""));
                    }
                    System.out.println("Hardware adrress: " + macAddress.toString());
                }
                }

        }
        public void addTouchpointToApiAuthPolicy(String touchpointName) throws SQLException, IOException, InterruptedException {
        	ResultSet rs = executeQuery("select * from api_auth_policy;");
        	MarathonHelper m = new MarathonHelper();
        	PropHandler p = new PropHandler();
        	p.setPropertyFile("config.properties");
    		rs.last();
    		int numRows = rs.getRow();
    		int touchpointId = getTouchpointID(touchpointName);
    		rs = executeQuery("select * from api_auth_policy where TOUCH_POINT_ID = "+touchpointId+";");
    		if(!rs.first()) {
    			executeUpdate("insert into api_auth_policy values("+ ++numRows+","+touchpointId+",\""+""+touchpointName+"\",\""+p.getValue("machineIp")+"\");");
    			m.scaleContainer(p.getValue("env"), p.getValue("api-server"),"0");
    			Thread.sleep(8000);
    			m.scaleContainer(p.getValue("env"), p.getValue("api-server"),"1");
    			for(int i=0;i<10;i++) {
    				Thread.sleep(20000);
    			}
    		}
    		else
    			System.out.println("row with the touchpoint already exist");
    		
        }
        
	public static void main(String[] args) throws Exception {
		SQLHandler sql = new SQLHandler();
		PropHandler p = new PropHandler();
		p.setPropertyFile("config.properties");
		sql.init(p.getValue("dbUrl"),p.getValue("dbUsername"),p.getValue("dbPassword"));
		int touchpointId = sql.getTouchpointID("touchpoint007");
		
		System.out.println(touchpointId);
		sql.addTouchpointToApiAuthPolicy("touchpoint007");
	}

}
