package exception;

public class MultipleCatchBlocks {

	public static void main(String[] args)
	{
		
     String a=null;
     
 	try 
	{
	  System.out.println(a.charAt(5));	
	}
	
	catch (StringIndexOutOfBoundsException e) 
	{
		System.out.println("index range should be 0-1");
	}
	
	catch (NullPointerException e)  
	{
		System.out.println("a value should not be null");
	}
}
}
