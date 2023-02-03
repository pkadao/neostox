package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//launch url
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//read total rows from table
		
		//outer for loop-->2-11(tr)-->1
		
		for( int i=2;i<=11;i++)
		{
			//inner for loop-->table data(td)-->j
			
			for(int j=1;j<=3;j++)
			{
				
			
			 
			String tableData = driver.findElement(By.xpath("//tbody//tr["+i+"]/td["+j+"]")).getText();
			
			System.out.println(tableData+" ");
		}
			System.out.println();
	}

	}
}
