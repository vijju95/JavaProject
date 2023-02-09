package Class_const_obj_etc;

public class Two_method {

	/*
	 * Create a class to print the area of a square a*a and a rectangle a*b which will
	 * return the value Of Area and print it in Main Method. The class has two
	 * methods with the same name but different number of parameters. The method for
	 * printing area of rectangle has two parameters which are length and breadth
	 * respectively while the other method for printing area of square has one
	 * parameter which is side of square .
	 */
	
	int areaS;
	int areaR;
	
	void area(int side) {
		areaS=side*side;
		System.out.println("Area of squre is : "+ areaS);
	}
	
	void area(int length, int breadth) {
		areaR=length*breadth;
		System.out.println("Area of squre is : "+ areaR);
	}
	
	public static void main(String[] args) {
		Two_method a=new Two_method ();
		a.area(10);
		a.area(10, 20);
	}
}
