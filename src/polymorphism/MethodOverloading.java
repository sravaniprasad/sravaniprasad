package polymorphism;
class Add{
	
	static int add(int a,int b)
	{
		return a+b;
		}  
	static void add(String name,int age)
	{
		System.out.println("name is: "+name+" & age is: "+age);
		}  
	
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a=new Add();
//		a.add(21, 31);
//		a.add("sravani", 23);
System.out.println(Add.add(43, 12));
Add.add("sravani", 23);
	}

}
