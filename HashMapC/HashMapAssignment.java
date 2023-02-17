package HashMapC;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

class HMExample{

	int id;
	public String grade;
	
	HMExample(int id, String grade){
		this.id=id;
		this.grade=grade;
	}
	
	public String toString() {
		System.out.println("-------*/*/**--------");
		return "\n"+"Grade of Student is : "+grade+
				"\n"+"ID of the student"+id;
	}
}

public class HashMapAssignment {

	public static void main(String[] args) {
	
	HMExample h=new HMExample(19,"A+");
	HMExample h1=new HMExample(20,"B");
	HMExample h2=new HMExample(21,"A");
	HMExample h3=new HMExample(22,"A+");
	
	HashMap<Integer, HMExample> hm=new HashMap<Integer, HMExample>();
	
	hm.put(1, h);
	hm.put(2, h1);
	hm.put(3, h2);
	hm.put(4, h3);
	
	
	
	Set<Entry<Integer, HMExample>> c=hm.entrySet();
	Iterator it=c.iterator();
	while(it.hasNext()) {
		//if(grade.equals("A+")) {
		it.next();
		//}
	}
	}
}
