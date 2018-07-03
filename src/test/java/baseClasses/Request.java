package baseClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Random;

import org.apache.commons.codec.binary.Base64;

public class Request {
	
	final static String USER_AGENT = "Mozilla/5.0";
	String encodedAuthorization = null;  //  am9lbC5qb3NlQGZseXR4dC5jb206U3BsZW5kZXIuMjc3MQ==
	URL url = null;
	String getString = null;
	HttpURLConnection con = null;
	
	public String responseString = null;
	
	public void setEncodedAuthorisation(String auth) {
		encodedAuthorization = auth;
		con.setRequestProperty("Authorization", "Basic "+
	            encodedAuthorization);
	}
	
	public void openConnection() throws IOException {
		con = (HttpURLConnection) url.openConnection();
	}
	
	public void setUrl(String reqUrl) throws IOException {
		url = new URL(reqUrl);
		openConnection();
	}
	
	public void setGetProperties() throws ProtocolException {
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
	}
	
	public void setPutProperties() throws ProtocolException {
		 con.setRequestMethod("PUT");
		 con.setDoOutput(true);
		 con.setRequestProperty("Content-Type", "application/json");
		 con.setRequestProperty("Accept", "application/json");
	}
	
	public String getResponseString() throws IOException {
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
//		System.out.println(response);
		responseString = response.toString();
		return responseString;
	}
	
	public int getRequest(String urlStr,String authkey) throws IOException{	
		setUrl(urlStr);
		setEncodedAuthorisation(authkey);
		setGetProperties();
		int responseCode = con.getResponseCode();
//		System.out.println("\nSending 'GET' request to URL : " + url);
//		System.out.println("Response Code : " + responseCode);
		getResponseString();
		return responseCode;	
	}

	public void putRequest(String urlStr,String authKey,String data) throws IOException{
		Random random = new Random();
		setUrl(urlStr);
		setEncodedAuthorisation(authKey);
		setPutProperties();
		OutputStreamWriter osw = new OutputStreamWriter(con.getOutputStream());
		osw.write(String.format(data, random.nextInt(30), random.nextInt(20)));
		osw.flush();
		osw.close();
		System.err.println(con.getResponseCode());
	}
	
	public static void main(String[] args) throws IOException {
		Request r = new Request();
		String[] testCases = {"NX-7116","NX-7109","NX-7108","NX-7107","NX-7087","NX-7055","NX-7053","NX-7051","NX-7049","NX-7048","NX-7046","NX-7044","NX-7042","NX-7040","NX-7032","NX-7031","NX-7028","NX-7020","NX-7019","NX-7017","NX-7012","NX-6999","NX-6998","NX-6995","NX-6993","NX-6990","NX-6988","NX-6987","NX-6980","NX-6979","NX-6974","NX-6973","NX-6971","NX-6969","NX-6968","NX-6967","NX-2101","NX-2073","NX-2066","NX-2065","NX-2050","NX-1375","NX-1373","NX-1344","NX-1343","NX-1340","NX-1338","NX-1336","NX-1333","NX-1330","NX-1271","NX-1269","NX-1247","NX-1239","NX-1238","NX-1234","NX-1192","NX-1190","NX-1185","NX-1184","NX-1180","NX-1179","NX-1177","NX-1170","NX-1169","NX-1168","NX-1167","NX-1150","NX-1142","NX-1121","NX-1117","NX-1115","NX-1114","NX-1113","NX-1112","NX-1105","NX-1103","NX-1098","NX-960","NX-957","NX-955","NX-951","NX-948","NX-947","NX-946","NX-945","NX-944","NX-936","NX-935","NX-933","NX-932","NX-931","NX-930","NX-929","NX-910","NX-909","NX-908","NX-906","NX-905","NX-904","NX-903","NX-902","NX-899","NX-898","NX-895","NX-892","NX-891","NX-890","NX-889","NX-886","NX-884","NX-882","NX-880","NX-852","NX-846","NX-833","NX-831","NX-830","NX-829","NX-828","NX-816","NX-588","NX-575","NX-573","NX-572","NX-569"};
		
		for(int i =0;i<testCases.length;i++)
			{
			r.putRequest("https://flytxt.atlassian.net/rest/api/2/issue/"+testCases[i],"am9lbC5qb3NlQGZseXR4dC5jb206U3BsZW5kZXIuMjc3MQ==", "{\r\n" + 
			
				"   \"fields\": {\r\n" + 
				"       \"customfield_11172\":{\"value\":\"YES\"}\r\n" + 
				"   }\r\n" + 
				"}");
		r.putRequest("https://flytxt.atlassian.net/rest/api/2/issue/"+testCases[i],"am9lbC5qb3NlQGZseXR4dC5jb206U3BsZW5kZXIuMjc3MQ==", "{\r\n" + 
				"   \"fields\": {\r\n" + 
				"       \"customfield_11175\":{\"value\":\"6.0.8.7 GA\"}\r\n" +
				"   }\r\n" + 
				"}");
		r.putRequest("https://flytxt.atlassian.net/rest/api/2/issue/"+testCases[i],"am9lbC5qb3NlQGZseXR4dC5jb206U3BsZW5kZXIuMjc3MQ==", "{\r\n" + 
				"   \"fields\": {\r\n" + 
				"       \"customfield_11174\":{\"name\":\"joel.jose\"}\r\n"+
				"   }\r\n" + 
				"}");
			}
	}

}
