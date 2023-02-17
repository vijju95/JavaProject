package Comparable_Comparator;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

//WAP to create a class Employee with (name, designation and age).Now create and add Employee
//objects elements to Arraylist. Print ArrayList

class CRableAssignment implements Comparable<CRableAssignment>{

	String name;
	String designation;
	int age;
	
	CRableAssignment(String name,String designation,int age){
		this.name=name;
		this.designation=designation;
		this.age=age;;
	}
	
	public String toString() {
		return "\n"+"Name of imployee is : "+name+"\n"+"Designation of imployeen is : "+
				designation+"\n"+"Age of imployee is : "+age;
	}

	public int compareTo(CRableAssignment o) {
		if(this.age>o.age)
			return 1;
		else if(this.age<o.age)
			return -1;
		else
			return 0;
	}

	
}
public class CmprblComprtrAssi1 {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		CRableAssignment c=new CRableAssignment("ViJaY","Developer",25);
		l.add(c);
		l.add(new CRableAssignment("PrAnAy","Accounts",22));
		l.add(new CRableAssignment("TaNuJa","Tester",26));
		l.add(new CRableAssignment("HaPpY","Sales",24));
		
		System.out.println("\n"+"Comparing age.....");
		
		Collections.sort(l);
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("\n"+"Comparing Designation.....");
		
		Collections.sort(l, new CmprblComprtrAssi2());
		Iterator i1=l.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}