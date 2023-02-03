package makeMytrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class makeMytripBaseClass {
	protected static WebDriver driver;
		  public void launchBrowser()
		  {
		 	 System.setProperty("webdriver.chrome.driver","C:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		 	 driver=new ChromeDriver();
		 	 driver.manage().window().maximize();
		 	 driver.get("https://www.makemytrip.com/");
		 	 Utility.implicitWait(1000, driver);
		 	 Reporter.log("launching Browser",true);
		 	 
	}

}
