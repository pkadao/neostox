package logical;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int num=2;
		int count=0;
		
		for (int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println("Given Number is not Prime Number");
		}
		else
		{
			System.out.println("Given Number is Number");
		}

	}

}
