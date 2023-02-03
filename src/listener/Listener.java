package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
@Override
public void onTestFailure(ITestResult result)
{
 String tcName = result.getName();
 Reporter.log("TC"+tcName+"is failed,please try again",true);
}
@Override
public void onTestSuccess(ITestResult result)
{
 Reporter.log("TC"+result.getName()+"is passed successfully",true);
}
@Override
public void onTestSkipped(ITestResult result)
{
 String tcName = result.getName();
 Reporter.log("TC"+result.getName()+"is Skipped,please have a look",true);
}
}
