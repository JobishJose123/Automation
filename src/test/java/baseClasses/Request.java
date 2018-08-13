package baseClasses;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;

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
		responseString = response.toString();
//		System.out.println(responseString);
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
	public int getRequestWithCookie(String urlStr,String cookie) throws IOException{	
		setUrl(urlStr);
		setGetProperties();
		con.setRequestProperty("Cookie", cookie);
		int responseCode = con.getResponseCode();
		getResponseString();
		return responseCode;	
	}

	public void postRequest(String urlStr, String jobPayload) throws ClientProtocolException, IOException {
		StringEntity entity = new StringEntity(jobPayload,
                ContentType.APPLICATION_JSON);
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost(urlStr);
        request.setHeader("Content-type", "application/json");
        request.setEntity(entity);
        HttpResponse response = httpClient.execute(request);
        System.out.println(response.getStatusLine().getStatusCode());
        System.out.println(response.toString());
	}
	public void postRequestWithCookie(String urlStr, String jobPayload,String cookie) throws ClientProtocolException, IOException {
		StringEntity entity = new StringEntity(jobPayload,
                ContentType.APPLICATION_JSON);
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost(urlStr);
        request.setHeader("Content-type", "application/json");
        request.setHeader("Cookie", cookie);
        request.setEntity(entity);
        HttpResponse response = httpClient.execute(request);
        System.out.println(response.getStatusLine().getStatusCode());
        System.out.println(response.toString());
	}
	public void postRequest_payload(String urlStr, String jobPayload) throws ClientProtocolException, IOException {
		final String USER_AGENT = "Mozilla/5.0";
//		String url = "http://192.168.150.27/neon-ws/login";
		URL obj = new URL(urlStr);
//		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
		con = (HttpURLConnection) obj.openConnection();
		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("accept", "application/json");
//		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = jobPayload ;//"username=flyops%40flytxt.com&password=flytxt&remember-me=false";
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
//		System.out.println("\nSending 'POST' request to URL : " + url);
//		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);
		getResponseString();
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
	public void putRequest(String urlStr,String data) throws IOException{
		Random random = new Random();
		setUrl(urlStr);
		setPutProperties();
		OutputStreamWriter osw = new OutputStreamWriter(con.getOutputStream());
		osw.write(String.format(data, random.nextInt(30), random.nextInt(20)));
		osw.flush();
		osw.close();
		System.err.println(con.getResponseCode());
	}
	public static void postRequest() throws ClientProtocolException, IOException {
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW");
		RequestBody body = RequestBody.create(mediaType, "------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"username\"\r\n\r\nflyops@flytxt.com\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"password\"\r\n\r\nflytxt\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"remember-me\"\r\n\r\nfalse\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW--");
		okhttp3.Request request = new okhttp3.Request.Builder()
		  .url("http://192.168.150.27/neon-ws/login")
		  .post(body)
		  .addHeader("content-type", "multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW")
		  .addHeader("connection", "keep-alive")
		  .addHeader("cache-control", "no-cache")
		  .addHeader("postman-token", "2a7612bf-90fa-38db-2928-75badad80e38")
		  .build();

		Response response = client.newCall(request).execute();
		System.out.println(response.header("Set-Cookie"));
		

	}
	public List<String> getCookies(){
		List<String> cookies = con.getHeaderFields().get("Set-Cookie");
		return cookies;
	}
	public static void main(String[] args) throws IOException {
		Request r = new Request();
//		postRequest();
//		r.getRequest("https://flytxt.atlassian.net/rest/api/2/issue/NX-7116?fields=customfield_11160", "am9lbC5qb3NlQGZseXR4dC5jb206U3BsZW5kZXIuMjc3MQ==");
//		System.out.println(r.responseString);
//		r.putRequest("http://192.168.150.27/neon-ws/broadcastApps","Zmx5b3BzQGZseXR4dC5jb206Zmx5dHh0", "{\"createdDate\":\"2018-07-05T05:28:11.000+0000\",\"updateDate\":\"2018-07-05T05:28:11.000+0000\",\"createdUser\":\"System Administrator\",\"updatedUser\":\"System Administrator\",\"name\":\"seedTrSeedFromCopy\",\"description\":\"Purpose of BC is NOTHING\",\"status\":\"planned\",\"applicationInstanceType\":\"SEEDING_RECURRING_BROADCAST\",\"partnerId\":1,\"activatedDate\":\"2018-07-04T12:35:43.000+0000\",\"deleted\":false,\"hidden\":false,\"message\":null,\"bcLevelCgCount\":null,\"targetCountMap\":null,\"broadcastParameters\":{\"deliverDetails\":{\"timezoneId\":null,\"recurring\":true,\"recurringConfiguration\":{\"recurringRange\":{\"startDate\":\"2018-07-05T12:35:41.680Z\",\"cycleEndDate\":null,\"type\":\"NEVER\",\"endType\":1,\"recurrenceCount\":null,\"timezoneId\":49,\"timezone\":\"Asia/Calcutta\",\"startCycleOnEndOfMonth\":false,\"endCycleOnEndOfMonth\":false},\"recurringPattern\":{\"type\":\"DAILY\",\"recurringInterval\":1,\"startTimeString\":\"18:05\"},\"renderSchedule\":{\"sendImmediately\":true,\"renderTargetAlways\":false,\"type\":null,\"renderScheduleType\":null,\"renderTimeAt\":null,\"renderTimeBefore\":null},\"thisRecurrencePosition\":null},\"broadcastExpirySettings\":{},\"broadcastNotificationList\":[],\"recurringStr\":\"true\",\"startTimeStr\":\"6:05 PM\",\"timezoneObj\":{\"sortOrder\":49,\"description\":\"(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi\",\"gmtOffset\":\"+05:30\",\"javaTimeZoneId\":\"Asia/Calcutta\",\"offset\":19800000}},\"targetDetails\":{\"limitRecipients\":null,\"controlGroupPercentage\":null,\"bcValidationDetails\":{\"cgSelectionMode\":1,\"fixedPercentage\":10,\"confidenceLevel\":null,\"marginOfError\":null},\"dndListIdsToExclude\":[]},\"offerDetails\":{\"trackingDetails\":{\"expirySettings\":{\"trackingEnabled\":true,\"absolute\":false,\"absoluteDate\":null,\"relativeTime\":\"ad5\",\"timeZoneId\":49},\"trackSourceId\":237,\"convertAll\":\"false\",\"rewardAllConversions\":\"false\",\"trackSourceName\":\"A_track_Sel\"},\"routingDetails\":{\"messagingChannel\":\"WAP\",\"broadcastMessageMobileAddressId\":1,\"responseMessageMobileAddressId\":1,\"broadcastMessageRouteId\":1,\"responseMessageRouteId\":1,\"broadcastMessageMobileAddressName\":\"Address-SMPP\",\"responseMessageMobileAddressName\":\"Address-SMPP\"},\"temporalOffers\":[],\"preferredLanguageId\":1},\"timezoneId\":null,\"abortBroadcastsForPreviousRevision\":false},\"operation\":\"ACTIVATE\",\"triggerable\":false,\"sustainabilityPeriod\":null,\"cgValidationEnabled\":false,\"broadcastTriggerList\":null,\"fbAdBudget\":null,\"minDailyFbBudget\":null,\"statusId\":21,\"recurringParentId\":null,\"previousRevisionBroadcastId\":null,\"approvers\":null,\"approverList\":null,\"targetValue\":\"create\",\"labelObj\":{\"createdDate\":\"2014-05-29T13:56:09.000+0000\",\"updateDate\":null,\"createdUser\":\"System Administrator\",\"updatedUser\":null,\"centerName\":\"Crossell\",\"description\":null,\"address1\":null,\"address2\":null,\"address3\":null,\"city\":null,\"county\":null,\"countryId\":null,\"phoneNumber\":null,\"faxNumber\":null,\"emailAddress\":null,\"partnerId\":1},\"inventoryObj\":{\"channelType\":-1,\"inventoryLimit\":-1,\"inventoryName\":\"Unlimited\",\"inventoryPriority\":1,\"isDefault\":false,\"sendingPriority\":2,\"status\":\"active\",\"createdPartnerId\":1,\"sharedPartnerList\":null,\"partnerName\":\"System Global\",\"blackoutRuleName\":\"Black-CG\",\"freqRuleName\":\"Rule-1\"},\"offer\":\"/offers/1681\",\"selectedLanguage\":\"English (UK)\",\"campaignName\":\"campaignBC711\",\"target\":\"http://192.168.150.27/neon-ws/targets/5942\",\"campaign\":\"/campaigns/1060\",\"label\":\"http://192.168.150.27/neon-ws/labels/1001\",\"inventoryDefinition\":\"http://192.168.150.27/neon-ws/partnerInventoryDefinitions/21\",\"registrationList\":\"http://192.168.150.27/neon-ws/registrationLists/845\",\"broadcastTrigger\":null}");
//		r.getRequest("http://192.168.150.27/neon-ws/getNotifications?webUserId=1&partnerId=1", "Zmx5b3BzQGZseXR4dC5jb206Zmx5dHh0");
//		String[] testCases = {"NX-4858","NX-2533","NX-7592","NX-643","NX-640","NX-633","NX-1219","NX-7593","NX-9260","NX-8248","NX-8244","NX-8243","NX-8223","NX-8150","NX-7595","NX-7594","NX-7585","NX-7584","NX-7337","NX-7141","NX-7140","NX-6911","NX-6903","NX-6902","NX-6901","NX-6900","NX-6893","NX-6892","NX-6887","NX-6886","NX-6885","NX-6884","NX-6883","NX-6882","NX-6881","NX-6880","NX-6879","NX-6878","NX-6871","NX-6867","NX-6864","NX-2516","NX-1503","NX-1220","NX-743","NX-738","NX-693","NX-687","NX-685","NX-683","NX-639"};
		
		
//		String[] testCases = {};
//		for(int i =0;i<testCases.length;i++)
//			{
//			r.putRequest("https://flytxt.atlassian.net/rest/api/2/issue/"+testCases[i],"am9lbC5qb3NlQGZseXR4dC5jb206U3BsZW5kZXIuMjc3MQ==", "{\r\n" + 
//			
//				"   \"fields\": {\r\n" + 
//				"       \"customfield_11172\":{\"value\":\"NO\"}\r\n" + 
//				"   }\r\n" + 
//				"}");
//			System.out.println(testCases[i]+": changed automated status to:");
//			System.err.print("YES");
//		r.putRequest("https://flytxt.atlassian.net/rest/api/2/issue/"+testCases[i],"am9lbC5qb3NlQGZseXR4dC5jb206U3BsZW5kZXIuMjc3MQ==", "{\r\n" + 
//				"   \"fields\": {\r\n" + 
//				"       \"customfield_11175\":{\"value\":\"6.1 GA\"}\r\n" +
//				"   }\r\n" + 
//				"}");
//		r.putRequest("https://flytxt.atlassian.net/rest/api/2/issue/"+testCases[i],"am9lbC5qb3NlQGZseXR4dC5jb206U3BsZW5kZXIuMjc3MQ==", "{\r\n" + 
//				"   \"fields\": {\r\n" + 
//				"       \"customfield_11174\":{\"name\":\"rahul.krishnan\"}\r\n"+
//				"   }\r\n" + 
//				"}");
//			}
		
		r.getRequest("http://192.168.150.253/dk-new/jobs?projection=jobView&page=0&size=50&name=selenium_list", "dcdcdc");
		System.out.println(r.responseString);
		JsonParser jsonParser = new JsonFactory().createParser(r.responseString);
		while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
			   //get the current token
			   String fieldname = jsonParser.getCurrentName();
			   if ("name".equals(fieldname)) {
			      //move to next token
			      jsonParser.nextToken();
			      System.out.println(jsonParser.getText());        	 
			   }
		
		}
	}

}
