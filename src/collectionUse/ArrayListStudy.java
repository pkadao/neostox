package collectionUse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) 
	{
		ArrayList<Object>al=new ArrayList<>();
		al.add("123");
		al.add('A');
		al.add(null);
		al.add(12.12f);
		al.add(true);
		
		System.out.println("=============================using for loop=================");
		for(int i=0;i<=al.size()-1;i++)
		
		{
		
			System.out.println(al.get(i));
		}
		
		System.out.println("====================using iterator===============================");
		
		Iterator<Object>it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===========================using list Iterator==========================");
		
		ListIterator<Object>li=al.listIterator();
		
		while(li.hasNext()) 
		{
		  System.out.println(li.next());	
		  
		}
		
		System.out.println("======================using for each====================================");
		
		for(Object a:al)
		{
			System.out.println(a);
			
		}
		


	}

}
