package Encapsulation;

public class Book {
	
	private String bookName;
	private String bookPrice;
	private String authorName;
	
	
	void setName(String b) {
		bookName=b;
	}
	String getName() {
		return bookName;
	}
	
	void setPrice(String p) {
		bookPrice=p;
	}
	String getPrice() {
		return bookPrice;
	}
	
	void setAuthname(String n) {
		authorName=n;
	}
	String getAuthname() {
		return authorName;
	}
	
}
