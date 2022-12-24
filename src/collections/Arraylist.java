package collections;
import java.util.*;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList <String> a=new ArrayList<String>();
		a.add("panipuri");
		a.add("paubaaji");
		a.add("biriyani");
		a.add("roti parata");
		a.add("roti parata");
		
		System.out.println("arraylist of a: "+a);
//		List<String>unmodifiableList= Collections.unmodifiableList(a);  
//	    unmodifiableList.add("read only"); 
		
		
		ArrayList <String> b=new ArrayList<String>();
		b.add(new String("1st"));
		b.add(new String("2nd"));
		b.add(new String("3rd"));
		b.add(new String("4rh"));
		
      	System.out.println("arraylist of b: "+b);
		
		System.out.println(".....................");
		System.out.println("index 0 in 'b' list: "+b.get(0));
        System.out.println("index 0 in 'a' list: "+a.get(0));	
        
        
        
        int[] a1 = {42,17,32,19,21};
        int[] a2 = {43,22,32,91,20,2,44};
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    System.out.println(a1[i]);
                }
            }
        }
        
        LinkedHashSet<String> set=new LinkedHashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
//        Iterator<String> i=set.iterator();  
//        while(i.hasNext())  
//        {  
//        System.out.println(i.next());  
//        }  
        System.out.println(set);
        
	}

}
//Create an ArrayList of Employee( id,name,address,sal) objects 
//and search for particular Employee object based on id numbe

		
		
		
		
		
		