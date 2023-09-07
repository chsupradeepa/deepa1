package demo;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getcurrent {

	public static void main(String[] args) {
		WebDriver dam=new EdgeDriver();
		dam.get("https://www.amazon.com/");
		String url=dam.getCurrentUrl();
		System.out.println(url);
	

	}

}
