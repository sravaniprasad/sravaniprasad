package Prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
 Shop s=new Shop();
 s.setShopName("Rajadhani");
 s.loadData();
 //s.getBooks().remove(2);
 System.out.println(s);
 

 Shop s1=(Shop) s.clone();
 s1.setShopName("heritage");
 s.getBooks().remove(2);
 System.out.println(s1);
 
// Shop s2=s.clone();
// s2.setShopName("BOOKSALE");
// s.getBooks().remove(2);
// System.out.println(s2);
 
	}

	
	
}
