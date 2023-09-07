package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.facebook.com/");
         driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
         Thread.sleep(3000);
         WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
         Thread.sleep(3000);
         Select s=new Select(year);
         Thread.sleep(3000);
         s.selectByVisibleText("2000");
         WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
         Select s1=new Select(date);
         s1.selectByValue("2");
         WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
         Select s2=new Select(month);
         s2.selectByVisibleText("Jun");
        
        
       
	}

}

