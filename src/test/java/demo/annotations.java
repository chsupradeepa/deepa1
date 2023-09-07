package demo;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class annotations {
	
	 
@BeforeSuite
	public void a1(){
		Reporter.log("====connected to database====",true );
	}
	@BeforeClass
	public void a2(){
		Reporter.log("====open the browser====",true);
	}
	 @BeforeMethod
	public void a3() {
		Reporter.log("====log in to application====",true);
	}

      @Test
    public void a4() {
	Reporter.log("=====boss i am main testcase====",true);
}
    @AfterMethod
   public void a5()
{
	Reporter.log("====log in t application====",true);
}
  @AfterClass 
public void a6()
{
	Reporter.log("====open the browser====",true);
	
}
@AfterSuite 
public void a7()
{
	Reporter.log("====connected to database====",true);
	
}
}
