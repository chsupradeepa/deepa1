package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver s=new EdgeDriver();
 s.get("https://www.amazon.com");
 System.out.println(s.getTitle());
	}

}
