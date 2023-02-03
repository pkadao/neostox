package setSizeAndSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		//launch url
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		System.out.println(driver.manage().window().getSize());
		
		 Dimension defaultSize = driver.manage().window().getSize();
		
		System.out.println("Default Size is "+defaultSize); 
		
		//hoe to set size
		
		//1.create object dimension class and pass values of width and height
		
		Dimension d=new Dimension(555,400);
		
		Thread.sleep(1000);
		
		//2.use set size method and pass dimension class objectas a parameter
		
		driver.manage().window().setSize(d);
		Dimension newSize = driver.manage().window().getSize();
		System.out.println("New size is "+newSize);


	}

}
