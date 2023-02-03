package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount=5)
  public void myTest() 
  {
	  Reporter.log("My Test is Running", true);
  }
  
 @BeforeMethod
 public void beforeMethod()
 {
	 Reporter.log("Berore Method is Running", true);
 }
 
 @AfterMethod
 public void afterMethod()
 {
	 Reporter.log("After method is running", true);
 }
  
  
  
}
