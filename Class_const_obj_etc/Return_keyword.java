package Class_const_obj_etc;

public class Return_keyword {

	int display(){
		return 10;			//value passed in return keyword must match with the method return type
	}
	
	public static void main(String[] args) {
		
		Return_keyword rk = new Return_keyword();
		rk.display();
		System.out.println(rk.display());
		
	}
}
