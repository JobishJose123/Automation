
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import baseClasses.GoogleSpreadsheet;


public class Spreadsheet_Read {
	public static void main(String args[]) throws IOException {
		GoogleSpreadsheet sheetAPI = new GoogleSpreadsheet();
		String id = "1JWEKYeXojSK2BRGRU6TodrBJ5he1JYwwEJHTDSjUAmU";
		String range= "Sheet1!A1:B1";
		List<List<Object>> value = sheetAPI.getSpreadSheetRecords(id,range);
	}

}
