package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class css {
	public static void main(String[] args) {
		
	
	WebDriver c=new EdgeDriver();
	c.get("https://demo.actitime.com/login.do");
    c.findElement(By.id("username")).sendKeys("admin");
    c.findElement(By.name("pwd")).sendKeys("manager");
    c.findElement(By.id("loginButton")).click();
     

}
}



