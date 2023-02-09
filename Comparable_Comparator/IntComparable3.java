package Comparable_Comparator;

import java.util.Collections;
import java.util.LinkedList;

public class IntComparable3 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList();
		
		ll.add(10);
		ll.add(8);
		ll.add(17);
		ll.add(7);
		ll.add(16);
		ll.add(2);
		ll.add(32);
		ll.add(26);
		
		Collections.sort(ll);
		System.out.println(ll);
	}
}
