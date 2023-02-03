package VarificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy2 
{
	 SoftAssert soft=new SoftAssert();
	 
  @Test
  public void myTest2() 
  {
      String a="abc";
	  
	  String b="abc";
	  
	  
	  soft.assertNull(a, "a is not null TC failed");
	  soft.assertNotEquals(a,b,"a and b are equal TC is failed");
      soft.assertAll();
  }
  
  @Test
  public void myTest3()
  {
	  boolean a = true;
	  boolean b = false;
	  
	  soft.assertTrue(b, "b is false TC failed");
	  soft.assertNotEquals(a,a,"a is true TC is failed");
      soft.assertAll();
	  
	  
  }
}
