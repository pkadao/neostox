package VarificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void nullCheck() 
  {
	  String a="a";
	  
	  Assert.assertEquals(a, "a value is not null,TC is Failed");
  }
}
