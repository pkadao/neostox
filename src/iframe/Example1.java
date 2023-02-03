package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {



	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		//To handled frame we need to switch focus frome main page to frame by using
		//driver.switchTo().frame("String NameorId")
		
		driver.switchTo().frame("iframe-name");
		
		   String iframeText = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class ')]")).getText();
		
	
		System.out.println("Text on iframe is "+iframeText);
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		
		String mainPagetext = driver.findElement(By.xpath("//legend[text()='iFrame Example']")).getText();
		
		//click on change them
		//driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
	}

}
