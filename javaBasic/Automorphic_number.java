package javaBasic;

import java.util.Scanner;

public class Automorphic_number {

	public static void main(String[] args) {

		int num=376;
		int mod=0;
		int squre=num*num;
		
		while(num>=1) {
			mod=squre%10;
			if(num==mod) {
				System.out.println("Automorphic number");
			}else
				System.out.println("Not Automorphic number");
			squre=squre/10;
			num=num/10;
		}
	}

}