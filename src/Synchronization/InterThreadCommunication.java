package Synchronization;

class Account{
	int balance=500;
	
	synchronized public int withdraw(int withdrawAmount) {
		
		
		System.out.println("Before withdraw  "+balance);
		
		if(balance<withdrawAmount ) {
			System.out.println("Insufficient balance.wait for deposit");
			try {
				wait();
				//Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance=balance-withdrawAmount;
		System.out.println("After withdraw: "+balance);
		return withdrawAmount;
		
	}
	
	
synchronized	public void deposit(int depositAmount) {
		System.out.println("deposit starts");
		System.out.println("before deposit: "+ balance);
		balance=balance+depositAmount;
		System.out.println("After deposit: "+balance);
	notify();
		
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final Account acc=new Account();
		new Thread() {
		public void run() {
			acc.withdraw(700);
		}
		}.start();
		
		
		new Thread() {
			public void run() {
				acc.deposit(500);
			}
			}.start();
		
	}

}
