package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		
		//To handled frame we need to switch focus frome main page to frame by using
		//driver.switchTo().frame("String NameorId")
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.switchTo().defaultContent();
		
		//click on change them
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		//click on change oriantation
		
		driver.findElement(By.xpath("//a[@title='w3schools.com Home']")).click();
		
		
		
		
		
	}

}
