package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotfilp {

	public static void main(String[] args) throws Throwable {
		
       WebDriver driver= new ChromeDriver();
     driver.get("https://www.flipkart.com/");
       Robot r= new Robot();
       r.keyPress(KeyEvent.VK_PAGE_DOWN);
       r.keyPress(KeyEvent.VK_PAGE_DOWN);
       Thread.sleep(3000);
       r.keyPress(KeyEvent.VK_PAGE_DOWN);
       Thread.sleep(3000);
       r.keyPress(KeyEvent.VK_PAGE_UP);



       
       
	}

}
