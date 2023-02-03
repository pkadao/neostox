package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lisetner  implements ITestListener
{
  @Override
  public void onTestFailure(ITestResult result) 
  {
	  String tcName = result.getName();
	  Reporter.log("TC"+tcName+"is failed,please try again", true);
  }
  @Override
  public void onTestSuccess(ITestResult result) 
  {
	  String tcName = result.getName();
	  Reporter.log("TC"+result.getName()+"is passed suiccessfully", true);
  }
  @Override
  public void onTestSkipped(ITestResult result) 
  {
	  String tcName = result.getName();
	  Reporter.log("TC"+result.getName()+"is skipped,please ha", true);
  }
}
