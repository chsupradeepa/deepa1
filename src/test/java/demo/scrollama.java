package demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollama {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.in/");
       JavascriptExecutor jse=(JavascriptExecutor)driver;
       jse.executeScript("window.scrollBy(0,4000)");
       Thread.sleep(3000);
       jse.executeScript("window.scrollBy(0,-4000)");
       
	}

}
