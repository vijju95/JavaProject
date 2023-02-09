package Class_const_obj_etc;

class Encapsulation {

	int amount;
	int withdraw;
	int remaining_balance;

	Encapsulation(int balance) {
		System.out.println("Available balance is " + balance);
		;
	}

	Encapsulation(int balance, String name, int credit) {
		balance = balance + credit;
		System.out.println(name + "Available balance after credit is " + balance);
		;
	}

	Encapsulation(int amount, int withdraw) {
		remaining_balance = amount - withdraw;

		System.out.println("remaining_balance after withdrawl is " + remaining_balance);
	}
}

public class Encapsulation_Body {

	public static void main(String[] args) {

		Encapsulation e = new Encapsulation(2000);
		Encapsulation e1 = new Encapsulation(2000, 1000);
		Encapsulation e2 = new Encapsulation(2000, "vijay", 200);
	}
}