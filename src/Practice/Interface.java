package Practice;
interface Mummy{
	void shouting();
}
class Sravani implements Mummy{

	@Override
	public void shouting() {
		// TODO Auto-generated method stub
		System.out.println("Mummy Shouts-Sravani Cries");
	}
	
}
class Sravanthi implements Mummy{

	@Override
	public void shouting() {
		// TODO Auto-generated method stub
		System.out.println("lalli Shouts-Mummy Cries");
	}
	
}
public class Interface {
	public static void main(String args[]) {
		Mummy m=new Sravanthi();
		m.shouting();		
	}

}
