package Abstraction;

abstract class Airconditioner{
	String cooling;
	int temprature;
	//consrtructor
	Airconditioner(int temp){
		System.out.println("Grand Parent : "+temp);
	}
	//instance metdod
	void display() {
		System.out.println("display method : "+cooling);
	}
	//abstract method
	abstract void show(String s);
}

class LG extends Airconditioner{
	
	LG(int temp) {
		super(temp);
	}
	public void show(String s) {
		System.out.println("cooling is : "+s);
	}
}
class Voltas extends Airconditioner{
	
	Voltas(int temp) {
		super(temp);
	}
	public void show(String s) {
		
		System.out.println("cooling is "+s);
	}
}

public class Abstract_class {
	public static void main(String[] args) {
		
	Airconditioner a = new LG(10);
	a.show("Excelent");
	
	Airconditioner b= new Voltas(20);
	b.show("better");
	b.display();
	
	}
}
//abstract class sunstar {
//	abstract void printInfo();
//}
//
//class employee extends sunstar {
//	void printInfo() {
//		String name = "avinash";
//		int age = 21;
//		float salary = 222.2F;
//
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(salary);
//
//	}
//
//}
//
//class base {
//	public static void main(String args[]) {
//		sunstar s = new employee();
//		s.printInfo();
//	}
//}
