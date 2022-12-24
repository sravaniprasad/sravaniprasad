package Practice;

abstract class Girl{                  //abstract class
	
	abstract void name();             //abstract method
	
	void display() {                  //concrete method
		System.out.println("I am Sravani: from Girl class");
	}
	
	Girl(){
		System.out.println("Girl Constructor");
	}
}

class Parent extends Girl{

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("she is a D/o prasadChengannagari: from Parent class");
	}

}
public class abstractClassandMethods {

	public static void main(String[] args) {
//	Girl g=new Girl();
		Parent p=new Parent();
		
		
		p.display();
		p.name();	
	}
}


