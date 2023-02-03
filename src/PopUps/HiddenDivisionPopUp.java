package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(1000);
	  //handle hidden division popup
	  //checking close button of hidden div popup
	  
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  Thread.sleep(1000);
	  //sending data in search bar
	 driver.findElement(By.name("q")).sendKeys("Laptop");
	  Thread.sleep(1000);
	  //clicking on search button
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	}

}  
