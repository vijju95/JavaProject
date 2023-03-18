package CRUD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListMain {

	public static void main(String[] args) {
		ArrayList<ArrayListSub> al = new ArrayList<ArrayListSub>();
		Scanner sc = new Scanner(System.in);

		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			System.out.print("Enter Student Roll Number : ");
			int roll_num = sc.nextInt();
			System.out.print("Enter Student name : ");
			String name = sc.nextLine();
			System.out.print("Enter Division of student : ");
			String division = sc.nextLine();
			al.add(new ArrayListSub(roll_num, name, division));
			break;

		case 2:
			Iterator<ArrayListSub> i = al.iterator();
			while (i.hasNext()) {
				ArrayListSub e = i.next();
				System.out.println(e);
			}
			break;
		}
	}
}