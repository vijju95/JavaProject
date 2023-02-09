package Polymorphism;

/*class Animal{
	int legs=4;
	int eyes=2;
	String extra="teeths";
		void eat() {
			System.out.println("Milk");
			System.out.println("Base class");
		}
	}
class Dog extends Animal{
		void eat() {
			System.out.println("Pedigree"+"  "+extra);
			System.out.println("Derived class");
		}
	}
	
public class Overriding {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
	}//here we can only get value of derived class in output we need to use super keyword to access parent class object.
}*/
class TestDemo {

	public void eat() {
		System.out.println("Human is Eating 1");
	}
}
class Overriding extends TestDemo {
	
	public void eat() {
		super.eat();//MOST IMP PART OF POLYMORPHISM
		System.out.println("Human is Eating");
	}

	public static void main(String[] args) 	{
		Overriding obj=new Overriding();
		obj.eat();
	}
}