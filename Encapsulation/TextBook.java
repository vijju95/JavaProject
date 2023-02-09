package Encapsulation;

public class TextBook {

	public static void main(String[] args) {

		Book b=new Book();
		
		b.setAuthname("Author name is : Einstein");
		b.setName("Book name is : Java");
		b.setPrice("book price is : "+500);
		
		System.out.println(b.getAuthname());
		System.out.println(b.getName());
		System.out.println(b.getPrice());
	}

}
