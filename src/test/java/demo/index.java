package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           WebDriver driver =new ChromeDriver();
           driver.get("https://demo.actitime.com/login.do");
           driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
           driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
           driver.findElement(By.xpath("(//a)[1]")).click();
	}

}
