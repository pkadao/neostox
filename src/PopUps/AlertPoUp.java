package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPoUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		
		driver.findElement(By.name("submit")).click();
		//handle Alert PopUp
		
		Alert alt = driver.switchTo().alert();
        
		//alt.accept();//clicking on ok button
				
         System.out.println(alt.getText());	//getting alert Popup text
         
         alt.dismiss();//click on cancel button
         
       String text= driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();
       
       System.out.println("text is "+text);
        

	}
}
