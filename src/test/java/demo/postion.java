package demo;

import java.sql.Driver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class postion {

	public static void main(String[] args) {
		WebDriver e=new ChromeDriver();
		e.get("https://www.amazon.com/");
		Point t=new Point(300, 400);
		e.manage().window().setPosition(t);
		

	}

}
