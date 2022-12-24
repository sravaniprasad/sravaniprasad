package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Student {
	int SNo;
	String name;
	int age;
	public Student(int sNo, String name, int age) {
		SNo = sNo;
		this.name = name;
		this.age = age;
	}

}

public class Streams {
public static void main(String args[]) {
	List<Student> list=new ArrayList<Student>();
	list.add(new Student(1,"geethika",15));
	list.add(new Student(2,"jaanu",24));
	list.add(new Student(3,"mehika",13));
	list.add(new Student(4,"sweety",30));
	
	List<Integer>Studage=new ArrayList<Integer>();
	for(Student student:list) {
		
		if(student.age<23) {
			Studage.add(student.age);	
		}	
	}
	System.out.println("---------------------------------------");
	System.out.println(Studage);
	
	
	System.out.println("---------------------------------------");
	List<Integer>Studage1=list.stream().filter(s->s.age>25).map(s->s.age).collect(Collectors.toList());
	System.out.println(Studage1);

	System.out.println("---------------------------------------");
	list.stream().filter(s->s.age>24).forEach(s->System.out.println(s.name));

	System.out.println("---------------------------------------");
	Student s1=list.stream().min((st1,st2)-> st1.age>st2.age ?1:-1).get();
	System.out.println(s1.age);

	System.out.println("---------------------------------------");
	Stream.iterate(1, e->e+1).filter(e->e%3==0).limit(5).forEach(System.out::println);
	
	System.out.println("---------------------------------------");
	
	Map<Integer, String> map=list.stream().collect(Collectors.toMap(s->s.SNo, s->s.name));
System.out.println(map);
}
}
