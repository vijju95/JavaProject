package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Assignment {

	// shuffle collection
	void shuffle() {
		LinkedList l = new LinkedList();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		Collections.shuffle(l);
		System.out.println(l);
	}

	// WAP to join two linked lists.
	void join() {
		LinkedList l = new LinkedList();
		LinkedList ll = new LinkedList();
		
		l.add(10);
		l.add(20);
		ll.add(30);
		ll.add(40);

		ll.add(l);
		System.out.println(ll);
	}

	// WAP to clone a linked list to another linked list.
	void clonee() {
		LinkedList l = new LinkedList();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		LinkedList ll = new LinkedList();
		ll = (LinkedList) l.clone();
		System.out.println(ll);
	}

	// WAP to remove and return the first element of a linked list.
	// WAP to retrieve but does not remove, the first element of a linked list.
	void returnn() {
		LinkedList l = new LinkedList();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		// l.removeFirst();
		System.out.println(l.removeFirst());
	}

	// WAP to retrieve but does not remove, the last element of a linked list.
	void lastele() {
		LinkedList l = new LinkedList();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		// l.removeLastOccurrence(l);
		System.out.println(l.removeLast());
	}

	// WAP to check if a particular element exists in a linked list
	void checking() {
		LinkedList l = new LinkedList();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		// l.contains(20);
		System.out.println(l.contains(50));
	}

	// WAP to convert a linked list to array list.
	void convert() {
		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);

		ArrayList al = new ArrayList(ll);
		System.out.println(al);
	}

	// WAP to compare two linked lists.
	void compare() {
		LinkedList l = new LinkedList();
		LinkedList ll = new LinkedList();
		
		l.add(10);
		l.add(20);
		ll.add(10);
		ll.add(10);
		System.out.println(l.containsAll(ll));
	}

	// WAP to test a linked list is empty or not.
	void emptynot() {
		LinkedList ll = new LinkedList();
		
		ll.add(10);
		System.out.println(ll.isEmpty());
	}

	// WAP to replace an element in a linked list.
	void replacee() {
		LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add(20);

		ll.set(0, 30);

		System.out.println(ll);
	}

	// WAP to get the first and last occurrence of the specified elements in a
	// linked list.
	void occurance() {
		LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add(30);
		ll.add(20);
		System.out.println("First number is : " + ll.getFirst());
		System.out.println("Last number is : " + ll.getLast());
	}

	public static void main(String[] args) {

		LinkedList_Assignment l = new LinkedList_Assignment();
		
		l.shuffle();
		// l.occurance();
		// l.replacee();
		// l.emptynot();
		// l.compare();
		// l.join();
		// l.clonee();
		// l.returnn();
		// l.lastele();
		// l.checking();
		// l.convert();
	}
}
