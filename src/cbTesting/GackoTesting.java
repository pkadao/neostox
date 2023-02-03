package cbTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GackoTesting {
  @Test
  public void firefoxTest() 
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Selenium1\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	  
	  WebDriver driver= new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://vctcpune.com/selenium/practice.html");
  }
}
