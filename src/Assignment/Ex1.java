package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {


	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
		Thread.sleep(1000);
		//launch url
		driver.get("https://neostox.com/sign-in");
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8975687301");
		Thread.sleep(1000);
		driver.findElement(By.id("lnk_signup1")).click();
		
	   Thread.sleep(500);
	   
	   driver.findElement(By.xpath("//input[@id='txt_accesspin']")).sendKeys("1234");
	  
       Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//a[@id='lnk_submitaccesspin']")).click();
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
	  
	   Thread.sleep(1000);
	   
	  // driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
	   
	  // Thread.sleep(1000);
	   
	   //validatingUserName
	   String actualUserName = driver.findElement(By.id("lbl_username")).getText();
	   String expectedUserName = "Hi pornima kadao";
	   
	   
	   if(actualUserName.equals(expectedUserName))
	   {
		  System.out.println("Actual and UserName are match "+expectedUserName); 
	   }
	   else
	   {
		   System.out.println("actual and UserName are not match "+expectedUserName);
	   }
	    Thread.sleep(1000);
	    driver.findElement(By.id("lbl_username")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Logout']")).click();
	    Thread.sleep(1000);
	    driver.close();
	  
    
	}

}
