package TreeMapC;

import java.util.HashMap;
import java.util.TreeMap;

public class Basic {

	void insertInto() {
		HashMap<String,Integer> ts=new HashMap();
			ts.put("red ballons",12);
			ts.put("black balloons",34);
			ts.put("yellow ballons", 2);
			
			System.out.println(ts);
			
			TreeMap<String,Integer> ts1=new TreeMap(ts);//Converting hashmap into tree map
			System.out.println(ts1);
		}
	
	
	
	
	
	
	public static void main(String[] args) {
		Basic b=new Basic();
		b.insertInto();
		
	}
}
