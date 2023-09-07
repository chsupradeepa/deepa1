package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class notification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       //ChromeOptions c=new ChromeOptions();
       WebDriver driver =new EdgeDriver();
       driver.get("http://www.hdfc.com");
       
      // c.addArguments("--disable-notifications");
       //c.addArguments("start-maxmized");
	}

}
