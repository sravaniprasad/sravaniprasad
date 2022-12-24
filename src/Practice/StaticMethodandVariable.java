package Practice;

class SravaniPrasad{
	int id;
	String name;
	static String College="KSRM";
	
	
SravaniPrasad(int i, String nm){
	id=i;
	name=nm;
}

void display() {
System.out.println(id+ " "+name+ " " +College);
}
static void change() {
	College="KLMCEW";
}
}
public class StaticMethodandVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SravaniPrasad.change();
		SravaniPrasad s=new SravaniPrasad(101, "sravani  ");
        SravaniPrasad s1=new SravaniPrasad(102,"sravanthi");
        
        s.display();
        s1.display();
	}

}
