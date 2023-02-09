package Class_const_obj_etc;

public class ThisKeyword {

	int num;
	String name;
	float percentage;

	ThisKeyword(int num, String name, float percentage){
		this.num=num;
		this.name=name;
		this.percentage=percentage;
	}
	
	void display() {
		System.out.println(num+" "+name+" "+percentage);
	}
	
	public static void main(String[] args) {

		ThisKeyword t = new ThisKeyword(10, "ViJaY", 40.44f);
		t.display();
	}
}
