package Practice;

abstract class Movie{
	
	public void movieName() {
		System.out.println("RRR");
	}
	public void movieHero() {
		System.out.println("RamCharan");
	}
	
	public abstract int TicketPrice(); 
}

class Hyderabad extends Movie{

	@Override
	public int TicketPrice() {
		System.out.println("Ticket Price is 500rs in Hyderabad");
		return 0;
	}
	
}

class Bangalore extends Movie{

	@Override
	public int TicketPrice() {
		System.out.println("Ticket Price is 700rs in Bangalore");
		return 0;
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hyderabad h=new Hyderabad();
h.movieName();
h.movieHero();
h.TicketPrice();


Bangalore b=new Bangalore();
b.movieName();
b.movieHero();
b.TicketPrice();
	}

}
