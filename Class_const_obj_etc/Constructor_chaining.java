package Class_const_obj_etc;

public class Constructor_chaining {

	Constructor_chaining(){
		this(10);
		System.out.println("First...");
	}
	
	Constructor_chaining(int a){
		this(10, 20);
		System.out.println("Second...");
	}
	
	Constructor_chaining(int a, int b){
		System.out.println("third...");
	}
	
	public static void main(String[] args) {
		Constructor_chaining cc=new Constructor_chaining();
		
	}
}
