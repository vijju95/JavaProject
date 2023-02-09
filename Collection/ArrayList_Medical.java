package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Medical {

	int p_id;
	String name;
	String deseaseNmae;
	String location;
	
	ArrayList_Medical(int p_id,String name,String deseaseNmae,String location){
		this.p_id=p_id;
		this.name=name;
		this.deseaseNmae=deseaseNmae;
		this.location=location;
	}
	
	public String toString() {
		return "ID of patient is : "+p_id+"\n"+"Nmae of patient is : "+name+"\n"+
	"Desease of patient is : "+deseaseNmae+"\n"+"Location of patient is : "+location+"\n";
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList_Medical m=new ArrayList_Medical(125,"Wengopal","nose block","india");
		ArrayList_Medical m1=new ArrayList_Medical(564,"mutthu","body pain","nepal");
		ArrayList_Medical m2=new ArrayList_Medical(651,"swami","headache","india");
		ArrayList_Medical m3=new ArrayList_Medical(758,"iyer","corona","china");
		ArrayList_Medical m4=new ArrayList_Medical(145,"chinnaswami","Thinking","india");
		
		ArrayList al=new ArrayList();
		al.add(m);
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		
		Iterator<ArrayList_Medical> it=al.iterator();
		while(it.hasNext()) {
			ArrayList_Medical m5=it.next();
			if (m5.location.equals("india")) {
				System.out.println("\n" + "List of india patients : ");
				System.out.println(m5);
			}
			//System.out.println(it.next());
		}
	}
	
}
