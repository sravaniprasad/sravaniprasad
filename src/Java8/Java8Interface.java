package Java8;

interface Message{
	void myMsg();  
	default void msg()
	{
		System.out.println("This is my Pet--Jakie");
	}
	void showBill(); 
	static int bill(int a,int b) {
		return a*b/10;
	}
}
class Show implements Message{

	@Override
	public void myMsg() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my Home");
	}

	@Override
	public void showBill() {
		// TODO Auto-generated method stub
		System.out.println("My Bill was showing: ");
	}
	
}
public class Java8Interface {

	public static void main(String[] args) {
	
		Message m=new Show();
		m.myMsg();
		m.msg();
		m.showBill();
	
	System.out.println(Message.bill(242, 385));	
	}
}
