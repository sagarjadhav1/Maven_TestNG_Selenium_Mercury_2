package Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ExcelUtility {
	public static HSSFWorkbook book;
	public static HSSFSheet sheet;
	
	
	
	
	public static void excelInit() throws Exception{
		File f=new File("C:\\Users\\Admin\\Desktop\\5Dec2020\\5Dec2020\\Maven_TestNG_Selenium_Mercury_2\\src\\test\\resources\\testData\\MercuryTestData.xls");
		FileInputStream fis =new FileInputStream(f);
		book=new HSSFWorkbook(fis);
		
		

	}
	public static void getSheet(String sheetName){
		sheet=book.getSheet(sheetName);
	}
	public static int getRowCount(){
		return sheet.getLastRowNum();
	}

	public static String getCellData(int rowNum,int colNum){
		HSSFRow row=sheet.getRow(rowNum);

		HSSFCell cell=row.getCell(colNum);
		cell.setCellType(1);
		return(cell.getStringCellValue());
	}
	public static String getCellData(int rowNum,String colName){
		return getCellData(rowNum,getColumnIndex(colName));
	}
	public static int getColumnIndex(String columnName){
		HSSFRow row=sheet.getRow(0);
		int colIndex=-1;
		int colCnt=row.getLastCellNum();
		for (int i = 0; i < colCnt; i++) {
			String excelColName=row.getCell(i).getStringCellValue();
			if(excelColName.equalsIgnoreCase(columnName)){
				colIndex=i;
				break;
			}
		}
		return colIndex;
	}
	
}
