package VarificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
  @Test
  public void myTest1() 
  {
	  
	  String a="abc";
	  
	  String b="abc";
	  
	  SoftAssert soft=new SoftAssert();
	  
	  soft.assertNull(a, "a is not null TC failed");
	  soft.assertNotEquals(a,b,"a and b are equal TC is failed");
      soft.assertAll();
     
     Assert.assertNull(a," a is not null TC is failed");
     
     Assert.assertNotEquals(a,b,"a and b are equal TC is failed");
      
	  
  }
}
