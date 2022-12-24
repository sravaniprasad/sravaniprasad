package string;
import java.util.*;
public class Stringtokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Token  1");
		 StringTokenizer s1 = new StringTokenizer("sravani prasad chengannagari", ", ");
		 while (s1.hasMoreTokens())
		 
		{
		 System.out.println(s1.nextToken());
		}
		 
		 System.out.println("========================================");
		 System.out.println("Token  2");
		 StringTokenizer s2 = new StringTokenizer("This Site has been developed to help programmers learn and share knowledge. Efforts have been taken to attach screen shot and provide hands on implementation details. Any feedback is welcome.", " ");
		 while (s2.hasMoreTokens())
		 {
		 System.out.println(s2.nextToken());
		 } 
		 
		 System.out.println("========================================");
		 System.out.println("Token  3");
		// StringTokenizer s3 = new StringTokenizer("sravani::prasad::chengannagari: ", ":", true);
		   StringTokenizer s3 = new StringTokenizer("sravani & prasad :: chengannagari: ", ":", true);
			
		 while (s3.hasMoreTokens())
		{
		 System.out.println(s3.nextToken()); 
		}
	}
}

