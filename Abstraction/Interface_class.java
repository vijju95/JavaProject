package Abstraction;
//example is for if same method name of two parent class
interface first {
	//all methods of interface class are abstract no body
	void firstM1() ;
}

interface second {
	void firstM1();
}

class Simple implements first,second {
	
	public  void firstM1() {		
		System.out.println("simple method : ");
	}	 
}
public class Interface_class {

	public static void main(String[] args) {
		  Simple s=new Simple();
		  s.firstM1();
	}
}
/*
interface student {
	void printInfo();
}

class avi implements student {
	public void printInfo()	{
		String name= "avi";
		int age=23;
		System.out.println(name);
		System.out.println(age);
	}
}

class interfacesss {
	public static void main (String args[])
	{
		avi s = new avi();
		s.printInfo();
	}
}
*/