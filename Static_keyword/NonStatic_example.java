package Static_keyword;

public class NonStatic_example {

	static int i = 10;
	
	static void display() {// need to make static method to call static variable
		int j=12;
		int c = i * j;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// System.out.println(i); //we need to make variable static 1st
		NonStatic_example.display();
	}
}
