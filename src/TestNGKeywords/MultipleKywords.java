package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleKywords {
	  @Test
	  public void a() 
	  {
		 Reporter.log("T a is running", true); 
	  }
	  @Test(dependsOnMethods= {"c","a"})
	  public void b() 
	  {
		 Reporter.log("T b is running", true); 
	  }
	  @Test
	  public void c() 
	  {
		 Reporter.log("T c is running", true); 
	  }
  }

