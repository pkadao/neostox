package logical;

public class ReverseNumber {

	public static void main(String[] args)
	{
	  int orgNum=1234;
	  String orgstr=Integer.toString(orgNum);
	  
	  String revStr="";
	  
	  for(int i=orgstr.length()-1;i>=0;i--)
	  {
		 char t=orgstr.charAt(i);
			revStr=revStr+t;	 
	  }
	  
	  int revNum=Integer.parseInt(revStr);
	  
	  System.out.println("Orignal Number is "+orgstr);
	  System.out.println("Reverse Number is "+revStr);

	}

}
