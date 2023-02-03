package exception;

public class ExcEg2 {

	public static void main(String[] args) 
	{
		String a="abc";
		
		try {
			//risky code
			System.out.println(a.charAt(11));
 
			System.out.println("hello");
		}
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("please select index range between 0-2");
		}
		
		System.out.println("Good evining");

	}

}
