package PopUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigmentofchildPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
		Set<String>allPages = driver.getWindowHandles();
		Iterator<String>it=allPages.iterator();
		
		String mainPage = it.next();
		String ChildPage = it.next();
		
		driver.switchTo().window(ChildPage);
		
		driver.findElement(By.id("autocomplete")).sendKeys("hello");
		
		driver.close();
		
		driver.switchTo().window(mainPage);
		
		String myText = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class inquiry please contact')]")).getText();
		
		System.out.println("My Text is "+myText);
		
		

		
		
	}

}
