package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NeoStoxSample2 {
  @Test
  public void neoStoxLaunch() throws InterruptedException 
  {
  System.setProperty("webdriver.chrome.driver","C:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://neostox.com/");
	  Thread.sleep(1000);
	  
	  System.out.println("Hi this is printing statement");
	  
	  Reporter.log("Hi this is Reporter");
	  
	  Reporter.log("Hi this is reporter-->console", true);
  
}
  @Test
  public void upstoxLaunch() throws InterruptedException
  {
  System.setProperty("webdriver.chrome.driver","C:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
  
  WebDriver driver = new ChromeDriver();
  
  driver.manage().window().maximize();
  
  driver.get("https://neostox.com/");
  Thread.sleep(1000);
  
  System.out.println("Hi this is printing statement");
  
  Reporter.log("Hi this is Reporter");
  
  Reporter.log("Hi this is reporter-->console", true);
  }
}
