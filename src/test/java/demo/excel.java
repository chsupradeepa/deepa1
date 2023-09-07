package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.formula.WorkbookEvaluator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
     FileInputStream fis = new FileInputStream("C:\\Users\\supra\\OneDrive\\Documents\\Supra.xlsx");
     Workbook wb=WorkbookFactory.create(fis);
    Sheet sh = wb.getSheet("Sheet1");
     String data=sh.getRow(0).getCell(0).getStringCellValue();
    System.out.println(data);
    
	}

}
