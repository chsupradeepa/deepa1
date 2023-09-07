package demo;



	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class nn1 {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\supra\\OneDrive\\Documents\\b3.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		double data=wb.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
		System.out.println(data);
	}
	}



