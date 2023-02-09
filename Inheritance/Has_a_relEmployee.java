package Inheritance;

public class Has_a_relEmployee {

	int id;
	String name;
	Has_a_relDepartment d;				//here employee has a relationship with department //aggregation
	//Simply we r using property/method of parent class by taking variable of class and we will get return method op in op...
	
	Has_a_relEmployee (int id,String name,Has_a_relDepartment d) {
		this.id=id;
		this.name=name;
		this.d=d;
	}
	
		public String toString() {
		return     id+" "+ name + " "+ d ;
	}


	public static void main(String []arg) {
		
		Has_a_relDepartment d=new Has_a_relDepartment("HR","Mumbai");
		Has_a_relEmployee e=new Has_a_relEmployee (1,"pooja",d);
		
		System.out.println(e.toString());	
		System.out.println(d.toString());
	}

}
