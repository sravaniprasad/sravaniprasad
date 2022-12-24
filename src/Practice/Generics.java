package Practice;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> num=new ArrayList<Integer>();
num.add(12);
num.add(20);
//num.add("sravani");


addStringToNums(num);

//for(int i=0;i<num.size();i++) {
//	System.out.println(num.get(i));
//}

for(int i:num) {
	System.out.println(i);
}

}

	private static void addStringToNums(List li) {
		// TODO Auto-generated method stub
        li.add(30);
        li.add("sravani");
	}

}
