package pattern;

public class Eg3 {

	public static void main(String[] args) 
	{
        //*
	    //**
		//***
	    //****	
		//*****
		
		//row-->5 columns-->5
		
		int star=1;
		
		//outer for loop-->Row
		
		for(int row =1;row<=5;row++)
		{
			//inner for loop-->columns
			
			for(int column=1;column<=star;column++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
	}

}
