package collectionUse;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args)
	{	
		Vector<Object>v=new Vector<>();
		
		v.add("Pune");
		v.add(123);
		v.add(123.34f);
		v.add("A");
		v.add(null);
		v.add(null);
		v.add("Pune");
		v.add("Hello");
		v.add(3344);
		v.add(24);
		
		
		System.out.println(v.capacity());
        System.out.println(v.size());
        System.out.println(v);
        
        v.add(3,"Velocity");
        
        System.out.println(v);
        System.out.println("===========================================================");
        
        //v.clear()
        System.out.println(v.isEmpty());
        System.out.println("==============================================");
        
        System.out.println(v.elementAt(8));
        System.out.println("===========================================================");
            System.out.println(v.firstElement());
        System.out.println("============================================================");
       
        System.out.println(v.indexOf("Velocity"));
       System.out.println("===============================================================");
        
        System.out.println(v.lastElement());
        System.out.println("===============================================================");
       
       System.out.println(v.lastIndexOf(null));        System.out.println("==============================================================");
                System.out.println(v.remove(0));
        System.out.println(v);
        System.out.println("==============================================================");
        
       v.set(0, 565);       
        System.out.println(v);
       System.out.println("===============================================================");
        
        System.out.println("traversing trough vector");
        //traversing through vector 
      //for-loop-->get?,for each,iterator,listIterator,enumeration
       
        System.out.println("================================for loop==============================");
       
       for(int i=0;i<=v.size()-1;i++)         {
       	System.out.println(v.get(i));
       
       }
       System.out.println("===========================for each loop=================================");        
        for(Object m:v) 
        {
        	System.out.println(m);
        	
        }
       
        System.out.println("=============================iterator======================================");
        Iterator<Object> it=v.iterator();        
        while(it.hasNext());
        {
        	System.out.println(it.hasNext());
        }
        System.out.println("================================list-iterator=============================");
        
        ListIterator<Object>li=v.listIterator();
                while(li.hasNext());        {
        	System.out.println(li.hasNext());
        }
       System.out.println("=============================enumeration================================");
        
        Enumeration<Object>en=v.elements();
        while(en.hasMoreElements())
        {
        	System.out.println(en.nextElement());
     }
        
	}
}
	


