package neostoxPOMClassesUsingDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxHomePage 
{
	//1 Data member should be declared globally with access level private using 
	//@FindBy Annotation
	
	@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement signInButton;
	//2 Initialize within a constructor with access level public using pagefactory 
	public NeoStoxHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	//3 Utilize within a method with access level public
	public void clickOnSignInButton()
	{
	signInButton.click();
	}
	}


