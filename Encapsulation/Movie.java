package Encapsulation;

public class Movie {
	
	private String moviename;
	private String moviecategory;
	private int ticketcost;
	
	
	public void getMname(String m) {
		moviename=m;
	}
	String setMname() {
		return moviename;
	}
	
	public void getMcat(String mo) {
		moviecategory=mo;
	}
	String setMcat() {
		return moviecategory;
	}
	
	public void getMc(int ti) {
		ticketcost=ti;
	}
	int setMc() {
		return ticketcost;
	}
}
