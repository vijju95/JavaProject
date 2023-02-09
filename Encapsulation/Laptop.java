package Encapsulation;

public class Laptop {

	private String name;
	private int price;
	private String processor;
	
	public void setN(String names) {
		name=names;
	}
	
	String getN() {
		return name;
	}
	
	public void setP(int prices) {
		prices=price;
	}
	
	int getP() {
		return price;
	}
	
	public void setPR(String processors) {
		processors=processor;
	}
	String getPR() {
		return processor;
	}
}
