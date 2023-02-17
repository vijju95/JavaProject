package HashMapC;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {
/*4. WAP to get all the entries from a HashMap. Iterate the entries and print 
the Key & Value.
5. Different ways to iterate over Map?
6. WAP to get only the Keys from a HashMap.
7. WAP to get only the Values from a HashMap
*/
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Vijay");
		hm.put(2, "Tanuja");
		hm.put(3, "Shankar");
		hm.put(4, "Pankaj");
		hm.put(5, "Bhushan");
		hm.put(6, "Sagar");

		System.out.println("--------01-------");
/*01*/  System.out.println(hm);

		System.out.println("-------02--------");
/*02*/  boolean b = hm.containsKey(4);
		if (b == true) {
			System.out.println(hm.get(4));
		}

		System.out.println("--------03-------");
/*03*/  Collection<String> cl = hm.values();
		Iterator it = cl.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("------04---------");
/*04*/  Collection<Integer> cc = hm.keySet();
		Iterator ii = cc.iterator();
		while (ii.hasNext()) {
			System.out.println(ii.next());
		}

		System.out.println("--------05-------");
/*05*/  Set<Entry<Integer, String>> c = hm.entrySet();
		Iterator i = c.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
