package Practice;

public class SwaptwoNumbers {
	public static void main(String[] args) {
	 int a = 10;
     int b = 20;
     System.out.println("Before swapping:");
     System.out.println("a value: "+a);
     System.out.println("b value: "+b);
    
     int temp=a;
     a=b;
     b=temp;
     
     
//     a = a+b;
//     b=a-b;
//     a=a-b;
     System.out.println("After swapping:");
     System.out.println("a value: "+a);
     System.out.println("b value: "+b);
     
     
     String name1="maya";
     String name2="siya";
     System.out.println("Before swapping:");
     System.out.println("name1 : "+name1);
     System.out.println("name2 : "+name2);
     String strTemp=name1;
     name1=name2;
     name2=strTemp;
     System.out.println("after swapping:");
     System.out.println("name1 : "+name1);
     System.out.println("name2 : "+name2);
    
 }
}
