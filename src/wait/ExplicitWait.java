package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		//launch url
		driver.get("https://www.discoveryplus.in/");
	     
		//create an object of WebdriverWait
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(10000));
		
		//using object take next action
		
		//w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//h6[text()='SignIn'])[2]"))));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='SignIn'])[2]")));
		
		driver.findElement(By.xpath("//h6[text()='SignIn'])[2]")).click();
	}

}
