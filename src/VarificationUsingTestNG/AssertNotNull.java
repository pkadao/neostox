package VarificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void NotNullCheck() 
  {
	  String a=null;
	  
	  Assert.assertNotNull(a,"a value is null,TC is failed");
  }
}
