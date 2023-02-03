package collectionUse;

import java.util.Iterator;
import java.util.LinkedHashSet;



public class LinkHashsetStudy {

	public static void main(String[] args) 
	{
		LinkedHashSet<Object>lh=new LinkedHashSet<>();
		lh.add("Pune");
		lh.add("Nagpur");
		lh.add("Kamthi");
		lh.add("Mouda");
		lh.add("Agra");
		lh.add(null);
		lh.add(null);
		lh.add("Thane");
		
		System.out.println(lh);
		
		System.out.println(lh.size());
		
		System.out.println("=============for each=====================");
		for(Object h:lh);
		{
			System.out.println(lh);
		}
		System.out.println("==============Iterator====================");
		
         Iterator<Object>it=lh.iterator();
	}

}
