package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookEG1 
{
 @FindBy(name="login")private WebElement loginbutton;
 
 public FacebookEG1(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 
 public void ClickOnLoginButton()
 {
	 loginbutton.click();
 }
}
