package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDownKeysUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//launch url
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
        WebElement signInButton = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
		
		//signInButton.click();//by using webElement Method
		
		
		Actions act = new Actions(driver);
		
		
		act.click(signInButton).perform();
		
		Thread.sleep(1000);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		
		Thread.sleep(1000);
		//act.sendKeys(firstname,"Harsha").perform();
		
		act.sendKeys(firstname,Keys.SHIFT).sendKeys("h").keyUp(Keys.SHIFT).sendKeys("arsha").build().perform();
			
	}

}
