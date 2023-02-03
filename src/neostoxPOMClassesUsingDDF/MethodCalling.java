package neostoxPOMClassesUsingDDF;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MethodCalling {
  @Test
  public void testng() throws IOException 
  {
	  WebDriver driver=null;
	  
	  System.out.println(GeneralMethods.readDataFromExcel(0, 0));
	  System.out.println(GeneralMethods.readDataFromExcel(0, 1));
	  
	  GeneralMethods.implicitWait(100, driver);
	  GeneralMethods.implicitWait(5000, driver);
	  
	  GeneralMethods.takeScreenshot(driver, "MyScreenshot");
	  GeneralMethods.takeScreenshot(driver, "YourScreenshot");
	  
	  GeneralMethods.scrollIntoView(driver, null);
  }
}
