package javaBasic;

public class Reverce_integer {

	public static void main(String[] args) {

		int n=2853;
		
		while(n>0) {
			int r=n%10;
			n=n/10;
			System.out.print(r);
		}
		n=n/10;
	}
}