package Synchronization;


//A Class used to send a message

class College{
	
	public void names(String faculty) {
		
		synchronized (College.class) {
			
			for(int i=1;i<=10;i++) {
				System.out.println(i+" Faculty Name: "+faculty);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
	}
}
class Faculty extends Thread{
	College c;
	String fac;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		c.names(fac);
	}
	public Faculty(College c, String fac) {
		this.c = c;
		this.fac = fac;
	}	
}
public class  SyncBlock
{
	public static void main(String args[])
	{
		
	College obj=new College();
	College obj1=new College();
	
	Faculty s=new Faculty(obj,"mamatha");
	Faculty s1=new Faculty(obj1,"anusha");
	s.start();
	s1.start();
	
	}
}
