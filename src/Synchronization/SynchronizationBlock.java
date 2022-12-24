package Synchronization;

class Students{
public  void printMarks(int a) {
	synchronized(Students.class){
		
		for(int i=20;i<=30;i++) {
		System.out.println(a+i);
		
		try {
			Thread.sleep(200);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
 }
	
}


public void print(int a) {
	 synchronized(Students.class){
		
	for(int i=20;i<=30;i++) {
	System.out.println(a+i);
	
	try {
		Thread.sleep(200);
		
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
}
  }

	class Stud11 extends Thread{
		Students s;
		Stud11(Students s){
			this.s=s;
		}
public void run() {
	s.printMarks(10);
}
	}
	
	
	
	
	class Stud22 extends Thread{
		Students s;
		Stud22(Students s){
			this.s=s;
		}
public void run() {
	s.printMarks(20);
}
	}
	
	
	
	
	class Stud33 extends Thread{
		Students s;
		Stud33(Students s){
			this.s=s;
		}
    public void run() {
	s.print(10);
}
	}
public  class SynchronizationBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students obj=new Students();
Stud11 s1=new Stud11(obj);
Stud22 s2=new Stud22(obj);

Stud33 s3=new Stud33(obj);
s1.start();
s2.start();
s3.start();
}

}
