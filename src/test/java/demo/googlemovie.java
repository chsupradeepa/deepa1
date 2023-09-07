package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlemovie {

	public static void main(String[] args) {
		// TODO    Auto-generated method stu
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.google.com/");
      driver.findElement(By.xpath("//div[@class='SDkEP']")).sendKeys("movie review");
      
      
	}

}
