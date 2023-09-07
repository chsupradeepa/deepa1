package batchexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example1 {
  @Test
  public void s1()
  {
	  Reporter.log(" i am test case1");
  }
  public void s2()
  {
	  Reporter.log(" i am test case2");
  }
  public void s3()
  {
	  Reporter.log("i am test case3");
	  
  }
}
