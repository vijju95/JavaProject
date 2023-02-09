package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class chArray_to_Collection {

	public static void main(String[] args) {
		String[] s= {"Red","Orange","White","Black"};
		
//		List al=Arrays.asList(s);// List only
	
		ArrayList<String> al=new ArrayList(Arrays.asList(s));
				
//		Iterator i=al.listIterator();
//		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		for(String s1:al) {
//			System.out.println(s1);
//		}
		
		System.out.println(al);
	}
}
