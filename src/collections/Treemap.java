package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<String,Integer> range=new TreeMap<>();
		range.put("panipuri", 1);
		range.put("chicken65", 2);
		range.put("pasta", 3);
		range.put("chocolates", 4);
		range.put("chicken65", 9);
		System.out.println(range);
		
		int val=range.get("chicken65");
		System.out.println(val);
		
		range.replace("pasta", 7);
		System.out.println(range);
		
		
		TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay"); 
		  al.add("Gayathri");
		  al.add("Ravi");  
		  al.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		
	}
}
