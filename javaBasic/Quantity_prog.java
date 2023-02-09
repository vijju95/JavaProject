package javaBasic;

import java.util.Scanner;

public class Quantity_prog {

	public static void main (String [] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter QTY of milk in lit : ");
		int lit=sc.nextInt();
		
		int pri=40;
		int prin=0;
		
		while(prin<=500) {
			prin=lit*pri;
		}
			if(prin>=500) {
				System.out.println(lit);
			}
			sc.close();
	}
}
