package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.get("https://demo.actitime.com/login.do");
      driver.manage().window().maximize();
      driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	}

}
