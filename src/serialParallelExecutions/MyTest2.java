package serialParallelExecutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest2 {
  @Test
  public void fb() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
  }
}
