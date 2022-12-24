package Practice;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(); 

		e.setName("Sravani Chengannagari"); 

		e.setAge(23); 

		e.setEmpID(12345); 

		System.out.println(e.getEmpID()+" -- "+ e.getName()+" -- "+e.getAge()); 
}

}
