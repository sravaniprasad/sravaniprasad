package Practice;


class outerClass{
	
	class innerClass{
		void InnerMethod() {
			System.out.println("inner class");
		}
	}
	
	void outerMethod() {
		System.out.println("outer class");
	}
	
}
public class InnerClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
outerClass o=new outerClass();
o.outerMethod();

//innerClass i=new innerClass();
//i.outerMethod();

outerClass.innerClass i=new outerClass().new innerClass();
	i.InnerMethod();
	}

}
