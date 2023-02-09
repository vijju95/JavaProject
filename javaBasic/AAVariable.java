package javaBasic;

public class AAVariable {

	static int a=10;
	int b=5;
	
	void display() {
		int c=2;
		
		int x=a+b+c;
		System.out.println(x);
	}
	
	//int y=a+b+c;//we can not access c outside the class
	//System.out.println(y);
	
	void show() {
		int z=a+b;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		AAVariable a=new AAVariable();
		
		a.display();
		a.show();

		//System.out.println(a+b);//in main method we can not call instance variable
	}
}
