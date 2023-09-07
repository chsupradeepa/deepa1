package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class robotact {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
      WebDriver driver =new EdgeDriver();
   		  
      driver.get("https://www.actitime.com/");
      Robot s=new Robot();
      s.keyPress(KeyEvent.VK_PAGE_DOWN);
      s.keyPress(KeyEvent.VK_PAGE_DOWN);
      Thread.sleep(3000);
      s.keyPress(KeyEvent.VK_PAGE_DOWN);
      Thread.sleep(3000);
      s.keyPress(KeyEvent.VK_PAGE_UP);
    
	}

}
