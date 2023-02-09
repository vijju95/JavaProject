package Encapsulation;

import java.util.Scanner;

public class Movie2 {

	public static void main(String[] args) {
		
		Movie m = new Movie();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter movie name :  ");
		String name=sc.nextLine();
		
		System.out.println("Enter movie categorie :  ");
		String categorie=sc.nextLine();
		
		System.out.println("Enter movie price :  ");
		int price=sc.nextInt();
		
		m.getMname(name);
		m.getMcat(categorie);
		m.getMc(price);
		
		System.out.println(m.setMc());
		System.out.println(m.setMcat());
		System.out.println(m.setMname());
	}
}
