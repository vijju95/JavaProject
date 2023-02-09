package Vararags;

public class Varargs2 {

	public void display(int...a) {
		
		System.out.println("Display method call");
		
		for(int n:a) {
			System.out.println(n);
		}
		
		System.out.println("____________________");
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		Varargs2 v=new Varargs2();
		v.display(10,20,30,50,60,80,40);
	}
}