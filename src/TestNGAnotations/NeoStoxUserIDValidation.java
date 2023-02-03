package TestNGAnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NeoStoxUserIDValidation {
	@BeforeClass
	public void launchApplication()
	{
		Reporter.log("Launching URL", true);
	}
	
	@BeforeMethod
	public void loginToneoStox()
	{
		Reporter.log("login to neostox", true);
	}
	
  @Test
  public void validateUserName() 
  {
	  Reporter.log("User Name Validated", true);
  }
  @AfterMethod
  public void loggoutfromneostox()
  {
	  Reporter.log("Logging Out", true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("clossing Browser", true);
  }
}
