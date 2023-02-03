package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v104.cachestorage.model.Header;

public class Eg1 {

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//launch url
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
	   List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
	   //how many rows are there in table
	   System.out.println("No of rows are "+table.size());
	   
	   //print table
	   for(WebElement t:table)
	   {
		   System.out.println(t.getText());
	   }
	   //how many columns/header are there?
	   List<WebElement> header = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
	   
	   System.out.println("No of columns are "+header.size());
	
	      //what are the headers?
	
	   Iterator<WebElement> it=header.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next().getText());

		}

}
}
