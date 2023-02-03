package setSizeAndSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosionStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		//launch url
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		System.out.println(driver.manage().window().getPosition());
		
		Point defaultPosition = driver.manage().window().getPosition();
		
		System.out.println("Default Posion is "+defaultPosition);

	    //how to set Position
		//create an object of point class and pass x and y co-ordinates
		
		Point p=new Point(-200,100);
		
		Thread.sleep(1000);
		
		//use setPosition method and pass Point class as a parameter
		Thread.sleep(1000);
		driver.manage().window().setPosition(p);
		
	}
	

}
