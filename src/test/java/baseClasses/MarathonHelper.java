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
	 * 
	 * 
	 * 
	 * 
	 */

	//////////////////////SCALE CONTAINER///////////////////////////////////////
	public static void scaleContainer(String env,String container,String instance) throws IOException {
		Request r = new Request();
		String data = "{\"instances\":"+instance+"}";
		r.putRequest("http://"+env+":8080/v2/apps//"+container+"?embed=app.taskStats&embed=app.readiness", "Zmx5dXNlcjpmbHlwYXNzV09SRA==", data);
	}
	
	////////////////////////GET MARATHON CONTAINER STATUS///////////////////////////////////////
	public static int getContainerStatus(String env,String container) throws IOException {
		Request r = new Request();
		r.getRequest("http://"+env+":8080/v2/apps//"+container+"?embed=app.taskStats&embed=app.readiness", "Zmx5dXNlcjpmbHlwYXNzV09SRA==");
		String JSONStr = r.responseString;
		int runIndexbeg = JSONStr.indexOf("tasksRunning");
		int runIndexend = JSONStr.indexOf(",\"tasksHealthy");
		String instances = JSONStr.substring(runIndexbeg, runIndexend);
		String[] num = instances.split(":");
		int n = Integer.parseInt(num[1]);
		return n;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		scaleContainer("192.168.150.27","neon/apps/platform/dfe","1");
		System.out.println(getContainerStatus("192.168.150.27","neon/apps/platform/dfe"));
		
	}
}
