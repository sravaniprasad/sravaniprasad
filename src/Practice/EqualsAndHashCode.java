package Practice;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student1{
	private int id;
	private String name;
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + "]";
	}
}
public class EqualsAndHashCode extends Object{
	public static void main(String[] args) {
		
	
		
		
		int a=10;
		int b=20;
		
		System.out.println(a==b);
		
		String s1=new String("Sravani");
		String s2=new String("Sravani");
		
		System.out.println(s1.equals(s2));
		
		
		Student1 st1=new Student1(1,"deepa");
		Student1 st2=new Student1(1,"deepa");
		
		System.out.println(st1==st2);              //false
		System.out.println(st1.equals(st2));       //true
		if(st1.equals(st2)) {
			System.out.println(st1.hashCode()+"   "+st2.hashCode());
		}

		
		Set<Student1>student=new HashSet<>();
		student.add(st1);
		student.add(st2);
		
		
		System.out.println(student);
		
		
	}

	
}
