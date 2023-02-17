package HashSetC;

import java.util.HashSet;
import java.util.Iterator;

/*
 * A list can contain duplicate elements whereas Set contains unique elements only.
 */
public class Basic {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("fourth");
		hs.add("fifth");
		hs.add("sixth");
		
		hs.remove("first");
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		HashSet h=new HashSet();
		h.add("000");
		h.add("111");
		
		hs.addAll(h);
		System.out.println("----------------");
		System.out.println(hs);
	}
}
