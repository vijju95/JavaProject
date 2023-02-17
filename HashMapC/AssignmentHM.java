package HashMapC;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class AssignmentHM {

	// Add int string & string int in HM
	void BasicHM() {
		HashMap hm = new HashMap();
		hm.put(1, "Vijay");
		hm.put(2, "Prasad");
		HashMap hm1 = new HashMap();
		hm1.put("Pranay", 15);
		hm1.put("Prasad", 68);

		System.out.println(hm);
		System.out.println(hm1);
	}

	// Add int string & string int in HM
	void combination() {
		HashMap hm = new HashMap();
		hm.put(1, "Vijay");
		hm.put("Prasad", 68);

		System.out.println(hm);
	}

	// WAP to add elements to a HashMap using generics with Integer as Key and
	// String as value. And
	void genericsHM() {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Pune");
		hm.put(68, "Mumbai");
		hm.put(2, "Chennai");
		hm.put(4, "Goa");

		System.out.println(hm);
	}

	// WAP to get all the entries from a HashMap. Iterate the entries
	void Iterating() {
			HashMap<Integer, String> hm=new HashMap<Integer, String>();
			hm.put(1, "ABC");
			hm.put(3, "XYZ");
			hm.put(2, "IJK");
			hm.put(4, "PQR");
		
		Collection<Entry<Integer, String>> c=hm.entrySet();
		Iterator it=c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
	//WAP to get only the keys from a HashMap
	void keys() {
		HashMap hm = new HashMap();
		
		hm.put(1, "Vijay");
		hm.put("Prasad", 68);
		hm.put('A', "Pranay");
		
		Collection<String> cl=hm.keySet();
		Iterator it=cl.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	//WAP to get only the Values from a HashMap
		void values() {
			HashMap hm = new HashMap();
			
			hm.put(1, "Vijay");
			hm.put("Prasad", 68);
			hm.put('A', "Pranay");
			
			Collection<String> cl=hm.values();
			Iterator it=cl.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		//remove common elements from two arrays
		void arrays() {
			int[] a= {1,5,6,3,4,85,2,3};
			int[] b= {3,7,32,56,5,2,9,85};
			System.out.println("Common element from both array are");
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<b.length;j++) {
					if(a[i]==b[j]) {
						System.out.println(a[i]);
					}
				}
			}
		}
		
		//remove duplicates character from given string
		void dupChar() {
			String s="nageshwarae";
			char[] ch=s.toCharArray();
			for(int i=0;i<ch.length-1;i++) {
				
					if(ch[i]==ch[i+1]) {
						System.out.println(ch[i]);
					}
				
			}
		}
		
		//Reverse a  given string.
		void reverce() {
			String s="nageshwarae";
			char[] ch=s.toCharArray();
			for(int i=ch.length-1;i>=0;i--) {
				System.out.println(ch[i]);
			}
		}
		
	public static void main(String[] args) {
		AssignmentHM as = new AssignmentHM();
		//as.BasicHM();
		//as.combination();
		//as.genericsHM();
		//as.Iterating();
		//as.keys();
		//as.values();
		//as.arrays();
		as.dupChar();
		//as.reverce();
	}
}
