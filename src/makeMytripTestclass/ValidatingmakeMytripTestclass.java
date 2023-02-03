package makeMytripTestclass;

import org.testng.annotations.BeforeClass;


import makeMytrip.makeMytripBaseClass;
import makeMytripPOMclass.makeMytripHomePage;


public class ValidatingmakeMytripTestclass extends makeMytripBaseClass 
{
	makeMytripHomePage home;
	@BeforeClass
	public void launchMakeMyTripbrowser()
	{
		launchBrowser();
		home=new makeMytripHomePage(driver);
	}

}
