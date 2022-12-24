package OOPSConcepts;
import java.util.Scanner;

public class Abstracts extends Atm{
	
	Scanner sc=new Scanner(System.in);
	int balance=5000;
	int m=3000;
	@Override
	void Withdraw() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter money to withdraw ");
		
		int money=sc.nextInt();

		if(money>5000) {
			System.out.println("Insufficient Balance");
		}
		else {
			
		try {
			Thread.sleep(2000);
			System.out.println("please Wait.......");
			Thread.sleep(1000);
			System.out.println("collect Your cash");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	

	@Override
	void CheckBalance() {
		int pin=4343;
		int current=balance-m;
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
			System.out.println("check balance");
			System.out.println("enter your pin to check balance");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int p=sc.nextInt();
		if(p==pin) {
			System.out.println("your current balance is: " +current);
		}
		else {
			System.out.println("Invalid Pin");
		}
	}
	
	
}