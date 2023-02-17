package HashMapC;

import java.util.HashMap;

/*
8. WAP to copy all of the mappings from the specified HashMap to another map.
9. WAP to test if a HashMap contains a mapping for the specified key.
10.WAP to test if a HashMap contains a mapping for the specified value.
11.WAP to remove an element from HashMap using key.
 */
public class MappingAssignment {

	void anotheMap() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Mumbai");
		hm.put(2, "Pune");
		hm.put(3, "Chennai");
		hm.put(4, "Hydrabad");

		HashMap<Integer, String> h = new HashMap<Integer, String>(hm);

		System.out.println(h);
	}
	
	void containss() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Mumbai");
		hm.put(2, "Pune");
		hm.put(3, "Chennai");
		hm.put(4, "Hydrabad");
	
		System.out.println(hm.containsKey(2));
	}
	
	void contains() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Mumbai");
		hm.put(2, "Pune");
		hm.put(3, "Chennai");
		hm.put(4, "Hydrabad");
	
		System.out.println(hm.containsValue("Pune"));
	}
	
	void removee() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Mumbai");
		hm.put(2, "Pune");
		hm.put(3, "Chennai");
		hm.put(4, "Hydrabad");
	
		hm.remove(3);
		System.out.println(hm);
	}

	public static void main(String[] args) {
		MappingAssignment m = new MappingAssignment();
		m.removee();
		//m.contains();
		//m.containss();
		//m.anotheMap();
	}
}
