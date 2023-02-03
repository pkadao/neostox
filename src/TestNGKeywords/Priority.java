package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority=-4)
  public void b() 
  {
	 Reporter.log("T b is running", true); 
  }
  @Test(priority=-3)
  public void a() 
  {
	 Reporter.log("T a is running", true); 
  }
  @Test(priority=-2)
  public void d() 
  {
	 Reporter.log("T d is running", true); 
  }
  @Test
  public void c() 
  {
	 Reporter.log("T c is running", true); 
  }



}
