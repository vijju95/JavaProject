package javaBasic;

import java.util.Scanner;

public class Sum_oddnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num : ");
		int n = sc.nextInt();
		
		int sum=0;
		int j;
		
			while(n>0) {

					j=n%10;
					n=n/10;
					
					if(j%2!=0) {
					sum=j+sum;
					}			
			}
		System.out.println(sum);
	}
}