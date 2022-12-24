package palindrome;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String [] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any String");
	String str = sc.nextLine();
//	String orgStr=str;
//	String rev="";
//	int len=str.length();
//	
//	for(int i=(len-1);i>=0;--i) {
//		rev+= str.charAt(i); 
//	}
//	
//	if(orgStr.toLowerCase().equals(rev.toLowerCase()));
//	System.out.println(str+ " is a palindrome");
//	}
		String  reverseStr = "";
	    
	    int strLen= str.length();

	    for (int i = (strLen - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }
	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }	
	}
	
	//	System.out.println(str+ " is not a palindrome");
	
}
