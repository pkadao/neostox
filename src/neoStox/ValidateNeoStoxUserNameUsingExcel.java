package neoStox;


import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateNeoStoxUserNameUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//reading data from excel sheet
    File myFile = new File("C:\\Selenium1\\20AugEvining.xlsx");
    Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
    String userID = mySheet.getRow(0).getCell(0).getStringCellValue();
    String password = mySheet.getRow(0).getCell(1).getStringCellValue();
    String expUN = mySheet.getRow(0).getCell(2).getStringCellValue();
    //launch neoStox url
	driver.get("https://neostox.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
	Thread.sleep(1000);
	driver.get("https://neostox.com/sign-in");
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys(userID);
	Thread.sleep(1000);
	driver.findElement(By.id("lnk_signup1")).click();
	
   Thread.sleep(500);
   
   driver.findElement(By.xpath("//input[@id='txt_accesspin']")).sendKeys(password);
  
   Thread.sleep(1000);
   
   driver.findElement(By.xpath("//a[@id='lnk_submitaccesspin']")).click();
   
   Thread.sleep(1000);
   
   driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
  
   Thread.sleep(1000);
   
   driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
   
   Thread.sleep(1000);
   
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







	



