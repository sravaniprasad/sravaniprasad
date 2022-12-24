package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

	public static void main(String[] args) {
		
	List<String> list=new ArrayList<>();
	list.add("Divine higs");
	list.add("HoundVilla");
	list.add("VikrantRona");
	list.add("RRR");
	
	Iterator<String> itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		list.add("pagal");
	}
		
//	List<String> list1=new ArrayList<>();
//	list1.add("EvilDead");
//	list1.add("Kanchana");
//	list1.add("CallingBell");
//	list1.add("MonesterSpy");
//	
//	for (int i = 0; i < list1.size(); i++)   
//	{  
//		list1.add("Iravatam");
//		System.out.println(list1);
//		
//	}
	
	}
}
