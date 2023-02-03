package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		//get.to enter url in browser or to open an application
		
		//driver.get("https://paytm.com/");
		//Thread.sleep(1000);
		
		//close:to close the current tab of the browser open by selenium tool
		//driver.close();
		
		//driver.close();
		
		//quit:to close the  all the tab [resent in beowser open by selenium tools
		
		//driver.quit();
		
		//maximize browser
		
		//driver.manage().window().maximize();
		//Thread.sleep(1000);
		//minimize method
		
		driver.manage().window().minimize();
		

	}

}
