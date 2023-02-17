package HashSetC;

import java.util.ArrayList;
import java.util.HashSet;

public class Coverted {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer> ();
		al.add(10);
		al.add(20);
		al.add(30);

		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);//preserve insertion order and allow duplicate
		
		HashSet<Integer> hs=new HashSet<Integer>(al);//cannot gurantee insertion order and not allow duplicate
		System.out.println(hs);
	}
}
