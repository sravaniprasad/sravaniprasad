package polymorphism;
class Super{
	public void run() {
		System.out.println("this is super class");
	}
}
class Sub extends Super{
	public void run() {
		System.out.println("this is sub class");
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Sub obj=new Sub ();
   obj.run();
	}

}
