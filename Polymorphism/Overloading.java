package Polymorphism;
/*
public class Overloading {
	
		static void features (int a) {
			System.out.println("First");
		}
		
		static void features (int a, int b) {
			System.out.println("second");
		}
		
	public static void main(String[] args) {
		Overloading O = new Overloading();
		
		O.features(10, 10);
		O.features(10);
	}
}*/
//ANOTHER EXAMPLE

class Sample {
	
	public void disp(String c) {
		System.out.println(c);
	}
	
	public void disp(String c, int n) {
		System.out.println(c+" "+n);
	}
}
public class Overloading {

	public static void main(String[] args)  {

	Sample obj=new Sample();
    	obj.disp("a");
    	obj.disp("a",2);
}
}