package ListBoxDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownEg1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(1000);
		//we will navigate to signup page
		
		//handle date
		//1.dentify list box to be handled and store it in reference variable
		
		WebElement day=driver.findElement(By.id("day"));
		Thread.sleep(1000);
		//create an object of select class which will accept webElement as argument
		
		Select s = new Select(day);

		Thread.sleep(1000);
		s.selectByVisibleText("14");
		Thread.sleep(1000);
		//handling month
		
		WebElement month=driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(5);
		Thread.sleep(1000);
		//handling year
		
		WebElement year=driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByValue("2012");
		
		System.out.println("year multiselection status is "+s2.isMultiple());
	}

}
