package HashSetC;

import java.util.HashSet;
import java.util.TreeSet;

public class ConverAscendingDiscending {

	public static void main(String[] args) {
		HashSet<Integer> hm=new HashSet<Integer>();
		
		hm.add(10);
		hm.add(20);
		hm.add(30);
		hm.add(40);
		
		TreeSet<Integer> tr=new TreeSet<Integer>(hm);
		System.out.println(tr);
		
		TreeSet<Integer> tre=new TreeSet<Integer>(new SortingInteger());
		tre.addAll(hm);
		System.out.println(tre);
	}
}
