package javaBasic;

public class AAMethod {

	public int observe(int i) {
		// Instance method created when we want to return any value from method
		int x = i * i;
		return x;
	}

	static void display() {
		System.out.println("static");
		// static method used when we want to make method as static means we don't want
		// to create object for calling
	}

	static int display1(int a) {
		int s = a * 10;
		return s;
	}

	void show() {
		System.out.println("Instance method which is not riturning any thing");
		// when we doesn't want to return any thing from method then make it void
	}

//	abstract void show1(); abstarct method need to make in abstract class 
	
	public static void main(String[] args) {
		AAMethod d = new AAMethod();
		AAMethod.display();
		System.out.println(d.observe(20));
		System.out.println(AAMethod.display1(10));
		d.show();
	}
}
//two type of methods 1) Instance 2) Static.