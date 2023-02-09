package Exception;

//runtime poly
abstract class demoo{

	demoo(){
		System.out.println("abc");
	}
	public void show() {
		
	}
}

class Demo extends demoo{

	public static void main(String[] args) {
		Demo d=new Demo();
	}
}
