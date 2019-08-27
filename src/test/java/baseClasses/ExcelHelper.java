package baseClasses;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelHelper {
Sheet sh = null;
FileInputStream inputFile = null;
Workbook workbook = new HSSFWorkbook();
String file = "";	
	
    public void setExcelFile(String filename, String sheet)
    {
		try {
			workbook = new HSSFWorkbook(new FileInputStream(new File("ExcelFiles\\"+filename+".xls")));
			file = "ExcelFiles\\"+filename+".xls";
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			sh = workbook.getSheet(sheet);
		
    }
    public void setCsvFile(String filename) throws IOException
    {
    	String line = "";
    	BufferedReader br = new BufferedReader(new FileReader("ExcelFiles\\"+filename+".csv"));
		line = br.readLine();
		line = br.readLine();
		System.out.println(line);
		String[] msisdn = line.split(",");		
    }
    public void setCell(int r,int c,String val) throws IOException{
    	Row row = sh.getRow(r);
    	Cell cell = null;
        	cell = row.getCell(c);  
        	cell.setCellType(Cell.CELL_TYPE_STRING);
        
        cell.setCellValue(val);
        FileOutputStream outFile =new FileOutputStream(new File(file));  //Creating new file
        workbook.write(outFile);   //printing the data in the new file
        outFile.close();           //closing the new file
    }
    public void setCell(int r,String colName,String val) throws IOException{
    	int c = getColumnNumber(colName);
    	setCell(r, c, val);
    }
    public void setCell(String colName,String val) throws IOException{
    	int c = getColumnNumber(colName);
    	setCell(1, c, val);
    }
	public CharSequence getCell(int row,int col){
		CharSequence CellGetContent = "";
	if(sh.getRow(row).getCell(col).getCellType()==Cell.CELL_TYPE_STRING)
	{
    
		CellGetContent = sh.getRow(row).getCell(col).toString();
    
	}
	else if(sh.getRow(row).getCell(col).getCellType()==Cell.CELL_TYPE_NUMERIC)
	{
		double num = sh.getRow(row).getCell(col).getNumericCellValue();
		int n = (int)num;
		CellGetContent = String.valueOf(n);
	}
    return CellGetContent;
    }
	public String getCell(int row,String colName){
		int col = getColumnNumber(colName);
		return getCell(row, col).toString();
    }
	public String getCellByColumnName(String colName){
		int col = getColumnNumber(colName);
		return getCell(1, col).toString();
    }
    public int numRows()
    {
    	return sh.getLastRowNum();
    }
    public int numCols()
    {
    	return sh.getRow(0).getPhysicalNumberOfCells();
    }
    public int getColumnNumber(String columnName) {
    	int colNum = 800;
    	for(int i=0;i<numCols();i++) {
    		if(getCell(0, i).toString().contentEquals(columnName))
    		{
    			colNum = i;
    			break;
    		}	
    	}
		return colNum;
    }
 
    public void addCells(int r, int c, String Data) throws Exception {
    	Row row = sh.createRow(r);
    	Cell cell = row.createCell(c);
    	cell.getCellTypeEnum();
    	cell.setCellValue(Data);
    	FileOutputStream outFile =new FileOutputStream(new File(file));  //Creating new file
        workbook.write(outFile);   //printing the data in the new file
        outFile.close(); 
    }
    
    /**
     * 
     * @param parllelRunSheet
     * @param bcName
     * @param campaignName
     * @param camapignCategoryName
     * @param offerName
     * @param condition
     * @param inventory
     * @param description
     * @param bcType
     * @param bcSheet
     * @throws Exception
     * @Discription: To store the Data into Excel 
     */
    public void addDataToParllelSheet(String parllelRunSheet, String bcName, String campaignName,String camapignCategoryName,String offerName,String condition,String inventory,String description, String bcType, String bcSheet) throws Exception {
    	setExcelFile("bcInputData",bcSheet);
    	String startdate=sh.getRow(1).getCell(11).toString();
    	
    	setExcelFile("parallelRunBC", parllelRunSheet);
    	int countrows=sh.getLastRowNum()-sh.getFirstRowNum();
    	Row newrow=sh.createRow(countrows+1);
    	Cell cell;
    	if(newrow.getLastCellNum()==-1) {
    		
            cell=newrow.createCell(0); 
			cell.setCellValue("Broadcast");
			
			cell=newrow.createCell(1);
			cell.setCellValue(bcName);
			
			cell=newrow.createCell(2);
			cell.setCellValue(description);
			
			CalenderUtility cu = new CalenderUtility();
			cell=newrow.createCell(3);
//			cell.setCellValue(cu.getCurrentDate("dd MMM YYYY hh:mm aaa z"));
			cell.setCellValue(startdate);
			
			cell=newrow.createCell(4);
			cell.setCellValue(camapignCategoryName);
			
			cell=newrow.createCell(5);
			cell.setCellValue(campaignName);
			
			cell=newrow.createCell(6);
			cell.setCellValue(offerName);
			
			cell=newrow.createCell(7);
			cell.setCellValue(inventory);
			
			cell=newrow.createCell(8);
			cell.setCellValue(bcType);
			
			cell=newrow.createCell(9);
			cell.setCellValue(bcSheet);
			
			cell=newrow.createCell(10);
			cell.setCellValue(condition);
    	}

    	FileOutputStream outFile =new FileOutputStream(new File(file));  //Creating new file
        workbook.write(outFile);   //printing the data in the new file
        outFile.close();
        Thread.sleep(1000);
    	
    }
    
    
    public LinkedHashMap<String, String> extractDataFromExcelFile(String sheet,String bcColName, String collName) throws Exception {
    	setExcelFile("parallelRunBC", sheet);
		 int countrows=sh.getLastRowNum()-sh.getFirstRowNum();
		 System.out.println(countrows);
		 //int coll=1;
		 //ArrayList<String> al=new ArrayList<String>();
		int Coll1= getColumnNumber(bcColName);
		int Coll2=getColumnNumber(collName);
		 LinkedHashMap<String,String> lhm=new LinkedHashMap<String,String>(); 
		 for(int i=1;i<=countrows;i++) {
          lhm.put((sh.getRow(i).getCell(Coll1)).toString(),(sh.getRow(i).getCell(Coll2)).toString());

		 }
		
		 return lhm;
	}
	
	
    /****
     * 
     * @author mallikharjuna.ankem
     * @param args parllelworkbook: parllelRunBC, sheet: parllelRunBC, status: we are taken from UI and inserted here
     * @throws Exception 
     * @Discreption: when data available in excel we insert the data dynamically into last row
     */
	public void insertLastColumnValues(String parllelworkbook, String sheet, String status,String bcname, String searchcolumn,String writeColumn) throws Exception {
		setExcelFile(parllelworkbook, sheet);
		int countrows = sh.getLastRowNum() - sh.getFirstRowNum();
		//int columncount = sh.getRow(1).getLastCellNum();
		//System.out.println(columncount);
		int getCellNumber=getColumnNumber(searchcolumn);
		int columnNumber = getColumnNumber(writeColumn);
		System.out.println("searchcolumn number "+ getCellNumber);
		System.out.println("writeColumn  number "+ columnNumber);
		for(int row=1;row<=countrows;row++) {
			
			if(sh.getRow(row).getCell(getCellNumber).toString().contentEquals(bcname)){
				
					System.out.println("enter data to excel");
			if(sh.getRow(row).getCell(columnNumber)==null){
			     Cell column = sh.getRow(row).createCell(columnNumber);
			     //column.getCellTypeEnum();
			      column.setCellValue(status);
			      }else {
						sh.getRow(row).getCell(columnNumber).setCellValue(status);
					}
			
			 
			}//outer if
		
		}//for
		
		
		
		FileOutputStream outFile =new FileOutputStream(new File(file));  //Creating new file
        workbook.write(outFile);   //printing the data in the new file
        outFile.close();
        Thread.sleep(1000);

	}//method
	
	/**
	 * @author mallikharjuna.ankem
	 * @param workBook
	 * @param filename
	 * @return ArrayList
	 * @throws IOException
	 * @Description: To read the excel data and Stored into ArrayList
	 */
	public ArrayList<ArrayList<String>> readTheDataFromExcel(String workBook,String filename) throws IOException {

		File file = new File("ExcelFiles\\" + workBook + ".xls");
		FileInputStream fis = new FileInputStream(file);
		workbook = new HSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(filename);
		// System.out.println(sheet.getRow(1).getCell(1).toString());
		int numberofrows = sheet.getLastRowNum() - sheet.getFirstRowNum();
		int numberofcolumns = sheet.getRow(1).getLastCellNum();
		System.out.println(numberofrows + " " + numberofcolumns);
		ArrayList<ArrayList<String>> outerList = new ArrayList<ArrayList<String>>();
		String val = null;
		for (int i = 1; i <= numberofrows; i++) {
			ArrayList<String> innerList = new ArrayList<String>();
			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {

				val = sheet.getRow(i).getCell(j).toString();
				//System.out.println(val);
				innerList.add(val);
			}
			// Adding inner list to outer list
			outerList.add(i - 1, innerList);
		}

		return outerList;
		
	}
	
	 public void insertDynamicData(String Workbook, String sheet, String result) throws Exception {
	    	
	    	
	    	
	    	setExcelFile(Workbook, sheet);
	    	int countrows=sh.getLastRowNum()-sh.getFirstRowNum();
	    	Row newrow=sh.createRow(countrows+1);
	    	int colnumber=numCols();
	    	Cell cell;
	    	if(newrow.getLastCellNum()==-1) {
	    	cell=newrow.createCell(0);
	    	cell.setCellValue(result);
	    	
	    	CalenderUtility cu = new CalenderUtility();
			cell=newrow.createCell(2);
			cell.setCellValue(cu.getCurrentDate("dd MMM YYYY hh:mm aaa z"));
	    	
	    	}
	    	FileOutputStream outFile =new FileOutputStream(new File(file));  //Creating new file
	        workbook.write(outFile);   //printing the data in the new file
	        outFile.close();
	        Thread.sleep(1000);
	    }


	
    
    
    public static void main(String args[]) {
    	
    	ExcelHelper eh = new ExcelHelper();
    	eh.setExcelFile("touchpointInputData", "apiTouchpointUR");
 		String name = (String) eh.getCell(1, 0);
	  System.out.println(name);//+eh.getCellByColumnName("Application Type")+eh.getCellByColumnName("Event For Tracking")+eh.getCellByColumnName("Refresh  Every")+eh.getCellByColumnName("Time Interval")+eh.getCellByColumnName("Prioritization Logic")+eh.getCellByColumnName("Maximum Offers"));
	  
	  
    }
}
