package Class_const_obj_etc;

public class Volumecalculator {
	
	int r,h,b,l,vCU=0;
	float vC=0;

	Volumecalculator(int r, int h){
		vC=3.14f*r*r*h;
		System.out.println("Volume of cylinder "+vC);
	}
	
	Volumecalculator(int l, int h, int b){
		vCU= l*b*h;
		System.out.println("Volume of cuboid : "+vCU);
	}
	
	
	public static void main(String[] args) {

		Volumecalculator v = new Volumecalculator(3, 2);
		Volumecalculator v1 = new Volumecalculator(3, 2, 1);
	}
}