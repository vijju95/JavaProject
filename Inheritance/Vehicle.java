package Inheritance;

class Car {
	String model_name;
	int price;
	int speed;
	
	Car(String model_name,int price,int speed){
		this.model_name=model_name;
		this.price=price;
		this.speed=speed;
	}
	
	public String toString(){
		return "model name"+model_name+"\n"+"price is"+price+"\n"+"speed is"+speed;
	}
}
class Honda extends Car {
	String music_Player="available";
	Honda() {
		super("Honda",300000,120);
	}	
	public String toString() {
		System.out.println(super.toString());
		return "music player.."+music_Player;
	}
}

class Honda5 extends Honda {
	String bluetoothSystem="available";
	String automatic_gearing="available";
	
	public String toString() {
		System.out.println(super.toString());
		return "bluetooth system.."+bluetoothSystem+"automatic_gearing.."+ automatic_gearing;
	}
}
public class Vehicle {

	public static void main(String[] args) {
		Honda5 h=new Honda5();
		System.out.println(h);
	}
}
