package Class_const_obj_etc;

public class Static_variableuse {
//	create class Employee
//	show methods where u can use static variables and methods.

	int id;
	String name;
	static String company_name=" R-Interprices";

	Static_variableuse(int n, String na){
		id=n;
		name=na;
	}
	
	void data(int id,String name) {
		System.out.println(id+" "+name+" "+company_name);
	}
	void data() {
		System.out.println(company_name);
	}
	public static void main(String[] args) {
		Static_variableuse s=new Static_variableuse(19, "vijay");
		s.data();
	}
}
