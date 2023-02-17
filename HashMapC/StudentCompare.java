package HashMapC;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

class Students implements Comparable<Students> {

	int rollNumber;
	String name;
	char division;

	Students(int rollNumber, String name, char division) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.division = division;
	}

	public String toString() {
		System.out.println("------------------------");
		return "Roll number is : " + rollNumber + "\n" + "Name of student is : " + name + "\n"
				+ "Division of student is : " + division;
	}

	public int compareTo(Students o) {
		if (this.rollNumber > o.rollNumber)
			return 1;
		else if (this.rollNumber < o.rollNumber)
			return -1;
		else
			return 0;
	}
}

public class StudentCompare {

	public static void main(String[] args) {

		HashMap<Integer, Students> hm = new HashMap<Integer, Students>();

		Students s = new Students(21, "Vijay", 'B');
		hm.put(1, s);
		hm.put(2, new Students(22, "Prasad", 'A'));
		hm.put(3, new Students(19, "Pranay", 'B'));
		hm.put(4, new Students(20, "Dell", 'C'));

		Set<Entry<Integer, Students>> c = hm.entrySet();
		Iterator it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}??

		Collections.sort((List<Students>) hm);
		Iterator<Students> i = (Iterator<Students>) hm.entrySet();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
