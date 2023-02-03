package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2 {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	Thread.sleep(2000);
	driver.switchTo().frame("frame1");
	Thread.sleep(2000);
	   driver.findElement(By.tagName("input")).sendKeys("Selenium");
    driver.switchTo().frame("frame3");
   
   driver.findElement(By.xpath("//input[@type='checkbox']")).click();
   Thread.sleep(2000);
   
   driver.switchTo().defaultContent();
   
   driver.switchTo().frame("frame2");

    //webEliment animals = driver.findElement(By.xpath("//select[@id='animals']")
   
   WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
 
    Select s =new Select(animals);
   
     Thread.sleep(2000);
     s.selectByVisibleText("Big Baby Cat");
     Thread.sleep(2000);
       
    driver.switchTo().defaultContent();
    
   String Text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText(); 
   
   System.out.println("text on main page is "+Text);
   
	   
	   
	
		
	}

	}

