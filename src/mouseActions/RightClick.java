package mouseActions;

import java.awt.Desktop.Action;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(1000);
		
		//create an object of action class and pass webdriver object as aargument
		
		Actions act = new Actions(driver);
		
		//find the element and store in ref variable
		
		WebElement rightClickButton=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
		act.moveToElement(rightClickButton).contextClick().build().perform();
		
		act.contextClick(rightClickButton).perform();
		
      
	}

}
