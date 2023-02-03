package neostoxPOMClassesUsingDDF;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUserNeoStoxNameUsingGeneralMethods 
{
	WebDriver driver;
	NeoStoxHomePage home;
	NeoStoxSignInPage signIn;
	NeoStoxPasswordPage pwd;
	NeoStoxDashBoardPage dash;
	String s="TCID-1234";
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		Reporter.log("Launching launchNeostox.App", true);
		home=new NeoStoxHomePage(driver);
		signIn=new NeoStoxSignInPage(driver);
		pwd=new NeoStoxPasswordPage(driver);
		dash=new NeoStoxDashBoardPage(driver);
		
		File myFile=new File("C:\\Selenium1\\20AugEvining.xlsx");
		 Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
	}
	@BeforeMethod
	public void loginToNeoStox() throws InterruptedException, EncryptedDocumentException, IOException
	{
		home.clickOnSignInButton();
		GeneralMethods.implicitWait(100, driver);
		
		signIn.enterMobileNumber((GeneralMethods.readDataFromExcel(0, 0)));
		signIn.clickOnSignInButton();
		GeneralMethods.implicitWait(100, driver);
		
		pwd.enterPassword((GeneralMethods.readDataFromExcel(0, 1)));
		Thread.sleep(100);
		pwd.clickOnSubmitButton();
		GeneralMethods.implicitWait(100, driver);
		
		dash.handlePopUp();
		GeneralMethods.implicitWait(100, driver);
	}
	
  @Test
  public void ValidateUserName() throws IOException 
  {
	  Assert.assertEquals(dash.getActualUserName(),GeneralMethods.readDataFromExcel(0,2),"actual and expcted UserName are not matching TC is failed");
	  
	  GeneralMethods.takeScreenshot(driver, s);
	  
  }
	
	
  @AfterMethod
  public void logOutfromNeoStox() throws InterruptedException
  {
	  GeneralMethods.implicitWait(1000, driver);
	  dash.logOutFromNeoStox();
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
	  
  }
}
