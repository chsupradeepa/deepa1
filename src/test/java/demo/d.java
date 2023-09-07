package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver d=new ChromeDriver();
         d.get("https://demo.actitime.com/login.do");
         d.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
         d.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
         d.findElement(By.id("loginButton")).click();
         
       
          

	}


}
