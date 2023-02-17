package TreeSetC;

import java.util.Iterator;
import java.util.TreeSet;

public class Basic {

	void polling() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);
		System.out.println("Lowest Value: " + set.pollFirst());
		System.out.println("Highest Value: " + set.pollLast());
	}

	void descending() {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ajay");
		System.out.println("--------------------");
		Iterator i = set.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

	void sets() {
		TreeSet<String> set = new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println("Initial Set: " + set);

		System.out.println("Reverse Set: " + set.descendingSet());

		System.out.println("Head Set: " + set.headSet("C", true));

		System.out.println("SubSet: " + set.subSet("A", false, "E", true));

		System.out.println("TailSet: " + set.tailSet("C", false));
	}

	public static void main(String args[]) {
		Basic b = new Basic();
		b.polling();
		b.descending();
		b.sets();
	}
}
