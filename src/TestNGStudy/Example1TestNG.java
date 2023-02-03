package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1TestNG {
  @Test
  public void KiteLogin() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://kite.zerodha.com");
  }
}
