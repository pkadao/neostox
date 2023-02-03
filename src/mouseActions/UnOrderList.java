package mouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnOrderList {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//launch url
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("honda");	
		Thread.sleep(1000);
		
	     List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		
		System.out.println("No of items in list are "+searchResults.size());
		 
		

		for(WebElement s:searchResults)
		{
			System.out.println(s.getText());
		}
		
		for (WebElement result:searchResults)//1---10
		{
			String expected = "honda amaze";
			
			String actual = result.getText();//1
			if(expected.equals(actual))
			{
				System.out.println("Clicked on "+result.getText());
				result.click();
				break;
			}
		}
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Images")).click();
	}

}

