package Vector;

import java.util.Vector;

public class Basic {
	/*
	 * Vector is like the dynamic array which can grow or shrink its size. Unlike
	 * array, we can store n-number of elements in it as there is no size limit. It
	 * is a part of Java Collection framework since Java 1.2. It is found in the
	 * java.util package and implements the List interface, so we can use all the
	 * methods of List interface here.
	 * 
	 * It is recommended to use the Vector class in the thread-safe implementation
	 * only. If you don't need to use the thread-safe implementation, you should use
	 * the ArrayList, the ArrayList will perform better in such case.
	 * 
	 * Vector is synchronized.
	 * Java Vector contains many legacy methods that are not the part of a collections framework.
	 */
	
	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("Pune");
		v.add("Mumbai");
		v.add("Goa");
		
		v.addElement("Chennai");
		System.out.println("Vector elements are : "+v);
		
		System.out.println("Default size is : "+v.size()+"\n"+"def Capacity is : "+v.capacity());
		
		if(v.contains("Goa")) {
			System.out.println(v.contains("Goa"));
			System.out.println(v.indexOf("Goa"));
		}
		
		System.out.println("Hash code of this vector = "+v.hashCode()); 
		
		v.remove(1);
		System.out.println(v);
	}
}
