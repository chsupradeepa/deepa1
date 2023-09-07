package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class maxmin {

	public static void main(String[] args) throws Throwable {
			WebDriver driver= new EdgeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.manage().window().minimize();
			driver.close();
	}

}
