package dataProvider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
	//String s="TCID-2456";
	
	@BeforeMethod
	public void launchNeoStoxBrowser() throws IOException
	{
		launchBrowser();
		home=new NeoStoxHomePage(driver);
		signIn=new NeoStoxSignInPage (driver);
		pass=new NeoStoxPasswordPage(driver);
		dash=new NeoStoxDashBoardPage(driver);
		
	}
	@Test(dataProvider="loginDetailsforValidateUserName")
	public void validateUserName(String mobNum,String password,String userName) throws InterruptedException, EncryptedDocumentException, IOException
	{
		home.ClickOnSignInButton();
		Utility.implicitWait(1000, driver);
		
		signIn.enterMobileNumber("mobNum");
		Thread.sleep(1000);
		signIn.ClickOnSignInButton();
		
		Utility.implicitWait(1000, driver);
		pass.enterPassword("password");
		pass.clickOnSubmitButton();
		
		Utility.implicitWait(1000, driver);
		dash.handlePopUp(driver);
		
		Assert.assertEquals(dash.getActualUserName(),"Actual and expected user name are not matching TC is failed");
		
		dash.logOutFromNeoStox();
	}
  @Test(dataProvider="loginDetailForValidateAccountBalance")
  public void validateACBalance(String mobNum,String password) throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  home.ClickOnSignInButton();
		Utility.implicitWait(1000, driver);
		
		signIn.enterMobileNumber("mobile");
		Thread.sleep(1000);
		signIn.ClickOnSignInButton();
		
		Utility.implicitWait(1000, driver);
		pass.enterPassword("password");
		pass.clickOnSubmitButton();
		
		Utility.implicitWait(1000, driver);
		dash.handlePopUp(driver);
		
		Assert.assertEquals(dash.getACBalance(),"AC balance is null, TC is failed");
		
		dash.logOutFromNeoStox();
  }
  
  @AfterMethod
  public void closeNeoStoxApp() throws InterruptedException
  {
	  driver.close();
	  Reporter.log("Closing application", true);
	  Thread.sleep(1000);
  }
  
  @DataProvider(name="loginDetailesforValidateUserName")
  public String[][]getLogineDetails1()
  {
	  String userData[][]= {{"8975687301","1234","Hi pornima kadao"},{"8329195905","7847","Hi Sarika Gomase"},{"8805568380","2303","Hi Pooja Telekar"}};
	  return userData;
  }
  @DataProvider(name="loginDetailsForValidateAccountBalance")
  public String[][]getLoginDetails2()
  {
	  String userData[][]= {{"8975687301","1234"},{"8329195905","7847"},{"8805568380","2303"}};
	return userData;
  }
}
