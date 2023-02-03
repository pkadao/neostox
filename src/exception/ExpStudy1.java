package exception;

public class ExpStudy1 {

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int c=0;
		try {
			c=a/b;//risky code
			
		}
		catch (ArithmeticException  e)
		{
			System.out.println("b value should not be zero");
		}
		System.out.println(c);
		System.out.println("Good evining");
	}

}
