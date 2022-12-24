package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
				map.put("masuma", "178");
				map.put("jiya", "232");
				map.put("smith", "129");
				map.put("viratkohli", "199");
				map.put("viratkohli", "299");
				map.put(null, "hff");
				
				for(Map.Entry hashmap:map.entrySet()){  
					   System.out.println(hashmap.getKey()+" "+hashmap.getValue());  
					 //  map.put("jhh", "hghhg");
					  } 
				
				System.out.println("HashMap: " +map);
//				System.out.println("Num: " +map.get("masuma"));
//				System.out.println("Num " + map.get("smith"));
//				System.out.println("Num: " +map.get("smith"));
//				System.out.println("Num: " +map.get("viratkohli"));
//		
				
				 Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
				  hm.put(100,"Amit");  
				  hm.put(102,"Ravi");  
				  hm.put(101,"Vijay");  
				  hm.put(103,"Rahul"); 
				 // hm.put(null, null);
				  System.out.println("Hashtable: " +hm);
				  
				  for(Map.Entry hashtable:hm.entrySet()){  
				   System.out.println(hashtable.getKey()+" "+hashtable.getValue());  
				 //  hm.put(23, "amith");
				  }  
				
	}
}