package javaBasic;

public class Addition {

	public static void main (String [] args) {				
		int a=24, b=12;
		int c=a/b;
		System.out.println(c);

		
		float f=2.4f;										//f is compulsory
		double g=10.24;										//for double f is not compulsory
		
		char ch='a';
		
		boolean e= true;
		
		char y=';';
		int num =y;
		System.out.println(num);							//Implicit type casting (converting lower to higher)
		
		int n=1000;
		float t=n;
		System.out.println(t);								//Explicit type casting (converting higher to lower)
		
		System.out.println(c);System.out.println(f);System.out.println(ch);System.out.println(e);System.out.println(g);
		
		int lenth=10, breadth=20;
		System.out.println("perimeter of rectangle is : " +2*(lenth+breadth));		//perimeter of rectangle :- 2*(Lenth+breadth)
		
		System.out.println("area of rectangle is : " +(lenth*breadth));				//area of rectangle :- (Lenth*breadth)
	}
}
