package javaBasic;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int CountOfVehicels;
		System.out.println("Count of vehicle is : ");
		CountOfVehicels=sc.nextInt();
		
		int offer;
		System.out.println("offer number : ");
		offer=sc.nextInt();
		
		int price;
		System.out.println("expected price of vehicle is : ");
		price=sc.nextInt();
		
		if (CountOfVehicels>=10) {
			System.out.println("vehicles available");
			
				if(offer==100) {
					System.out.println("Vehicle price 80000");
				}
				else
					System.out.println("Discount not applied");
		}
		else if(price<=100000) {
			System.out.println("Available in Expected price");
		} 
		sc.close();
	}
}
