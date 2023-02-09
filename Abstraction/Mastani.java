package Abstraction;

//4 Create interface IceCream with method eat and Juice with method drink. 
//Create class Mastani which implements both interfaces.

interface icecream{
	default void eat() {
		System.out.println("Eating ice cream");
	}
}

interface juice{
	default void drink() {
		System.out.println("drinking the juice");
	}
}

public class Mastani implements icecream, juice{

	public static void main(String[] args) {
	
	Mastani m = new Mastani();
	m.drink();
	m.eat();
	
	}
}