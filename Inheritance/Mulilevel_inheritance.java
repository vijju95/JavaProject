package Inheritance;

class Laptop{
	int RAM=8;
	String processor= "Intel";
	Laptop(){
		System.out.println("Laptop");
	}
	void device() {
		System.out.println(RAM);		
	}
}
class iPad extends Laptop{
	int price=70000;
	String name="HP";
	iPad(){
		System.out.println("iPad");
	}
	void device() {
		System.out.println(processor);
	}
}
class iPhone extends iPad{
	iPhone(){
		System.out.println("iPhone");
	}
	void device() {
		System.out.println(price);
		System.out.println(RAM);
	}

}
public class Mulilevel_inheritance {

	public static void main(String[] args) {
		iPad i = new iPad();
		i.device();
		iPhone p = new iPhone();
		p.device();
	}
}
