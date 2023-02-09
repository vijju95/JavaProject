package javaBasic;

public class SimpleLoops {

	public static void main (String[]args) {
		
		//num is divisible or not
		int num=25;										
		
		if(num/5==0) {
			System.out.println("Divisible by 5");
		}
		else
			System.out.println("not divisible");
		
		
		//Greater no out off 3
		int a=10, b=15, c=20;
		if((a>=b) && (a>=c)) {							
			System.out.println("A is greater");			//compare a with other 2
		} else if ((b>=a) && (b>=c)) {
			System.out.println("b is greater");			//compare b with other 2
		}
		else
			System.out.println("c is greater");			//a and b nsel tr c
	}
}