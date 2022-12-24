package Practice;

import java.util.ArrayList;
import java.util.List;

class Students{
	private String phNo;

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	
	
	
}

class Teacher{
	private String name;
	List<Students> num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Students> getNum() {
		return num;
	}
	public void setNum(List<Students> num) {
		this.num = num;
	}
	
	
	
}
public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Students s=new Students();
	s.setPhNo("7659932939");
	
	Teacher t=new Teacher();
	t.setName("madhavi");
	
	List<Students> list=new ArrayList<>();
	list.add(s);
	t.setNum(list);
	
	System.out.println(t.getName()+"  "+t.getNum());
	
	}

}
