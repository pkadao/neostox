package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxSignInPage 
{
@FindBy(id="MainContatent_signinsignup_txt_mobilenumber")private WebElement mobileNumField;

@FindBy(id="lnk_signup1")private WebElement signInButton;

public NeoStoxSignInPage(WebDriver driver)
{
	PageFactory.initElements( driver,this);
}
public void enterMobilenumber()
{
	mobileNumField.sendKeys("8975687301");
}

public void ClickOnSignInButton()
{
	signInButton.click();
}

}
