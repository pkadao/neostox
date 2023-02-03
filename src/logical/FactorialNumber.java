package logical;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) 
	{
		//4!=4*3*2*1
		//5!=5*4*3*2*1
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please entr any Number");
		
		int num=sc.nextInt();
		
		int fact=1;
		
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+ " is "+fact);

	}

}
