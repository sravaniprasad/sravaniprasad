package string;

import java.util.Hashtable;

public class Equals {

	public static void main(String[] args) {
		String s1="Icecream parlour";
		String s2="Icecream";
		
		String s3="maya";
	Hashtable<String, Integer> ht=new Hashtable<>();
	ht.put(s2,1);                                // 1--------Icecream
	ht.put(s3, 2);                               //2---------maya
	ht.put("love", 3);
	s2.toUpperCase();                           //1--------ICECREAM
	s3.toUpperCase();                           //2--------MAYA
	
	System.out.println(s2);
	Integer e=ht.get("ICECREAM");
	
	
		System.out.println(e);
		if(s1.equals(s2))   
		{
			System.out.println("s1 is equals to s2");
		}
		else 
		   {
				System.out.println("s1 is not equals to s2");
			}
		if (s1==s2) 
		{
			System.out.println("s1 and s2 are same strings");
		}
		else
		{
			System.out.println("s1 and s2 are not same strings");
		}
	}
}
