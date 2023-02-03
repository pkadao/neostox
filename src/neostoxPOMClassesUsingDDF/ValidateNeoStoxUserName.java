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



public class ValidateNeoStoxUserName 
{
	WebDriver driver;
	NeoStoxHomePage home;
	NeoStoxSignInPage signIn;
	NeoStoxPasswordPage pwd;
	NeoStoxDashBoardPage dash;
	
	File myFile;
	Sheet mySheet;
	
	@BeforeClass
	public void launchNeoStoxApp() throws EncryptedDocumentException, IOException
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
		 mySheet =WorkbookFactory.create(myFile).getSheet("Sheet5");
	}
	@BeforeMethod
	public void loginToNeoStox() throws InterruptedException
	{
		home.clickOnSignInButton();
		Reporter.log("Clicing on SignIn Button", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		signIn.enterMobileNumber(mySheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Entering Mobile number", true);
		signIn.clickOnSignInButton();
		Reporter.log("Clicking on signIn Button",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pwd.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Entering Password",true);
		
		Thread.sleep(100);
		
		pwd.clickOnSubmitButton();
		Reporter.log("Clicking on Submit Button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		dash.handlePopUp();
		Reporter.log("Handeling popup", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
  @Test
  public void ValidateUserName() 
  {
	  String expUsername = mySheet.getRow(0).getCell(2).getStringCellValue();
	  String actualUserName = dash.getActualUserName();
	  Reporter.log("Validating Username", false);
	  
  }
  
  @AfterMethod
  public void logOutFromNeoStox() throws InterruptedException
  {
	 Thread.sleep(1000);
	 dash.logOutFromNeoStox();
	 Reporter.log("logging out from neostox",true);
	 Thread.sleep(1000);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	driver.close();
	Reporter.log("Closing browser",true);
  }
}
