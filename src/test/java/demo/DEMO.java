package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		d.findElement(By.xpath("//div [contains(text(),'Login ')]")).click();
	}

}
