package palindrome;

public class PalindromeNumber {

	public static void main(String [] args) {
		
		int num = 1121, orginalNum, reverseNum=0,remainder;
		orginalNum = num;  
		
		if(orginalNum==reverseNum) {
			System.out.println(num +" is a palindrome");
		}
		else {
			System.out.println(num +" is not a palindrome");
			
		}
		
		   //orgnum=11211
		while(num != 0) {       
			remainder=num % 10;                                 //11211 % 10--------->1
			reverseNum = reverseNum * 10 + remainder;                //0*10+1=======1
			num = num / 10;                                        // 11211 / 10=======1	
		}
		
		
	}
	
}
