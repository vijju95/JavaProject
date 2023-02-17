package HashMapC;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Student{

	int rollNumber;
	String name;
	char division;
	
	Student(int rollNumber, String name, char division){
		this.rollNumber=rollNumber;
		this.name=name;
		this.division=division;
	}
	
	public String toString() {
		System.out.println("------------------------");
		return "Roll number is : "+rollNumber+"\n"+"Name of student is : "+name+"\n"+"Division of student is : "+division;
	}
}

public class HashMapObject {

	public static void main(String[] args) {
		
	HashMap<Integer,Student> hm=new HashMap<Integer,Student>();
	
	Student s=new Student(19, "Vijay", 'B');
	Student s1=new Student(20, "Prasad", 'A');
	Student s2=new Student(21, "Pranay", 'B');
	Student s3=new Student(22, "Happy", 'C');
	
	hm.put(1, s);
	hm.put(2, s1);
	hm.put(3, s2);
	hm.put(4, s3);
	
	Set<Entry<Integer, Student>> c=hm.entrySet();
	Iterator it=c.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	}
}
