package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=new ArrayList<>();
		
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			Integer n=itr.next();
			//list.add(201);
			System.out.println(n);
			
			
			if(n==40) {
				//list.remove(3);
				
				itr.remove();
			}
		}
		System.out.println(" Vaules in List "+list);    
		
//		ConcurrentHashMap<Integer, String> map=new ConcurrentHashMap<Integer,String>();
//		map.put(111,"sravani");
//		map.put(222, "Sravanthi");
//		map.put(333, "lalli");
//	
//		
//		Iterator<Entry<Integer, String>> itr=map.entrySet().iterator();
//		
//		while(itr.hasNext()) {
//			Map.Entry<Integer, String>pair=(Map.Entry<Integer, String>)itr.next();
//		System.out.println(pair.getKey()+" : "+pair.getValue());
//		
//		map.put(555, "dummy");
//		}
	}

}
