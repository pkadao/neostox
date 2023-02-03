package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTesting {
  @Test
  public void A() 
  {
	  Reporter.log("TC A is Running", true);
  }
  @Test
  public void B() 
  {
	 // Assert.fail();
	  Reporter.log("TC B is Running", true);
  }
  @Test//(dependsOnMethods="B")
  public void C() 
  {
	  Reporter.log("TC C is Running", true);
  }
  
}
