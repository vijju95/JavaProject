package Inheritance;

public class Has_a_relDepartment {

	String d_name;
	String location;
	
	public Has_a_relDepartment(String d_name, String location) {
		
		this.d_name = d_name;
		this.location = location;
	}

	public String toString() {
		return  d_name + " " + location ;
	}
}

/*
Example

public class Vehicle {

}
public class Speed {

}

public class Van extends Vehicle {
   private Speed sp;
}
This shows that class Van HAS-A Speed. By having a separate class for Speed, 
we do not have to put the entire code that belongs to speed inside the Van class, 
which makes it possible to reuse the Speed class in multiple applications.
*/
