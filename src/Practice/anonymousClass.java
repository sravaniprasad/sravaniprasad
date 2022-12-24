package Practice;

class food{
	void eat() {
		System.out.println("I want chocolates to eat");
	}
}
class Sleep{
	void sleep() {
	//	System.out.println("I want to sleep more");
		food f=new food() {
			void eat() {
				System.out.println("eat method in anonymous class");
			}
		};
		f.eat();
	}
}
public class anonymousClass {
	public static void main(String[] args) {
		
		Sleep s=new Sleep();
		s.sleep();
		
	
		
	}
}
