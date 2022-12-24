package Practice;

public class singletonClass {

	private static singletonClass singleton;
	
	
	static {
		singleton=new singletonClass();
		
	}
	
	private singletonClass() {
		
	}
	
	public static singletonClass getInstance(){
		return singleton;
		
	}
	
	public void sleep() {
		System.out.println("I love Sleeping");
	}
	public static void main(String [] args) {
	
		singletonClass s=getInstance();
		s.sleep();
		
	}
	
}
