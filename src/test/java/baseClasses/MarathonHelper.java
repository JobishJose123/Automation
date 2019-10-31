package baseClasses;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import org.apache.commons.codec.binary.Base64;

public class MarathonHelper {
	
	/*
	 *  env = 192.168.150.45
	 *	container = neon/apps/platform/dfe
	 *___________________________________________________
	 *
	 *  EXAMPLE
	 *  scaleContainer("192.168.150.27","neon/apps/platform/dfe","1");
	 *  System.out.println(getContainerStatus("192.168.150.27","neon/apps/platform/dfe"));
	 * 
	 * 
	 * 
	 */

	//////////////////////SCALE CONTAINER///////////////////////////////////////
	public void scaleContainer(String env,String container,String instance) throws IOException, InterruptedException {
		Request r = new Request();
		String data = "{\"instances\":"+instance+"}";
		r.putRequest("http://"+env+":8080/v2/apps//"+container+"?embed=app.taskStats&embed=app.readiness", "Zmx5dXNlcjpmbHlwYXNzV09SRA==", data);  //Container path .Base64 format 
		while(getContainerStatus(env,container)!=Integer.parseInt(instance)){
			Thread.sleep(3000);
			System.out.println("waiting for scaling");
		}
		Thread.sleep(5000);
	}
	
	////////////////////////GET MARATHON CONTAINER STATUS///////////////////////////////////////
	public int getContainerStatus(String env,String container) throws IOException {
		String JSONStr = getJson(env, container);
		 System.out.println(JSONStr);
		int runIndexbeg = JSONStr.indexOf("tasksRunning");
		int runIndexend = JSONStr.indexOf(",\"tasksHealthy");
		String instances = JSONStr.substring(runIndexbeg, runIndexend);
		String[] num = instances.split(":");
		int n = Integer.parseInt(num[1]);
		return n;
	}
	
	////////////////////////GET MARATHON CONTAINER NODE///////////////////////////////////////
	public String getContainerNode(String env,String container) throws IOException {
	String JSONStr = getJson(env, container);
	System.out.println(JSONStr);
	int runIndexbeg = JSONStr.indexOf("\"host\"");
	JSONStr = JSONStr.substring(runIndexbeg, JSONStr.length()-1);
	int runIndexend = JSONStr.indexOf(".flytxt.com");
	String node = JSONStr.substring(8, runIndexend);
	System.out.println("node is "+node);
//	node = parseEnv(node);
	return node;
	}
	
	public String parseEnv(String name) {
//		System.out.println((name));
		StringBuilder ip = new StringBuilder();
		int n = 0;
		if(name.contains("qaenv06")) {
			ip.append("192.168.150");
			if(name.contains("node")) {
				int nodeIndex = name.indexOf(".");
				n = Integer.parseInt(name.substring(4, nodeIndex));
				n += 206;
				System.out.println(n);
			}
			else
				n = 210;
		}
		ip.append("."+n);
		return ip.toString();
	}
	
	////////////////////////GET MARATHON CONTAINER port///////////////////////////////////////
	public String getContainerPort(String env,String container) throws IOException {
	String JSONStr = getJson(env, container);
	System.out.println(JSONStr);
	int runIndexbeg = JSONStr.indexOf("\"TASK_RUNNING\",\"ports\":[");
	JSONStr = JSONStr.substring(runIndexbeg+24, JSONStr.length()-1);
//	System.out.println(JSONStr);
	int runIndexend = JSONStr.indexOf(",");
	String port = JSONStr.substring(0, runIndexend);
	port = port;
	return port;
	}
	
	public String getJson(String env,String container) throws IOException {
		Request r = new Request();
		r.getRequest("http://"+env+":8080/v2/apps//"+container+"?embed=app.taskStats&embed=app.readiness", "Zmx5dXNlcjpmbHlwYXNzV09SRA=="); 
		String JSONStr = r.responseString;
		return JSONStr;
	}
	
	
	public static void main(String args[]) throws IOException, InterruptedException {
		  
		  MarathonHelper m = new MarathonHelper();
		  PropHandler p = new PropHandler();
		  p.setPropertyFile("config.properties");
		  m.scaleContainer(p.getValue("env"), p.getValue("api-server"),"1");
//		  System.out.println(m.getContainerStatus("192.168.150.207", "neon/apps/platform/api-server"));
//		  System.out.println(m.getContainerNode(p.getValue("env"), p.getValue("api-server")));
//		  m.scaleContainer("192.168.150.27", "neon/apps/dk/tp-ws","0");
//		  System.out.println(m.getContainerPort(p.getValue("env"), p.getValue("api-server")));
		 }
}
