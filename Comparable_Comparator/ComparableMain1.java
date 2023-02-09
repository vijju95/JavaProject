package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Striing and wrapper class both implement comparable interface
class Student implements Comparable<Student> {

	String name;
	int roll_number;
	char division;

	Student(String name, int roll_number, char division) {
		this.name = name;
		this.roll_number = roll_number;
		this.division = division;
	}

	public String toString() {
		return "\n" + "name of the stuednt is : " + name + "\n" + "Rollnumber of student is : " + roll_number + "\n"
				+ "Division of student is : " + division;
	}

	public int compareTo(Student o) {
		if(this.roll_number>o.roll_number)
			return 1;
		else if(this.roll_number<o.roll_number)
			return -1;
		else
			return 0;
	}
}

public class ComparableMain1 {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		Student s1 = new Student("Vijay", 19, 'B');
		al.add(s1);
		al.add(new Student("happy", 18, 'B'));
		al.add(new Student("Pranay", 21, 'B'));
		al.add(new Student("Prasad", 20, 'B'));

		Collections.sort(al);
		
		Iterator<Student> it = al.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
	}
}
