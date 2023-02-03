package TestNGAnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import  org.testng.annotations.Test;

public class BeforeClassUse {
  @Test
  public void TC1() 
  {
	  Reporter.log("TC1 is running", true);
  }
  
 
  @BeforeTest
  public void BeforeMethod() 
  {
	  Reporter.log("before method is running", true);
  }
  
  @AfterMethod
  public void afterMethode() 
  {
	 Reporter.log("after method is running", true); 
  }
  @Test
  public void TC2()
  {
	  Reporter.log("TC2 is running ", true);
  }
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("before class is running", true);
  }
}
