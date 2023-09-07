package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshootama {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.amazon.com/");
      TakesScreenshot ts =(TakesScreenshot)driver;
      File src= ts.getScreenshotAs(OutputType.FILE);
      File desc=new File("C:\\Users\\supra\\OneDrive\\Desktop\\screenshot\\Google page.png");
      Files.copy(src, desc);
      
	}

}
