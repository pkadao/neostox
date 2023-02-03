package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi everyone");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Thats it");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='HOME ']")).click();
	}

}
