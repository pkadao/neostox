package VarificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void trueCheck() 
  {
	  boolean a = false;
	  
	  Assert.assertEquals(a,"a value is false,TC is failed" );
  }
}
