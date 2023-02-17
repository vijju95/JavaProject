package HashSetC;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

class Managersub implements Comparable<Managersub>{

	int id;
	String name;
	int salary;
	String location;
	
	Managersub(int id, String name, int salary, String location){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.location=location;
	}
	
	public String toString() {
		return "** Id of employee is : "+id+" "+"Name of employee is : "+name+
				"\n"+"     Salary of employee is : "+salary+
				" Locatoin if imployee is : "+location;
	}

	@Override
	public int compareTo(Managersub o) {
		if(this.salary>o.salary)
			return 1;
		else if(this.salary<o.salary)
			return -1;
		else
			return 0;
	}
}

public class Manager {

	public static void main(String[] args) {
		
		HashSet<Managersub> hs=new HashSet();
		
		Managersub m=new Managersub(1,"Vijay",20000,"Pune");
		Managersub m1=new Managersub(3,"Prasad",25000,"mumbai");
		Managersub m2=new Managersub(4,"Pranay", 18000,"chennai");
		Managersub m3=new Managersub(2,"happy",22000,"gujrat");
		
		hs.add(m);
		hs.add(m1);
		hs.add(m2);
		hs.add(m3);
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
