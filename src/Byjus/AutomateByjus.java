package Byjus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateByjus {

	public static void main(String[] args) throws InterruptedException
	{
		int count=0;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get("https://byjus.com/byjus-classes-book-a-free-60-minutes-class/registration/?utm_source=website&utm_medium=byjusclasses&utm_campaign=byjusclassescta");
		 
		 WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control video-selection']"));
		 
		 WebElement scroll = driver.findElement(By.xpath("//h2[text()='Watch video lessons ']"));

		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("argument[0].scrollIntoView(true)",scroll);
		 
		 Select select=new Select(dropdown);
		 
          for(int index=0;index<7;index++)
          {
        	  select.selectByIndex(index);
        	  System.out.println("Available videos for class"+(index+4));
          }
	}

}
