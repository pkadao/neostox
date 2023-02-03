package chromeOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class HeadLess {
public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
ChromeOptions opt= new ChromeOptions();
//opt.addArguments("--headless");
//opt.addArguments("--start-maximized");
//opt.addArguments("--incognito");
//opt.addArguments("disable-infobars");
//created object of chromedriver
ArrayList<String>al= new ArrayList<>();
al.add("--start-maximized");
al.add("--incognito");
opt.addArguments(al);
WebDriver driver= new ChromeDriver(opt);
//driver.manage().window().maximize();
//launch url
driver.get("http://output.jsbin.com/osebed/2");
Thread.sleep(1000);
// Process to handle list box/dropdown(Verify tag name of dropdown/listbox l
// 1. Identify list box to be handled and store it in reference variable
WebElement fruits = driver.findElement(By.id("fruits"));
// 2. Create an object of Select class which will accept WebElement as argument
Select s= new Select(fruits);
//3. By using one of the select class methods we can select values form list box like

// 1. selectByVisibleText: selectByVisibleText(String arg0)
// 2. selectByIndex: selectByIndex(int arg0)
// 3. selectByValue: selectByValue(String arg0)
//check that is it multi selectable?
System.out.println("MultiSelection Status is "+s.isMultiple());
s.selectByVisibleText("Banana");
Thread.sleep(100);
s.selectByValue("orange");
Thread.sleep(100);
s.selectByIndex(1);
//how to deselect-->only applicable for multiselectable dropdown
Thread.sleep(1000);
//s.deselectAll();
// s.deselectByIndex(0);
// Thread.sleep(1000);
// s.deselectByValue("orange");
// Thread.sleep(1000);
// s.deselectByVisibleText("Apple");
//
List<WebElement> allOptions = s.getAllSelectedOptions();
Iterator<WebElement> it = allOptions.iterator();
while(it.hasNext())
{
System.out.println(it.next().getText());
}
System.out.println("=======================================");
for(int i=0;i<=allOptions.size()-1;i++)
{
System.out.println(allOptions.get(i).getText());
}
System.out.println("=======================================");
for(WebElement a:allOptions)
{
System.out.println(a.getText());
}
}
}