package javaBasic;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		int year;
		
		System.out.println("enter year : ");
		Scanner sc = new Scanner(System.in);
		year=sc.nextInt();
		
		if ((year %  4 == 0) && (year % 100 != 0)) {
			System.out.println(year+ "   Leap Year");
		} 
		if((year % 400 == 0) && (year%100==0)) {
			System.out.println(year+ "   Leap Year");
		}
		else
			System.out.println(year+ "   not a Leap year");
		
		sc.close();
	}
}
