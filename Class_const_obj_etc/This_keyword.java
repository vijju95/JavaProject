package Class_const_obj_etc;

public class This_keyword {

	String product;
	int cost;
	String brand;
	
	This_keyword(String product, int cost, String brand){
		this.product = product;			//compilor confuse between two same keywords and null op throws
		this.cost = cost;				//if we use c=cost; no need to use this keyword
		this.brand = brand;
	}
	void display() {
		System.out.println(product +cost +brand);
	}
}