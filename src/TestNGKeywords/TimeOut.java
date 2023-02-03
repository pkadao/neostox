package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
  @Test
  public void testing() throws InterruptedException 
  {
	  Thread.sleep(1000);
	  Reporter.log("TC testing is running", true);
  }
}
