package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSetMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Using List
		List< String >names=new ArrayList<>();
		names.add("sravani");
		names.add("deepa");
		names.add("are");
		names.add("best buddies");
		System.out.println(names);
		
		
		List<String> courses = Arrays.asList("C","Core Java","Core Java","Spring","SpringBoot", "Hibernate", "SQL Databases");
		System.out.println(courses);
		Set<String> result_set = new LinkedHashSet<String>(courses);
		
		System.out.println(result_set);
	      
		
//		for (int i = 0; i < courses.size(); i++) {
//            String course = courses.get(i);
//            printCourse(courses);
//        }
		System.out.println("List Using Streams");
        
		courses.stream().forEach(course -> printCourse(course));

		
		System.out.println("List Using For-Each loop");
        for (String course: courses) {
            printCourse(course);
        }
		
        
        
        //using set
        Set < String > set = new HashSet< String > ();
        set.add("sravani");
        set.add("prasad");
        set.add("Chengannagari");
        set.add("prasad");
        set.add("chinni");
        System.out.println("Set Values are");
        System.out.println(set);
        
        System.out.println("Set using for");
        for (String setvalues: set) {
            setPrinter(setvalues);
        }
        
        System.out.println("Set Using Iterator");
        Iterator < String > it = set.iterator();
        while (it.hasNext()) {
            String setVal = it.next();
            setPrinter(setVal);
        }
        
        Map<Integer, String> map=new HashMap<Integer,String>();
        map.put(111, "delhi");
        map.put(222, "hyderabad");
        map.put(333, "mumbai");
        map.put(444, "kashmir");
        System.out.println(" Using map");
        
        System.out.println(map);
        
        System.out.println("Map Using lambda Expressions");
        map.forEach((k, v) -> placePrinter(k, v));

        System.out.println("Map Using Iterator");
        Iterator < Map.Entry < Integer, String >> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
        	Map.Entry<Integer, String> places=iterator.next();
        	placePrinter(places.getKey(),places.getValue());
        }
        
	}
	
	
	

	private static void placePrinter(Integer key, String value) {
		// TODO Auto-generated method stub
		System.out.println("Place Code:"+key+" Place Name: "+value);
	}




	private static void setPrinter(String setvalues) {
		// TODO Auto-generated method stub
		System.out.println("Setvalues are ===== " + setvalues);
		 
		
	}


	private static void printCourse(String courses) {
		// TODO Auto-generated method stub
		System.out.println("course name ===== " + courses);
		   
	}

}
