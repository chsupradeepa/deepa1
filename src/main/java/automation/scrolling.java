package automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class scrolling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.amazon.in/");
      //move the control javascript executor
      JavascriptExecutor jse=(JavascriptExecutor)driver;
      jse.executeScript("window.scrollBy(0,4000);");//down scrolling
      Thread.sleep(3000);
      jse.executeScript("window.scrollBy(0,-2000);");// up scrolling
      
      }

}
