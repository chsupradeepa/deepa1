package demo;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class numberexcel {
 public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\supra\\OneDrive\\Documents\\vyshu.xlsx");
       Workbook wb=WorkbookFactory.create(fis);
	 double data=wb.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
	 System.out.println(data);
	 
}
}
