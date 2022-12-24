package string;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
	
	//TODO: Implement in java8  
	public static String rev(String str) {
		return Stream.of(str).map(r->new StringBuffer(r).reverse()).collect(Collectors.joining(""));
	}
	
	public static void main(String[] args) {
	
		
		String str="sravani";
		System.out.println(rev("Masti with manjusha"));
		
		
		
		String reversed = Arrays.asList(str.split("\\.")).stream().map(m -> new 
				StringBuilder(m).reverse().toString()).collect(Collectors.joining("."));
				System.out.println(reversed);
		
				
				
	int i=str.length();
//	while(i>0) {
//		System.out.print(str.charAt(i-1));
//		i--;
//	}
	
	for(i=str.length();i>0;--i) {
		System.out.print(str.charAt(i-1));
	}
	
	}
}
