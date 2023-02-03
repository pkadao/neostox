package makeMytripPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class makeMytripHomePage 
{
	@FindBy(xpath="//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")private WebElement loginButton;

	 public  makeMytripHomePage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 public void ClickOnSignInButton()
		{
			loginButton.click();
			Reporter.log("Clicking on login button", true);

}
}