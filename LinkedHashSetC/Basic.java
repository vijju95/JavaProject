package LinkedHashSetC;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface. It inherits the HashSet class and implements the Set interface.

The important points about the Java LinkedHashSet class are:

Java LinkedHashSet class contains unique elements only like HashSet.
Java LinkedHashSet class provides all optional set operations and permits null elements.
Java LinkedHashSet class is non-synchronized.
Java LinkedHashSet class maintains insertion order.

The LinkedHashSet class extends the HashSet class, which implements the Set interface. 
The Set interface inherits Collection and Iterable interfaces in hierarchical order
 */
public class Basic {

	public static void main(String[] args) {

		LinkedHashSet hs = new LinkedHashSet();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.remove("two");
		System.out.println(hs);

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
