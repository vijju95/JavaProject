package Comparable_Comparator;

import java.util.Collections;
import java.util.LinkedList;

public class StringComparable4 {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList();
		
		ll.add("dgnbf");
		ll.add("fdbf");
		ll.add("sgdf");
		ll.add("sfs");
		ll.add("asfd");
		ll.add("erg");
		ll.add("dgt");
		ll.add("fgh");
		
		Collections.sort(ll);
		System.out.println(ll);
	}
}
