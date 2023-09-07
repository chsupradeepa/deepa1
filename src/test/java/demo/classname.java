package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              WebDriver s=new ChromeDriver();
              s.get("http://gmail.com/");
              s.findElement(By.className("Gmail")).sendKeys(args);
              s.findElement(By.linkText("Gmail")).click();
              s.findElement(By.partialLinkText("Gm")).click();

              
                            
              
	}

}
