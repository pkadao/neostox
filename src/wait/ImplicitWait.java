package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		//launch url
		driver.get("https://en.Wikipedia.org/wiki/India");
		Thread.sleep(1000);
		//Implicit wait-->applicable for whole page
		
		driver.findElement(By.xpath("//span[text()='Main page']")).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));	
	}

}
