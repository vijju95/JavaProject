package javaBasic;

class Superclass{
	Superclass show() {
		return this;
	}
}

public class CovariantReturnType extends Superclass{
	CovariantReturnType show() {
		return this;
	}
	void display() {
		System.out.println("Example of covariant return type");
	}
	
	public static void main(String[] args) {
		//Superclass s=new CovariantReturnType();
		new CovariantReturnType().show().display();
	}
}








/*class A{    
A get(){return this;}    
}    
    
class B1 extends A{     
B1 get(){return this;}    
void message(){System.out.println("welcome to covariant return type");}    
    
public static void main(String args[]){    
new B1().get().message();    
}    
}  
*/