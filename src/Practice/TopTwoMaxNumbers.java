package Practice;

import java.util.Arrays;

public class TopTwoMaxNumbers {

	public static void main(String [] args) {
		
		
		int temp;
		int array[]= {11,67,82,43,99,170};
		
		int size=array.length;
		
		for (int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		Arrays.sort(array);
	
		System.out.println("sorted Array :  "+Arrays.toString(array));
		
	System.out.println("Top two Maximum numbers are: "+array[5] +" and "+array[4]);
	}
}
