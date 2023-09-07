package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Z {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\supra\\OneDrive\\Documents\\excelsheetbook.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
	
}
}
