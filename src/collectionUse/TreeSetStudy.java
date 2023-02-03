package collectionUse;

import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args)
	{
		TreeSet<Object>t=new TreeSet<>();
	
	
	t.add('Z');
	t.add('A');
	t.add('H');
	t.add('G');
	t.add('O');
	t.add('P');

	
	System.out.println("==========================================");
	
	t.add("Pune");
	t.add("Nashik");
	t.add("Mumbai");
	t.add("Kamthi");
	
	
	t.add(10);
	//add(8)
	t.add(1);
	//add(4)
	
	t.add(3);
	t.add(5);
	t.add(2);
	t.add(8);
	t.add(6);
	t.add(7);
	System.out.println(t);

}
}
