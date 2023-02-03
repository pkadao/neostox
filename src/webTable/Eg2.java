package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//launch url
		driver.get(" https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		//to read table header/columns
		
		for(int i=1;i<=3;i++)
		{
			WebElement header = driver.findElement(By.xpath("//tbody//th["+i+"]"));
			System.out.println(header.getText());
		}
	}

}
