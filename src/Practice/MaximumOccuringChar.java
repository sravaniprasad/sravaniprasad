package Practice;

import java.util.Scanner;

public class MaximumOccuringChar {
		public static void main(String[] args) {
		  String maximumoccured;
    		char maxChar = ' ';
    		int i, maxtimes = -1;
			int[] charnumberoftimes= new int[256];
					
			Scanner sc= new Scanner(System.in);

			System.out.print("\nEnter a String  =  ");
					 maximumoccured = sc.nextLine();
					
			for(i = 0; i <  maximumoccured.length(); i++)
			{
				charnumberoftimes [ maximumoccured.charAt(i)]++;
						
					char ch =  maximumoccured.charAt(i);
					if(maxtimes < charnumberoftimes[ch]) 
						{
							maxtimes = charnumberoftimes[ch];
							maxChar = ch;
						}
					}
			System.out.println("\nThe Maximum Occurring Character = " +  maxChar);
			System.out.format("'%c' Character Occurs %d Times ", maxChar, maxtimes);	
					
				}
			}
