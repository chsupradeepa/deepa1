import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {
public static void main(String[] args) {
	WebDriver c=new ChromeDriver();
	c.get("https://demo.actitime.com/login.do");
    d.findElement(By.id("username")).sendKeys("admin");
    d.findElement(By.name("pwd")).sendKeys("manager");
    d.findElement(By.id("loginButton")).click();
     

}
}
