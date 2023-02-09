package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Comparatorr implements Comparable<Comparatorr>{

	String user_Name;
	String bank_Name;
	int acc_Balance; 
	
	Comparatorr(String user_Name,String bank_Name,int acc_Balance){
		this.user_Name=user_Name;
		this.bank_Name=bank_Name;
		this.acc_Balance=acc_Balance;
	}
	
	public String toString() {
		return "\n"+"Name of user is : "+user_Name+"\n"+"User bank name is : "+bank_Name+"\n"+
	"Account balance of user is : "+acc_Balance+"\n";
	}

	@Override
	public int compareTo(Comparatorr o) {
		if(this.acc_Balance>o.acc_Balance) 
			return 1;
			else if(this.acc_Balance<o.acc_Balance)
				return -1;
			else
				return 0;
	}
}
public class ComparatorSub2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Comparatorr c=new Comparatorr("ViJaY","StandardChatered",20000);
		al.add(c);
		al.add(new Comparatorr("PrAsAd","HDFC",15000));
		al.add(new Comparatorr("PrAnAy","SBI",30000));
		
		Collections.sort(al);
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collections.sort(al, new ComparatorMain2());
		Iterator it1=al.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
	
}
