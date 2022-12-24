package Practice;

import java.util.Hashtable;

public  class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="sravani";
		String s2="prasad";
		s1.concat(s2);                    //sravani
		System.out.println(s1);
		
		
		
		
		StringBuffer st=new StringBuffer("Icecream parlour");
		StringBuffer str=new StringBuffer("Icecream");
		
	Hashtable<StringBuffer, Integer> ht=new Hashtable<>();
	ht.put(st,1);                                // 1--------Icecream
	ht.put(str, 2);
	str.append("Scoops");                           //1--------ICECREAM
	                     
	System.out.println(str);
	//Integer e=ht.get(str);
	//System.out.println(e);
	
	
		StringBuffer sb1=new StringBuffer("Romeo ");
		StringBuffer sb2=new StringBuffer("juliet ");
		StringBuffer sb3=new StringBuffer("LoveStory ");
		
		sb1.append(sb2);
		sb2.append(sb3);
		System.out.println(sb1);
		System.out.println(sb2);
		
	}

}
