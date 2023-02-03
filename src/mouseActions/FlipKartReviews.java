package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartReviews {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//launch url
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		//handle hidden division popup
		//clicking close button of hidden div popup
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("i Phone 14");	
		//clicking on search button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		String reviews = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[3]")).getText();
		
		System.out.println("Reviews are "+reviews);
	}

}
