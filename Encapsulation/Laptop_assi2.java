package Encapsulation;

public class Laptop_assi2 {

	public static void main(String[] args) {
		Laptop_assignment l=new Laptop_assignment();
		
		l.setnoofUSBPort(5);
		l.setprocessorSpeed(50);
		
		System.out.println("No of port are : "+ l.getnoofUSBPort());
		System.out.println("Processor speed is : "+l.getprocessorSpeed());
	}
}
