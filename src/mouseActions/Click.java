package mouseActions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		
		WebElement signInButton = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
		
		//signInButton.click();//by using webElement Method
		
		//using action class
		//create an object of action class and pass webDriver objects as parameter
		
		Actions act = new Actions(driver);
		
		//using one of the action class method take required action
		
		//act.click(signInButton).perform();
			
        act.moveToElement(signInButton).click().build().perform();
        
        
        
        
	}

}
