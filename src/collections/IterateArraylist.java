package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class IterateArraylist {

	
	public static void main(String[] args) {
	
		ArrayList<String> movies=new ArrayList<>();
		movies.add("Heaven in the Sky");
		movies.add("Vikranth Rona");
		movies.add("Romeo Juliet");
		
		System.out.println("printing like a list: "+movies);
		
		System.out.println("=========using for loop============");
		
		for(int i = 0; i < movies.size(); i++) {
		      System.out.print(movies.get(i));
		      System.out.println(", ");
		    }
		
//		System.out.println("=========using forEach loop============");
//		for(String movie: movies) {
//			
//			 System.out.print(movie);
//			 System.out.print(",");
//		}
		
		System.out.println("=========using ListIterator============");
		ListIterator<String> iterate=movies.listIterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next()+", ");
		}
	}
}
