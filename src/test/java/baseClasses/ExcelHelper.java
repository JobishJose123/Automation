package baseClasses;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
    	return sh.getPhysicalNumberOfRows();
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
}
