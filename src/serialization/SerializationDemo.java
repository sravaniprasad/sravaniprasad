package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	 /**
	 * 
	 */
//	private static final long serialVersionUID = 3941569593261894395L;
	/**
	 * 
	 */
	private static final long serialVersionUID = 900L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = 8769121839349249172L;
	private String empName;
	private int empId;
	private int age;
	 
	Employee(String empName,int empId,int age){
		this.empName=empName;
		this.empId=empId;
		this.age=age;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
}


public class SerializationDemo {

	public static void main(String[] args) {
//		  Employee e=new Employee("Sravaniprasad", 111,23);
//          try {
//        	  FileOutputStream fout=new FileOutputStream("D:\\Ser.txt");
//            ObjectOutputStream out=new ObjectOutputStream(fout);
//          
//            
//            out.writeObject(e);
//            
//            out.close();
//            fout.close();
//            System.out.println("File Created and converted into ByteCode-----Serialization!!!");
//         }
//          catch(Exception ex) {
//        	  ex.printStackTrace();
//          }
		
		
		
		 
		try {
			FileInputStream fin=new FileInputStream("D:\\Ser.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			
			Employee e1=(Employee) in.readObject();
			
			in.close();
			fin.close();
			 System.out.println("Created file and converted from Bytecode to Object-----Serialization!!!");
			 System.out.println(e1.getEmpName()+" "+e1.getEmpId()+" "+e1.getAge());
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
//          
	}

}
