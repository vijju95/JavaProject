package Class_const_obj_etc;

public class Constructor {

	int id;
	String name;
	String salary;

	// First constructor
	Constructor(int id, String name) {

		System.out.println("Employee id is : " + id);
		System.out.println("Employee name is : " + name);
	}

	// Overloaded Constructor
	Constructor(int id, String name, String salary) {
		System.out.println("Employee id is : " + id);
		System.out.println("Employee name is : " + name);
		System.out.println("Employee salary is : " + salary);
	}

	// Overloaded Constructor
	Constructor(int id, String name, String salary, char project) {
		System.out.println("Employee id is : " + id);
		System.out.println("Employee name is : " + name);
		System.out.println("Employee salary is : " + salary);
		System.out.println("Employee project is : " + project);
	}

	public static void main(String[] args) {

		Constructor vijay = new Constructor(10, "vijay");
		Constructor Prasad = new Constructor(11, "prasad", "20000");
		Constructor Pranay = new Constructor(12, "pranay", "20000");
		Constructor Abhi = new Constructor(12, "abhi", "200000", 'P');
	}
}
