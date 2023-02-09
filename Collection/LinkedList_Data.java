package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Data {
	
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		
		ll.add(10);
		ll.add(20);
		ll.add(null);
		ll.add(100);
		
		//ll.remove(1);
		//ll.addFirst(4044);
		//ll.set(2, "vIjAy");
		
		List S= Collections.synchronizedList(ll);//converting LinkedList to Synchronized list
		System.out.println("Synchronized list : "+S);
		
		Iterator it=ll.descendingIterator();//descending order
		Iterator it1=ll.iterator();//ascending order
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		//converting LinkedList to ArrayList
		ArrayList al=new ArrayList(ll);
		System.out.println(al);
		
	}
}
//LinkedList class uses doubly linked list to store the elements
//it contains an extra pointer known as previous pointer together with next pointer thats why known as doubly link list.
//it implements List and Deque Interfaces
//Contain duplicate element
//Null insertion possible
//Maintain insertion order
//[Previous link=null][own data=10][Next link=500]  [Pre link=100][own=20][Next link=700]  [Prev link=500][own=30][Next link= null]
//						100											500										700
// 1st node is known as Head node