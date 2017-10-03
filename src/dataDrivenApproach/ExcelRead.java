package dataDrivenApproach;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static XSSFWorkbook workbook;
	
	public static XSSFSheet sheet;
	
	public static XSSFCell cell;
	
	public static void setExcelFile(String path, String sheetname) throws Exception
	{
		File file = new File(path); // open the excel sheet under the path
	    
	    FileInputStream inputStream = new FileInputStream(file); // to read the data from the excel sheet
	    
	    workbook = new XSSFWorkbook(inputStream);
	    
	    sheet = workbook.getSheet(sheetname); // getting the sheet from the excel file
	}
	
	public static String getCellData(int rownum, int colnum) throws Exception
	{
		return sheet.getRow(rownum).getCell(colnum).getStringCellValue();
	    
	}

}
