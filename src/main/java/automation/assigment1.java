package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assigment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver a= new ChromeDriver();
		a.get("https://www.facebook.com/");
        a.findElement(By.id("email")).sendKeys("admin");
        a.findElement(By.name("pass")).sendKeys("deepa");
        a.findElement(By.name("loginButton")).click();

	}

}
