package HashMapC;

import java.util.HashMap;

class Studentsub {

	String name;
	int id;
	
	Studentsub(String name, int id){
		this.name=name;
		this.id=id;
	}
	
	public String toString() {
		return "Name of student is : "+name+"\n"+"   "+"Id is : "+id+"\n";
	}

}

class Studentsub2 {

	String tutorial;
	int fees;
	
	Studentsub2(String tutorial, int fees){
		this.tutorial=tutorial;
		this.fees=fees;
	}
	
	public String toString() {
		return "tutorial of student is : "+tutorial+"\n"+"  "+"Id is : "+fees+"\n";
	}

}

public class StudentMain {
	public static void main(String[] args) {
		HashMap<Studentsub2, Studentsub> hm=new HashMap<Studentsub2, Studentsub>();
		
		Studentsub s=new Studentsub("Vijay", 19);
		Studentsub s1=new Studentsub("Pranay",23);
		Studentsub s2=new Studentsub("Prasad",21);
		Studentsub s3=new Studentsub("Happy",20);
		
		Studentsub2 s4=new Studentsub2("Chate coaching", 40000);
		Studentsub2 s5=new Studentsub2("SICM", 15000);
		Studentsub2 s6=new Studentsub2("SICM", 15000);
		Studentsub2 s7=new Studentsub2("SICM", 15000);
		
		hm.put(s4, s);
		hm.put(s5, s1);
		hm.put(s6, s2);
		hm.put(s7, s3);
		
		System.out.println(hm);
	}
}