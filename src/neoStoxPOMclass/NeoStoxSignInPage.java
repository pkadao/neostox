package neoStoxPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxSignInPage 
{
@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobileNumField;

@FindBy(id="lnk_signup1")private WebElement signInButton;

public NeoStoxSignInPage(WebDriver driver)
{
	PageFactory.initElements( driver,this);
}
public void enterMobileNumber(String mobNum)
{
	mobileNumField.sendKeys(mobNum);
	Reporter.log("Entering mobile number", true);
}

public void ClickOnSignInButton()
{
	signInButton.click();
	Reporter.log("Clicking on signIn button",false);
}

}
