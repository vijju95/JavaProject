package TreeMapC;

import java.util.Comparator;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public class SortingHM {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(5, "Red");
		hm.put(2, "Yellow");
		hm.put(1, "Sky Blue");
		hm.put(4, "Orange");
		
		//Ascending order
		TreeMap<Integer, String> tr=new TreeMap<Integer, String>(hm);
		System.out.println(tr);
		
		NavigableMap<Integer, String> aa=tr.descendingMap();
		System.out.println(aa);
		//Descending order
//		TreeMap<Integer, String> trr=new TreeMap<Integer, String>(hm);
//		trr.putAll(hm);
//		System.out.println(trr);
		
	}
}
