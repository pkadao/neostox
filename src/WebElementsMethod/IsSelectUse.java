package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement checkBox2 = driver.findElement(By.id("checkBoxOption2"));
		
		
		checkBox2.click();
		
		if(checkBox2.isSelected())
		{
			System.out.println("Thank you,checkBox is already selected");
		}
		
		else
		{
			System.out.println("Checking checkBox now");
			checkBox2.click();
			System.out.println("CheckBox is selected now");
			
		    driver.findElement(By.name("checkBoxOption2"));
			
			driver.findElement(By.partialLinkText("a Page")).click();
			
			driver.findElement(By.className("inputs ui-autocomplete-input")).sendKeys("Hii");
		}
	}

}
