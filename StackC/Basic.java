package StackC;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Basic {
	/*
	 * The stack is a linear data structure that is used to store the collection of
	 * objects. It is based on Last-In-First-Out (LIFO). Java collection framework
	 * provides many interfaces and classes to store the collection of objects. One
	 * of them is the Stack class that provides different operations such as push,
	 * pop, search, etc.
	 * 
	 * The stack data structure has the two most important operations that are push
	 * and pop. The push operation inserts an element into the stack and pop
	 * operation removes an element from the top of the stack.
	 * 
	 * push(E item)	E	The method pushes (insert) an element onto the top of the stack.
	   pop()	E	The method removes an element from the top of the stack and returns the same element
	   peek()	E	The method looks at the top element of the stack without removing it.
	   search(Object o)	int	The method searches the specified object and returns the position of the object.
	 * 
	 */
	
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		
		s.push(10);
		s.push(20);//An item to be pushed onto the top of the stack.
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println(s); 
		System.out.println(s.isEmpty());
		System.out.println(s.search(30));//boottom element is entered 1st in stack FILO/LIFO
		System.out.println("----------------------------");
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------------------");
		ListIterator<Integer> i=s.listIterator(s.size());
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}
}
