package Practice;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int reverse=0,remainder;
		System.out.println("enter your number");
		int n=sc.nextInt();
		while(n!=0) {
			remainder=n%10;
			reverse=reverse*10+remainder;
			n=n/10;
			
		}
		System.out.println("reverse number is "+reverse);
	}
}
