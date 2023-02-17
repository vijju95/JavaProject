package HashMapC;

import java.util.HashMap;
import java.util.TreeMap;

public class HmToTm {

	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("Vijay", 1);
		hm.put("Prasad", 2);
		hm.put("Happy", 3);
		hm.put("Pranay", 4);
		System.out.println("-----------------------------");
		System.out.println(hm);
		
		TreeMap<String, Integer> tm=new TreeMap<String, Integer>(hm);
		System.out.println("-----------------------------");
		System.out.println(tm);
	}
}
