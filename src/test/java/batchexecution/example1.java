package batchexecution;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example1 {
  @Test
  public void s1()
  {
	  Reporter.log(" i am test case1",true);
Assert.fail();
  }
  @Test
  public void s2()
  {
	  Reporter.log(" i am test case2",true);
  }
  @Test
  public void s3()
  {
	  Reporter.log("i am test case3",true);
	  
  }
}
