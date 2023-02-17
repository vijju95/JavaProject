package ArrayListC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Assignment {
	
	//WAP add elements to arraylist without using generics
	void noGenerics() {
		ArrayList intt = new ArrayList();
		intt.add(10);
		intt.add("ABC");
		intt.add(30);
		intt.add("XYZ");

		ArrayList str = new ArrayList();
		str.add("one");
		str.add(2);
		str.add("three");

		intt.add(str);
		System.out.println(intt);
	}
	//WAP to use add operation of ArrayList
	void Generics() {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("one");
		al1.add("two");
		al1.add("three");

		al.add(al1);
		System.out.println(al);
	}
	
	//WAP to print all elements of ArrayList using iterator
	void iterator() {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("ABC");
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	//WAP to iterate through all elements in an ArrayList using for loop
	void Forloop() {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(100);
		al.add(200);
		al.add(300);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
	//WAP to iterate through all elements in an ArrayList using for each
	void forEachloopShuffling() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(100);
		al.add(200);
		al.add(300);
		Collections.shuffle(al);
		for(int b:al) {
			System.out.println(b);
		}
	}
	
	//create a new ArrayList, add some colors (string) and print the collection.
	void colors() {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Red");
		al.add("orange");
		al.add("Black");
		Iterator<String> a=al.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
	}
	
	//WAP to remove element from ArrayList
	void remove() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(100);
		al.add(200);
		al.add(300);
		
		al.remove(2);
		System.out.println(al);
	}
	
	//WAP to remove all elements from ArrayList
	void removeAll() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(100);
		al.add(200);
		al.add(300);
		
		al.removeAll(al);
		System.out.println(al);
	}
	//Contains method
	void contains() {
		ArrayList<Integer> element=new ArrayList<Integer>();
		element.add(1);
		element.add(1);
		element.add(1);
		element.add(1);
		System.out.println(element.contains(1));
	}
	//WAP to retain all elements from ArrayList
	void retain() {
		ArrayList<Integer> price=new ArrayList<Integer>();
		price.add(10);
		price.add(100);
		ArrayList<Integer> price1=new ArrayList<Integer>();
		price1.add(10);
		price1.add(100);
		price1.add(200);
		price1.add(300);
		//gives common of two arraylist
		price.retainAll(price1);
		System.out.println(price);
	}
	
	//WAP to know how many elements in ArrayList
	void elements() {
		ArrayList<Integer> count=new ArrayList<Integer>();
		count.add(1);
		count.add(1);
		count.add(1);
		count.add(1);
		System.out.println(count.size());
	}
	
	//WAP to test an ArrayList is empty or not
	void emptyNot() {
		ArrayList<Integer> empty=new ArrayList<Integer>();
		empty.add(1);
		empty.add(2);
		System.out.println(empty.isEmpty());
	}
	
	//WAP to empty ArrayList
	//WAP to check if collection is empty
	void empty() {
		ArrayList empty=new ArrayList();
		
		System.out.println(empty);
	}
	
	//WAP to search an element from ArrayList
	void search() {
		ArrayList<Integer> elem=new ArrayList<Integer>();
		elem.add(10);
		elem.add(100);
		elem.add(200);
		elem.add(300);
		
		System.out.println(elem.indexOf(300));
	}
	
	//WAP to insert an element into the ArrayList at the first position
	void positionFirst() {
		ArrayList<Integer> elem=new ArrayList<Integer>();
		elem.add(10);
		elem.add(100);
		elem.add(200);
		elem.add(300);
		elem.add(0, 10001);
		System.out.println(elem);
	}
	
	//WAP to match two collections
	void coll() {
		ArrayList<Integer> col1=new ArrayList<Integer>();
		col1.add(10);
		col1.add(100);
		
		ArrayList<Integer> col2=new ArrayList<Integer>();
		col2.add(10);
		col2.add(100);
		
		System.out.println(col1.equals(col2));
	}
	
	public static void main(String[] args) {
		ArrayList_Assignment a = new ArrayList_Assignment();
		a.coll();
		a.positionFirst();
		a.search();
		a.emptyNot();
		a.empty();
		a.elements();
		a.retain();
		a.remove();
		a.Generics();
		a.iterator();
		a.Forloop();
		a.forEachloopShuffling();
		a.colors();
		a.removeAll();
		a.contains();
	}
}
