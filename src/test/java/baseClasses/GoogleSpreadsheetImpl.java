package baseClasses;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.Data;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.AppendValuesResponse;
import com.google.api.services.sheets.v4.model.UpdateValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GoogleSpreadsheetImpl {
    private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "GogoleCredentialTokens";
    private static String SPREADSHEET_ID;
    //= "1WpzKjJUrs4tRBIreEIsZAPkb3QFDmWIlnFRwbTVcMAY";
    /**
     * Global instance of the scopes required by this quickstart.
     * If modifying these scopes, delete your previously saved tokens/ folder.
     */
    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS);
    
    private static final String CREDENTIALS_FILE_PATH = System.getProperty("user.dir")+"\\credentials.json";
    
    private static String range;
    
    static Sheets service;

    /**
     * Creates an authorized Credential object.
     * @param HTTP_TRANSPORT The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */
    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        InputStream in = new FileInputStream(CREDENTIALS_FILE_PATH);
        System.out.println(CREDENTIALS_FILE_PATH);
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }

    
    public static void setSpreadsheet(String id,String sheet) {
    	SPREADSHEET_ID = id;
    	range = sheet;
    }
    
    public Sheets initializeService() throws GeneralSecurityException, IOException {
    	 // Build a new authorized API client service.
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
    	 service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                 .setApplicationName(APPLICATION_NAME)
                 .build();
    	 return service;
    }
    
    public String getCell(int row,int col) throws GeneralSecurityException, IOException {
    	col++;
    	char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    	ValueRange response = service.spreadsheets().values()
                .get(SPREADSHEET_ID, range+"!"+alphabet[row]+col)
                .execute();
        List<List<Object>> values = response.getValues();
        List rowVal = values.get(0);
        System.out.println("Value:"+rowVal.get(0));
        return rowVal.get(0).toString();
    }
    public void setCell(int row,int col,String data) throws IOException, GeneralSecurityException {
    	col++;
    	char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
      List<List<Object>> writeData = new ArrayList<>();
      
          List<Object> dataRow = new ArrayList<>();
          dataRow.add(data);
          writeData.add(dataRow);
      ValueRange vr = new ValueRange().setValues(writeData).setMajorDimension("ROWS");
      service.spreadsheets().values()
              .update(SPREADSHEET_ID, range+"!"+alphabet[row]+col, vr)
              .setValueInputOption("RAW")
              .execute();
    }
    
    
    /**
     * https://docs.google.com/spreadsheets/d/1BxiMVs0XRA5nFMdKvBdBZjgmUUqptlbs74OgvE2upms/edit
     */
    public static void main(String... args) throws IOException, GeneralSecurityException {
    	GoogleSpreadsheetImpl sqs = new GoogleSpreadsheetImpl();
    	sqs.initializeService();
    	sqs.setSpreadsheet("1WpzKjJUrs4tRBIreEIsZAPkb3QFDmWIlnFRwbTVcMAY","Sheet1");
       sqs.getCell(3, 3);
       sqs.setCell(3, 3,"Joel");
       sqs.getCell(3, 3);
    }


}
