package javaBasic;

class Bank{  
	String FD_rate="Fixed";  
	public String display(int a) {
		return "Parent class : "+a;
	}
	Bank(){
		System.out.println("I am constructor of Bank");
	}
}  
class HDFC extends Bank{  
	String FD_rate="ChangingFD";  
	void Intrest(){  
		System.out.println(FD_rate);
		System.out.println(super.FD_rate); 
	}
	
	public String display(int a) {
		super.display(a);
		return "Child class : "+a;
		
	}
}
class SuperKeyword{
		public static void main(String args[]){  
			HDFC b=new HDFC();  
			b.Intrest();
			System.out.println(b.display(10));
		}
}  
