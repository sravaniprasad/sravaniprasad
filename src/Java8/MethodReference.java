package Java8;

import java.util.function.BiFunction;

class Arithmetic{  
public static int add(int a, int b){  
return a+b;  
}  
}  

interface Sayable{  
    void say();  
}



interface Messageable{  
    Messages getMessage(String msg);  
}  
class Messages{  
    Messages(String msg){  
        System.out.print(msg);  
    }  
}  


public class MethodReference {

	 public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	    }  
	 
	 public static void ThreadStatus(){  
	        System.out.println("Thread is running...");  
	    }  
	 
	 public static void main(String[] args) {  
	        // Referring static method  
	        Sayable sayable = MethodReference::saySomething;  
	        // Calling interface method  
	        sayable.say();  
	        
	        
	        
	        Thread t2=new Thread(MethodReference::ThreadStatus);  
	        t2.start();    
	        
	        
	        
	        BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;  
	        int result = adder.apply(10, 20);  
	        System.out.println(result);  
	        
	        
	        Messageable hello = Messages::new;  
	        hello.getMessage("Hi this is sravani");  
	    }  
}
