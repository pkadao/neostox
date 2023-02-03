package neostoxPOMClassesUsingDDF;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class NeoStoxTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		
		//created object of chromedriver
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://neostox.com/");
		
		File myFile=new File("C:\\Selenium1\\20AugEvining.xlsx");
		Sheet mySheet =WorkbookFactory.create(myFile).getSheet("Sheet5");
		//mobile num, password, ExpuserName
		
		  String mobNum = mySheet.getRow(0).getCell(0).getStringCellValue();
		  String pass = mySheet.getRow(0).getCell(1).getStringCellValue();
		  String expUsername = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		//created an object from home page
		NeoStoxHomePage home = new NeoStoxHomePage(driver);
		home.clickOnSignInButton();
		
        //signIn Page
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		NeoStoxSignInPage signIn=new NeoStoxSignInPage(driver);
		signIn.enterMobileNumber(mobNum);
		signIn.clickOnSignInButton();
		
		//password Page
		

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		NeoStoxPasswordPage password= new NeoStoxPasswordPage(driver);
		password.enterPassword(pass);
		password.clickOnSubmitButton();
		
		//dashBoard Page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));								
		NeoStoxDashBoardPage dashBoard= new NeoStoxDashBoardPage(driver);
		dashBoard.handlePopUp();
		dashBoard.validateUserName(expUsername);
		dashBoard.logOutFromNeoStox();
		driver.close();
	   
	}

}
