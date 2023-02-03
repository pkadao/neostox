package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		driver.get("https://www.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(1000);
		WebElement getOTPButton=driver.findElement(By.xpath("//button[text()='GetOTP']"));
		
		boolean results = getOTPButton.isEnabled();
       
		System.out.println("Current stsus is "+results);
		getOTPButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8888888888.0");
		
		if(getOTPButton.isEnabled())
		{
		boolean result = getOTPButton.isEnabled();
		System.out.println("current satus is "+result);
		getOTPButton.click();
		}
		else
		{
			System.out.println("OTPbuton is not enabled");
		}
	}

}
