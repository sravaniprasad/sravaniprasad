package Synchronization;

class Student{
	synchronized void printMarks(int a) {
		for(int i=20;i<=30;i++) {
		System.out.println(a+i);
		
		try {
			Thread.sleep(100);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
	
}
	class Stud1 extends Thread{
		Student s;
		Stud1(Student s){
			this.s=s;
		}
public void run() {
	s.printMarks(10);
}
	}
	
	class Stud2 extends Thread{
		Student s;
		Stud2(Student s){
			this.s=s;
		}
public void run() {
	s.printMarks(20);
}
	}
	
public  class SyncronizationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj=new Student();
Stud1 s1=new Stud1(obj);
Stud2 s2=new Stud2(obj);
s1.start();
s2.start();
}

}
