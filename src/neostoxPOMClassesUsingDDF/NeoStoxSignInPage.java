package neostoxPOMClassesUsingDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxSignInPage 
{
	//1.
	@FindBy(id = "MainContent_signinsignup_txt_mobilenumber") private 
	WebElement mobileNumField;
	@FindBy(id = "lnk_signup1") private WebElement signInButton;
	//2.
	public NeoStoxSignInPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//3.
	public void enterMobileNumber(String MobNum)
	{
	mobileNumField.sendKeys(MobNum);
	}
	public void clickOnSignInButton()
	{
	signInButton.click();

}
}
