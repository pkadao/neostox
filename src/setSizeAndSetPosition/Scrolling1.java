package setSizeAndSetPosition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling1 
{

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	Thread.sleep(1000);
	//launch url
	driver.get("https://en.Wikipedia.org/wiki/India");
	Thread.sleep(1000);
	
	//decide where to scroll and store in ref variable
	
	WebElement ancient_India = driver.findElement(By.id("Ancient_India")); 
	
	//type cast driver object into JavaScriptExecuter
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
		
	//call methid executeScript
	Thread.sleep(1000);
	js.executeScript("arguments[0].scrollIntoView(true)",ancient_India);

}
}
