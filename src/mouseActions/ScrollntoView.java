package mouseActions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollntoView {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//launch url
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		WebElement katraj = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		
		act.scrollToElement(katraj).perform();
		
		act.scrollToElement(katraj).perform();
		
	}

}
