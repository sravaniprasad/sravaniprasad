package OOPSConcepts;

import java.util.Scanner;

abstract class Atm{
	abstract void Withdraw();
	abstract void CheckBalance();
	
	
	public void display() {
		System.out.println("======================Welcome to Branch SBI========================");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstracts a=new Abstracts();
		a.display();
		a.Withdraw();
		a.CheckBalance();
		
	}

}
