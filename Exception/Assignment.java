package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment extends Exception{

	// question number one
	void observeException() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[7]);
		}
	}

	// WAP to use catch / handle the ArrayIndexOutOfBoundsException exception
	void handleAIOB() {
		try {
			int arr[] = { 1, 2, 3, 5, 4, 6, 8, 7, 5, 6 };
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[12]);
			}
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Exception is handled");
		}
	}

	// WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException and
	// ArithmeticException
	void multipleException() {
		int arr[] = { 1, 2, 3, 4, 5 };
		int a = 10, b = 2;
		try {
			int c = a / b;
			System.out.println(c);
			System.out.println(arr[8]);
		} catch (ArithmeticException are) {
			System.out.println("arithmetic handled");
			are.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("AIOOB handled");
			ae.printStackTrace();
		}
	}

	// WAP to show checked exception and use multiple catch block with universal
	// Exception handler
	void universalException() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string here : ");
		String s = br.readLine();
		char[] ch = s.toCharArray();
		try {
			for (int i = 0; i < ch.length; i++) {
				System.out.println(ch[100]);
			}
		} catch (StringIndexOutOfBoundsException ae) {
			System.out.println("SIOOB Exception is handled");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("AIOOB Exception is handled");
		} catch (Exception e) {
			System.out.println("Universal exception handler");
		}
	}

	// WAP to show throw and throws keyword//throws in universal exception
	// program...
	void throwAssignment() {
		try {
			throw new NullPointerException("Explicitly thrown null pointer exception");
		} catch (NullPointerException ae) {
			System.out.println("referring to null object : NullPointerException");
		}
	}


	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Assignment a = new Assignment();
		//a.userdefineException();
		// a.classNF();
		// a.throwAssignment();
		// a.universalException();
		// a.observeException();
		// a.handleAIOB();
		// a.multipleException();
	}

}
