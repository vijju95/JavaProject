package javaBasic;

public class Type_Casting {

	void Explicit() {	
		long l=125451;
		int i=(int) l;
		
		System.out.println(l);
		System.out.println(i);
	}
	void Implicit() {
		int i=10;
		long l=i;
		
		System.out.println(i);
		System.out.println(l);
	}
	
	public static void main(String[] args) {
		Type_Casting t = new Type_Casting();
		
		t.Explicit();
		t.Implicit();
	}
}
