package logical;

public class CountNumberOfBlankSpaces {

	public static void main(String[] args) 
	{
		String s="PUNE";
		int count=0;
		
		for(int i=0;i<s.length()-1;i++)
		{
			char t=s.charAt(i);
			if(t==' ')
			{
				count++;
			}
		}
		System.out.println("Number of Blank space are "+count  );
	}

}
