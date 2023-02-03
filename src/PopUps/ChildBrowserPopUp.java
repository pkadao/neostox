package PopUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		
		String mainPageID =driver.getWindowHandle();//will return only id of main page
		
		System.out.println("Main Page ID "+mainPageID);
		
		//to get multiple(all page Ids use method getwindowHandles-->will return set of string
		
		Set<String>idsOfAllPages = driver.getWindowHandles();
		
	
		Iterator<String>it=idsOfAllPages.iterator();
		
		String mainPageIDnew = it.next();//id of Main Page
		System.out.println(mainPageIDnew);
		
		String ChildPageID = it.next();//Id of child page
		
		//need to switch  selinium focus from main page to child page
		
		driver.switchTo().window(ChildPageID);//focus switch to child page
		
		driver.manage().window().maximize();
		
		//writing text in child TextBx
		Thread.sleep(1000);
		
		driver.findElement(By.id("the7-search")).sendKeys("Unik");
		driver.close();
		//driver.quit();
		//to work back to main page-->we need to switch selenium focus from child page to main page
		
		driver.switchTo().window(mainPageIDnew);//switching focus from child page to main page
		
		Thread.sleep(1000);
		String myText=driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
		
		System.out.println("Text of main page is "+myText);
		
		
		

	}

}
