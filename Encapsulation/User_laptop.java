package Encapsulation;

public class User_laptop {
	
	public static void main(String[] args) {
		
		Laptop l = new Laptop();
		
		l.setN("Lenovo Yoga");
		l.setP(10000);
		l.setPR("Intel i6");
		
		System.out.println(l.getN());
		System.out.println(l.getP());
		System.out.println(l.getPR());
	}

}
