package javaBasic;

import java.util.Scanner;

public class Power_baseindex {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter power : ");
		int p = sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter number : ");
		int num = sc1.nextInt();
		
		int power=1;
		
		for(int i=1; i<=p; i++) {
			power=num*power;
		}
		System.out.println(power);
			sc.close();
			sc1.close();
	}

}
