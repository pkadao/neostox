package VarificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNoEquals {
  @Test
  public void notEquals() 
  {
	  String a="abc";
	  
	  String b="abcd";
	  
	  Assert.assertNotEquals(a,b,"a and b are equals,TC is Failed");  }
}
