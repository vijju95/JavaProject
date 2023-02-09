package Inheritance;


class Philips{
	int price=40000;
	String audio="Good";
	
	public void P_show() {
		System.out.println(price);
	}
	public String toString(){
		return "Price is :"+price+"\n"+"Audio is :"+audio;
	}
}
class Sony extends Philips {
	int pricea=70000;
	String display="Beteter";
	
	public void S_show() {
		System.out.println(pricea+" + "+price);
	}
	public String toString() {
		System.out.println(super.toString());
		return price+" "+display+" "+audio;
	}
}
class Apple extends Sony{
	int price=100000;
	String features="Top";
	
	public void show() {
		System.out.println(display+" "+audio);
	}
	public String toString() {
		System.out.println(super.toString());
		return "price is : "+price+"\n"+"feature is : "+features;
	}
}
public class Television_Multiple {

	public static void main(String[] args) {
	Apple a = new Apple();
	a.S_show();
	a.show();
	a.P_show();
	System.out.println(a);
	}
}
