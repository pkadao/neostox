package VarificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
  @Test
  public void CheckFalse() 
  {
	  boolean a=true;
	  
	  Assert.assertEquals(a," a value is true,TC is failed");
  }
}
