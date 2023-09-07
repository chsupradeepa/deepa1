package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.com/");
	Thread.sleep(3000);
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().forward();
	}

}
