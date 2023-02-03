package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod 
{
   @Test//(enabled=false)
  public void b() 
  {
	 Reporter.log("T b is running", true); 
  }
  @Test(dependsOnMethods= {"b"})
  public void a() 
  {
	 Reporter.log("T a is running", true); 
  }
 
  @Test
  public void c() 
  {
	 Reporter.log("T c is running", true); 
  } 
  
	  
  }

