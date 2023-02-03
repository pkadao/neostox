package neoStoxTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neoStoxBase.Base;
import neoStoxPOMclass.NeoStoxDashBoardPage;
import neoStoxPOMclass.NeoStoxHomePage;
import neoStoxPOMclass.NeoStoxPasswordPage;
import neoStoxPOMclass.NeoStoxSignInPage;
import neoStoxUtility.Utility;

@Listeners(neoStoxTestClasses.Listener.class)

public class ValidateNeoStoxUserNameUsingPropertyFile extends Base
{
	NeoStoxHomePage home;
	NeoStoxSignInPage signIn;
	NeoStoxPasswordPage pass;
	NeoStoxDashBoardPage dash;
	String s="TCID-2456";
	
	@BeforeClass
	public void launchNeoStoxBrowser() throws IOException
	{
		launchBrowser();
		home=new NeoStoxHomePage(driver);
		signIn=new NeoStoxSignInPage (driver);
		pass=new NeoStoxPasswordPage(driver);
		dash=new NeoStoxDashBoardPage(driver);
		
	}
	@BeforeMethod
	public void loginToNeoStox() throws InterruptedException, EncryptedDocumentException, IOException
	{
		home.ClickOnSignInButton();
		Utility.implicitWait(1000, driver);
		
		signIn.enterMobileNumber(Utility.readDataFromPropertyFile("mobile"));
		Thread.sleep(1000);
		signIn.ClickOnSignInButton();
		
		Utility.implicitWait(1000, driver);
		pass.enterPassword(Utility.readDataFromPropertyFile("password"));
		pass.clickOnSubmitButton();
		
		Utility.implicitWait(1000, driver);
		dash.handlePopUp(driver);
		
	}
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException 
  {
	 // Assert.fail();
  
	  Assert.assertEquals(dash.getActualUserName(),Utility.readDataFromExcel(0, 2) ,"Actual and expected user name are not matching TC is failed");
	  Utility.takeScreenshot(driver,Utility.readDataFromPropertyFile("TCID1") );
  }
  @Test
  public void validateACBalance() throws IOException
  {
	  Assert.assertNotNull(dash.getACBalance(),"AC Balance is null TC failed");
	  Utility.takeScreenshot(driver, Utility.readDataFromPropertyFile("TCID2"));
  }
  
  @AfterMethod
  public void logOutFromNeoStox() throws InterruptedException
  {
	  dash.logOutFromNeoStox();
  }
  @AfterClass
  public void closeNeoStoxApp() throws InterruptedException
  {
	  driver.close();
	  Reporter.log("Closing application", true);
	  Thread.sleep(1000);
  }
}
