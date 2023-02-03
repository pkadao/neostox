package ListBoxDropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		
		//Process to handle list box/dropdown(Verify tag name of dropdown/listbox is selected)
		//1. Identify list box to be handled and store it in interface variable
		
		WebElement cars=driver.findElement(By.id("cars"));
		
		//2.create an object of select class which will accept WebElement as argument
		
		Select s = new Select(cars);
	
		//3.By using one of the select class methods we can select values from list box like
		
		//1.select ByVisibleText:select ByVisibleText(string args0)
	    //2.select ByIndex:select ByIndex(int arg0)
		//3.select ByValue:select ByValue(string arg0)
		
		//check that is it multi selection?
		
		System.out.println("Multiselection status is "+s.isMultiple());
//		s.selectByVisibleText("Saab");
//		Thread.sleep(1000);
//		s.selectByValue("opel");
//		Thread.sleep(1000);
//	    s.selectByIndex(1);
//		
		//how to deselect -->only applicable for multiselectable drop down
//		Thread.sleep(1000);
//		s.deselectAll();
	
		
//		s.deselectByIndex(0);
//		Thread.sleep(1000);
//		s.deselectByValue("Saab");
//		Thread.sleep(1000);
//		
		List<WebElement>allOptions=s.getAllSelectedOptions();
		Iterator<WebElement>it=allOptions.iterator();
		
//		while(it.hasNext());
//		{
//			System.out.println(it.next().getText());
//		}
//		
//         for(int i=0;i<=allOptions.size()-1;i++)
//         {
//        	 System.out.println(allOptions.get(i).getText());
//        	 }
		{
         System.out.println("======================================");
         
         for(WebElement a:allOptions)
         {
        	 System.out.println(a.getText());
         }
		}
	}
}


