package javaBasic;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {

//		//print table of given number
//		int n=5;
//		for(int i=1;i<=10;i++) {
//			if(i<=10) {
//				int m=n*i;
//				System.out.println(m);
//			}
//		}
//		
//		//square from 1 to 20
//		int n1=20;
//		for (int i=1; i<=n1; i++) {
//			if(i<=20) {
//				int s=i*i;
//				System.out.println(s);
//			}
//		}
		
		//Frequency of number in given digit
		int n=5262845;
		
		int mod=n%10;
		
		while(mod>0) {
			int newmod=mod%10;
			
			if(newmod == mod) {
				System.out.println(mod);
				
			}
		}		
	}
}