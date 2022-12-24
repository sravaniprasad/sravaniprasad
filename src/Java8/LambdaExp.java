package Java8;

import java.util.ArrayList;
import java.util.List;

interface lambda3{
	public String call(String name);
}
interface lambda2{
	public String eat();
}
interface lambda1{
	public void sleep();
}
interface lambda{
	public void sing();
}


interface Addition{
	public int doAdd(int a, int b);
}

public class LambdaExp {

	public static void main(String [] args) {
		int sleep=8;
		String s="Azure Technologies ";
		
              //without lambda expression
//		lambda l=new lambda(){
//		public void sing() {
//			System.out.println(s);
//		}
//		};
		
		
//with lambda expression
		lambda l=()->{
			System.out.println("i will sing");
		};
		l.sing();
		
		//with lambda------(No parameter)
		lambda2 l2=()->{
			return "i love eating";
		};
		
		System.out.println(l2.eat());
		
		
//using single parameter
		lambda3 l3=(name) ->{
			return "call from "+name;
		};
		//System.out.println(l3.call(s));
		System.out.println(l3.call("Cisco"));
		
		
		
		
		lambda1 l1=()->{
			System.out.println("I will sleep more than "+sleep+" hours");
		};
		l1.sleep();
		
		
		
//using multiple parameters
		Addition add=(a,b)->(a+b);
			System.out.println(add.doAdd(2345, 6789));
		
			
			List<String> li=new ArrayList<>();
			li.add("lollipops");
			li.add("chocolates");
			li.add("lays");
			li.add("sandwich");
			
			li.forEach((n)->System.out.println(n));
	}
	
}
