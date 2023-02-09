package Collection_Assignment;

import java.util.ArrayList;
import java.util.Iterator;

//WAP to create Emp (id,name,sal) object and add objects to ArrayList.
//print Emp whose salary is gretaer than 10000, print Emp who have name Sachin,
//print Emp who have highest number of salary
public class Assignment6thfeb {

	int id;
	String name;
	int salary;

	Assignment6thfeb(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "\n" + "Id of imployee is : " + id + "\n" + "Name of imployee is : " + name + "\n"
				+ "Salary of imployee is : " + salary;
	}

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		Assignment6thfeb a = new Assignment6thfeb(19, "pranay", 8000);
		al.add(new Assignment6thfeb(20, "happy", 20000));
		al.add(new Assignment6thfeb(21, "Prasad", 5000));
		al.add(new Assignment6thfeb(22, "sachin", 15000));

		Iterator<Assignment6thfeb> it = al.iterator();
		while (it.hasNext()) {
			Assignment6thfeb as = it.next();
			if (as.name.equals("sachin")) {
				System.out.println("\n" + "Employee whose name is SACHIN : ");
				System.out.println(as);
			}
			if (as.salary > 10000) {
				System.out.println("\n" + "Employee whose salary is more than 10K : ");
				System.out.println(as);
			}
		}
	}
}
