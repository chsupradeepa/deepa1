package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class maximize {

	public static void main(String[] args) {
WebDriver driver=new EdgeDriver();
driver.get("https://www.meesho.com/");
driver.manage().window().maximize();
driver.close();


	}

}
