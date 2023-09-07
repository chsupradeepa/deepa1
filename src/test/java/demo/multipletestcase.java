package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class multipletestcase {
	 @Test
	 public void w1()
	 {
		 Reporter.log("boss i am testcase1 ");
	 }
	 @Test
	 public void w2()
	 {
		 Reporter.log("boss i am testcase2",true);
	 }
	 @Test 
	 public void w3() {
		 Reporter.log("boss i am testcase",true);
	 
	 
		 
	 }
		 
		 

	}


