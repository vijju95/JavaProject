package LinkedHashMapC;

import java.util.LinkedHashMap;

public class Basic {

	void basic() {
		LinkedHashMap<Character,String> hs=new LinkedHashMap<Character,String>();
		hs.put('A', "Angry");
		hs.put('C', "Beautiful");
		hs.put('B', "calm");
		
		System.out.println(hs);
	}
	
	
	public static void main(String[] args) {
		Basic b=new Basic();
		b.basic();
		
	}
}
