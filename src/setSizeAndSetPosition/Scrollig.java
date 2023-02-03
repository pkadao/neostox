package setSizeAndSetPosition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollig {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		//launch url
		driver.get("https://en.Wikipedia.org/wiki/India");
		Thread.sleep(1000);
		
		//type cast driver object into JavaScriptExecutor and store in ref Variable
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(1000);
		
		//using object call method execute Script
		js.executeScript("window.scrollBy,(0,500)");
		js.executeScript("window.scrollBy, (0,-700)");
		
		
	}

}
