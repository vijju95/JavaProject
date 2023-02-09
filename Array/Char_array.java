package Array;

import java.util.Scanner;

public class Char_array {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		char[] arr=s.toCharArray();
		  
//		char [] arr = {'d','r','V','r','s','k'};

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = 0;
				}
			}
			if (arr[i] != 0)
				System.out.println(arr[i] + "   " + count);
		}
	}
}
