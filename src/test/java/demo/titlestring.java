package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class titlestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver f=new EdgeDriver();
      f.get("https://www.amazon.com/");
      String tit=f.getTitle();
      System.out.println(tit);
      
      
      }

}
