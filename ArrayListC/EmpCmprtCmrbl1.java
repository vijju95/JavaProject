package ArrayListC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*class Employee(id,name,salary)
Create and add 4 more Employee objects in ArrayList. Print ArrayList. Sort ArrayList using
Collections.sort(list) based on name. If name are same then sort on id. Print arrayList.*/

class employee implements Comparable<employee>{
	int id;
	String name;
	long salary;

	employee(int id, String name, long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "Id of employee is : " + id + "\n" + "Name of employee is : " + name + "\n" + "Salary of employee is : "
				+ salary;
	}

	public int compareTo(employee o) {
		if(this.id>(o.id))
			return 1;
		else if(this.id<o.id)
			return -1;
		else
			return 0;
	}
	
}
public class EmpCmprtCmrbl1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		employee e=new employee(15,"ViJaY",20000);
		al.add(e);
		al.add(new employee(16,"PrAsAd",24000));
		al.add(new employee(17,"PrAnAy",26000));
		al.add(new employee(18,"PrAsAd",22000));
		System.out.println("----------------------");
		System.out.println("Sorting on basis of Id"+"\n");
		Collections.sort(al);
		Iterator<employee> it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------------");
		System.out.println("\n"+"Sorting on basis of Name"+"\n");
		Collections.sort(al, new EmpCmprtCmrbl2());
		Iterator<employee> i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
}
