package TreeMapC;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
Create Customer class with custid, custName, mobile fields. 
Create Order class with ordered id,o_date, location
Create TreeMap with customer as key and Order as value .it should be sorted
according to custId in ascending order.
 */
class customer implements Comparable<customer>{
	
	int custId;
	String name;
	Long number;
	
	customer(int custId, String name, Long number){
		this.custId=custId;
		this.name=name;
		this.number=number;
	}
	
	public String toString() {
		return "\n"+"*** Customer id is : "+custId+"  Customer name is : "+name+"\n"+"  Customer contact number is : "+number;
	}


	@Override
	public int compareTo(customer o) {
		if(this.custId>o.custId)
			return 1;
		else if(this.custId<o.custId)
			return -1;
		else
			return 0;
	}
}
class order{
	int orderId;
	int orderDate;
	String location;
	
	order(int orderId, int orderDate,String location){
		this.orderId=orderId;
		this.orderDate=orderDate;
		this.location=location;
	}
	
	public String toString() {
		return "\n"+" Order id is : "+orderId+" Order date is : "+orderDate+" Location is : "+location;
	}
}
public class CustomerAscending {

	public static void main(String[] args) {
		TreeMap<customer, order> tr=new TreeMap<customer, order>();
		
		customer c=new customer(103, "Vijay", 7391993381L);
		customer c1=new customer(102, "Happy", 9375825645L);
		customer c2=new customer(101, "Pranay", 7085659686L);
		customer c3=new customer(104, "Prasad", 9595872563L);
	
		order o=new order(129, 12, "pune");
		order o1=new order(130, 8, "mumbai");
		order o2=new order(118, 24, "chennai");
		order o3=new order(140, 18, "gujrat");
	
		tr.put(c, o);
		tr.put(c1, o1);
		tr.put(c2, o2);
		tr.put(c3, o3);
	
		Set<Entry<customer, order>> s=tr.entrySet();
		Iterator<Entry<customer, order>>  it=s.iterator();
		while(it.hasNext()) {
			Entry<customer, order> en = it.next();
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
	
	}
}
