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
//		r.getRequest("https://flytxt.atlassian.net/rest/api/2/issue/NX-7116?fields=customfield_11160", "am9lbC5qb3NlQGZseXR4dC5jb206U3BsZW5kZXIuMjc3MQ==");
//		System.out.println(r.responseString);
//		r.putRequest("http://192.168.150.27/neon-ws/broadcastApps","Zmx5b3BzQGZseXR4dC5jb206Zmx5dHh0", "{\"createdDate\":\"2018-07-05T05:28:11.000+0000\",\"updateDate\":\"2018-07-05T05:28:11.000+0000\",\"createdUser\":\"System Administrator\",\"updatedUser\":\"System Administrator\",\"name\":\"seedTrSeedFromCopy\",\"description\":\"Purpose of BC is NOTHING\",\"status\":\"planned\",\"applicationInstanceType\":\"SEEDING_RECURRING_BROADCAST\",\"partnerId\":1,\"activatedDate\":\"2018-07-04T12:35:43.000+0000\",\"deleted\":false,\"hidden\":false,\"message\":null,\"bcLevelCgCount\":null,\"targetCountMap\":null,\"broadcastParameters\":{\"deliverDetails\":{\"timezoneId\":null,\"recurring\":true,\"recurringConfiguration\":{\"recurringRange\":{\"startDate\":\"2018-07-05T12:35:41.680Z\",\"cycleEndDate\":null,\"type\":\"NEVER\",\"endType\":1,\"recurrenceCount\":null,\"timezoneId\":49,\"timezone\":\"Asia/Calcutta\",\"startCycleOnEndOfMonth\":false,\"endCycleOnEndOfMonth\":false},\"recurringPattern\":{\"type\":\"DAILY\",\"recurringInterval\":1,\"startTimeString\":\"18:05\"},\"renderSchedule\":{\"sendImmediately\":true,\"renderTargetAlways\":false,\"type\":null,\"renderScheduleType\":null,\"renderTimeAt\":null,\"renderTimeBefore\":null},\"thisRecurrencePosition\":null},\"broadcastExpirySettings\":{},\"broadcastNotificationList\":[],\"recurringStr\":\"true\",\"startTimeStr\":\"6:05 PM\",\"timezoneObj\":{\"sortOrder\":49,\"description\":\"(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi\",\"gmtOffset\":\"+05:30\",\"javaTimeZoneId\":\"Asia/Calcutta\",\"offset\":19800000}},\"targetDetails\":{\"limitRecipients\":null,\"controlGroupPercentage\":null,\"bcValidationDetails\":{\"cgSelectionMode\":1,\"fixedPercentage\":10,\"confidenceLevel\":null,\"marginOfError\":null},\"dndListIdsToExclude\":[]},\"offerDetails\":{\"trackingDetails\":{\"expirySettings\":{\"trackingEnabled\":true,\"absolute\":false,\"absoluteDate\":null,\"relativeTime\":\"ad5\",\"timeZoneId\":49},\"trackSourceId\":237,\"convertAll\":\"false\",\"rewardAllConversions\":\"false\",\"trackSourceName\":\"A_track_Sel\"},\"routingDetails\":{\"messagingChannel\":\"WAP\",\"broadcastMessageMobileAddressId\":1,\"responseMessageMobileAddressId\":1,\"broadcastMessageRouteId\":1,\"responseMessageRouteId\":1,\"broadcastMessageMobileAddressName\":\"Address-SMPP\",\"responseMessageMobileAddressName\":\"Address-SMPP\"},\"temporalOffers\":[],\"preferredLanguageId\":1},\"timezoneId\":null,\"abortBroadcastsForPreviousRevision\":false},\"operation\":\"ACTIVATE\",\"triggerable\":false,\"sustainabilityPeriod\":null,\"cgValidationEnabled\":false,\"broadcastTriggerList\":null,\"fbAdBudget\":null,\"minDailyFbBudget\":null,\"statusId\":21,\"recurringParentId\":null,\"previousRevisionBroadcastId\":null,\"approvers\":null,\"approverList\":null,\"targetValue\":\"create\",\"labelObj\":{\"createdDate\":\"2014-05-29T13:56:09.000+0000\",\"updateDate\":null,\"createdUser\":\"System Administrator\",\"updatedUser\":null,\"centerName\":\"Crossell\",\"description\":null,\"address1\":null,\"address2\":null,\"address3\":null,\"city\":null,\"county\":null,\"countryId\":null,\"phoneNumber\":null,\"faxNumber\":null,\"emailAddress\":null,\"partnerId\":1},\"inventoryObj\":{\"channelType\":-1,\"inventoryLimit\":-1,\"inventoryName\":\"Unlimited\",\"inventoryPriority\":1,\"isDefault\":false,\"sendingPriority\":2,\"status\":\"active\",\"createdPartnerId\":1,\"sharedPartnerList\":null,\"partnerName\":\"System Global\",\"blackoutRuleName\":\"Black-CG\",\"freqRuleName\":\"Rule-1\"},\"offer\":\"/offers/1681\",\"selectedLanguage\":\"English (UK)\",\"campaignName\":\"campaignBC711\",\"target\":\"http://192.168.150.27/neon-ws/targets/5942\",\"campaign\":\"/campaigns/1060\",\"label\":\"http://192.168.150.27/neon-ws/labels/1001\",\"inventoryDefinition\":\"http://192.168.150.27/neon-ws/partnerInventoryDefinitions/21\",\"registrationList\":\"http://192.168.150.27/neon-ws/registrationLists/845\",\"broadcastTrigger\":null}");
//		r.getRequest("http://192.168.150.27/neon-ws/getNotifications?webUserId=1&partnerId=1", "Zmx5b3BzQGZseXR4dC5jb206Zmx5dHh0");
//		String[] testCases = {"NX-7118","NX-7116","NX-7111","NX-7109","NX-7108","NX-7107","NX-7087","NX-7072","NX-7066","NX-7055","NX-7053","NX-7051","NX-7049","NX-7048","NX-7046","NX-7044","NX-7042","NX-7040","NX-7038","NX-7036","NX-7033","NX-7032","NX-7031","NX-7028","NX-7020","NX-7019","NX-7017","NX-7015","NX-7012","NX-6999","NX-6998","NX-6995","NX-6993","NX-6990","NX-6988","NX-6987","NX-6980","NX-6979","NX-6974","NX-6973","NX-6971","NX-6970","NX-6969","NX-6968","NX-6967","NX-6966","NX-6843","NX-6841","NX-6840","NX-6839","NX-6835","NX-6217","NX-6216","NX-6215","NX-6214","NX-6177","NX-6176","NX-6175","NX-6040","NX-6039","NX-6038","NX-5985","NX-5984","NX-5576","NX-5573","NX-5571","NX-4818","NX-4817","NX-4815","NX-3697","NX-3695","NX-3694","NX-3643","NX-3487","NX-3315","NX-3313","NX-3041","NX-3038","NX-3036","NX-3035","NX-2972","NX-2971","NX-2874","NX-2851","NX-2832","NX-2824","NX-2823","NX-2822","NX-2821","NX-2818","NX-2817","NX-2814","NX-2813","NX-2812","NX-2811","NX-2809","NX-2808","NX-2807","NX-2806","NX-2803","NX-2800","NX-2799","NX-2798","NX-2797","NX-2796","NX-2788","NX-2787","NX-2786","NX-2780","NX-2776","NX-2775","NX-2773","NX-2299","NX-2185","NX-2180","NX-2179","NX-2173","NX-2165","NX-2102","NX-2101","NX-2100","NX-2099","NX-2098","NX-2096","NX-2095","NX-2094","NX-2092","NX-2091","NX-2089","NX-2087","NX-2086","NX-2083","NX-2080","NX-2079","NX-2077","NX-2076","NX-2074","NX-2073","NX-2072","NX-2066","NX-2065","NX-2064","NX-2055","NX-2053","NX-2052","NX-2050","NX-1580","NX-1579","NX-1578","NX-1576","NX-1575","NX-1572","NX-1568","NX-1412","NX-1386","NX-1378","NX-1377","NX-1376","NX-1375","NX-1373","NX-1367","NX-1355","NX-1353","NX-1352","NX-1351","NX-1349","NX-1348","NX-1347","NX-1346","NX-1345","NX-1344","NX-1343","NX-1340","NX-1338","NX-1336","NX-1333","NX-1330","NX-1271","NX-1269","NX-1248","NX-1247","NX-1243","NX-1239","NX-1238","NX-1236","NX-1234","NX-1233","NX-1230","NX-1204","NX-1201","NX-1200","NX-1199","NX-1193","NX-1192","NX-1191","NX-1190","NX-1186","NX-1185","NX-1184","NX-1183","NX-1182","NX-1180","NX-1179","NX-1178","NX-1177","NX-1175","NX-1174","NX-1173","NX-1170","NX-1169","NX-1168","NX-1167","NX-1165","NX-1160","NX-1159","NX-1157","NX-1156","NX-1150","NX-1149","NX-1147","NX-1146","NX-1145","NX-1142","NX-1139","NX-1138","NX-1137","NX-1136","NX-1135","NX-1133","NX-1128","NX-1127","NX-1126","NX-1125","NX-1121","NX-1117","NX-1115","NX-1114","NX-1113","NX-1112","NX-1105","NX-1103","NX-1098","NX-1090","NX-1089","NX-1061","NX-1058","NX-1057","NX-1055","NX-1053","NX-1051","NX-1048","NX-1047","NX-1046","NX-1045","NX-1042","NX-1038","NX-1036","NX-1026","NX-1023","NX-1022","NX-1021","NX-1015","NX-1014","NX-1012","NX-1011","NX-975","NX-960","NX-957","NX-955","NX-951","NX-948","NX-947","NX-946","NX-945","NX-944","NX-936","NX-935","NX-933","NX-932","NX-931","NX-930","NX-929","NX-910","NX-909","NX-908","NX-906","NX-905","NX-904","NX-903","NX-902","NX-899","NX-898","NX-896","NX-895","NX-892","NX-891","NX-890","NX-889","NX-886","NX-885","NX-884","NX-883","NX-882","NX-880","NX-852","NX-846","NX-833","NX-831","NX-830","NX-829","NX-828","NX-816","NX-810","NX-809","NX-808","NX-805","NX-800","NX-790","NX-754","NX-753","NX-752","NX-733","NX-725","NX-724","NX-716","NX-714","NX-713","NX-712","NX-710","NX-709","NX-645","NX-630","NX-613","NX-611","NX-588","NX-575","NX-573","NX-572","NX-569","NX-529","NX-528","NX-518","NX-517","NX-505","NX-464","NX-463","NX-461","NX-459","NX-450","NX-446","NX-445","NX-437","NX-436","NX-435","NX-434","NX-433","NX-432","NX-431","NX-430","NX-429","NX-428","NX-427","NX-426"};
//		
//		for(int i =0;i<testCases.length;i++)
//			{
//			r.putRequest("https://flytxt.atlassian.net/rest/api/2/issue/"+testCases[i],"am9lbC5qb3NlQGZseXR4dC5jb206U3BsZW5kZXIuMjc3MQ==", "{\r\n" + 
//			
//				"   \"fields\": {\r\n" + 
//				"       \"customfield_11172\":{\"value\":\"YES\"}\r\n" + 
//				"   }\r\n" + 
//				"}");
//			System.out.println(testCases[i]+": changed automated status to:");
//			System.err.print("YES");
//		r.putRequest("https://flytxt.atlassian.net/rest/api/2/issue/"+testCases[i],"am9lbC5qb3NlQGZseXR4dC5jb206U3BsZW5kZXIuMjc3MQ==", "{\r\n" + 
//				"   \"fields\": {\r\n" + 
//				"       \"customfield_11175\":{\"value\":\"6.0.8.7 GA\"}\r\n" +
//				"   }\r\n" + 
//				"}");
//		r.putRequest("https://flytxt.atlassian.net/rest/api/2/issue/"+testCases[i],"am9lbC5qb3NlQGZseXR4dC5jb206U3BsZW5kZXIuMjc3MQ==", "{\r\n" + 
//				"   \"fields\": {\r\n" + 
//				"       \"customfield_11174\":{\"name\":\"joel.jose\"}\r\n"+
//				"   }\r\n" + 
//				"}");
//			}
	}

}
