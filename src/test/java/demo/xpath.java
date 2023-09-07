
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		
            WebDriver s=new ChromeDriver();
            s.get("https://demo.actitime.com/login.do");
            s.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
            s.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
            s.findElement(By.xpath("//a[@id='loginButton']")).click();

	}	

}
