package neoStoxPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class NeoStoxDashBoardPage 
{

	@FindBy(xpath = "(//a[text()='OK'])[2]")private WebElement popUpOkButton;
	
	//@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement popUpCloseButton;
	
	@FindBy(id = "lbl_username") private WebElement userName;
	
	@FindBy(xpath = "//span[text()='Logout']") private WebElement logOutButton;
	
	@FindBy(id="lbl_curbalancetop")private WebElement acBalance;
	
	public  NeoStoxDashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void handlePopUp(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(1000);
		if(popUpOkButton.isDisplayed())
		{
		Thread.sleep(1000);
		//Utility.scrollIntoView(driver, popUpOkButton);
		popUpOkButton.click();
		Reporter.log("Clicking on PopUp Ok Button", true);
		Thread.sleep(500);
		//Utility.scrollIntoView(driver, popUpCloseButton);
		//popUpCloseButton.click();
		
		//Reporter.log("Clicking on popUp close button", true);
	}
		else
		{
			Reporter.log("There is no pop-up",true);
		}
	}
	
	public void logOutFromNeoStox() throws InterruptedException
	{
		userName.click();
		Thread.sleep(1000);
		logOutButton.click();
		Reporter.log("logging out from NeoStox", true);
		Thread.sleep(1000);
	}

	
	public String getActualUserName()
	{
		String actualUserName=userName.getText();
		Reporter.log("getting actual user name", true);
		Reporter.log("Actual user name is "+actualUserName, true);
		return actualUserName;
	}
	
	public String getACBalance()
	{
		String balance = acBalance.getText();
		Reporter.log("getting AC Balance is", true);
		Reporter.log("Account balance is"+balance, true);
		return balance;
		
	}
	
	
	
	
	
}
