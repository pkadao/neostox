package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxSample1 {

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://neostox.com/");
		  Thread.sleep(1000);

	}

}
