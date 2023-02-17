package HashSetC;

import java.util.HashSet;
import java.util.Iterator;

class student{

	int roll_number;
	String name;
	
	student(int roll_number, String name){
		this.roll_number=roll_number;
		this.name=name;
	}
	
	public String toString() {
		return "\n"+"Rollnumber of student : "+roll_number+"\n"+"Name of student : "+name;
	}
}
public class HashSetStudent {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		student s=new student(19, "Vijay");
		hs.add(s);
		hs.add(new student(18, "Pranay"));
		hs.add(new student(20, "Prasad"));
		hs.add(new student(21, "kUnAl"));
	
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}