package mouseActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//launch url
		driver.get("http://www.uitestpractice.com/Students/Actions");
		Thread.sleep(1000);
		
		//create an object action class and pass webdriver object as a argument
		
		Actions act = new Actions(driver);
		
		//find the element and store in ref variable
		
		WebElement DoubleClickButton = driver.findElement(By.name("dblClick"));
		
		//act.moveToElement(DoubleClickButton).click().build().perform();
		
	     act.doubleClick(DoubleClickButton).perform();
	     
	     //Handling alert PopUp
	     //switch focus to alert
	     
	     Alert alt=(Alert) driver.switchTo(). alert();
	     
	     //use one the Alert method
	     alt.accept();//click on ok button
		
	}

}
