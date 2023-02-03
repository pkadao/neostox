package logical;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args)
	{
          //int a=10;
		//int b=2;
		
		// int mul=a*b;
		//System.out.println(mul);
		
		//scanner-->java-->util
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name");
		
		String name=sc.next();
		
		System.out.println("My Name is "+name);
		}

}
