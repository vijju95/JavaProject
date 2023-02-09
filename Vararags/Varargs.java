package Vararags;

class JUstnow{
	
	static void display(int num, String ...s){  
		
		  System.out.println("number is "+num);  
		  
		  for(String value:s){  
		   System.out.println(value);  
		  }	  
	}
	
	static void displayChar(char c) {
		System.out.println("char input"+"    "+c);
	}
}
public class Varargs {	 
	
		 public static void main(String args[]){  
	
			 JUstnow j=new JUstnow();
			 
			 j.display(500,"hello"); 
			 j.display(1000,"helloo","world","this","is","JAVA");  
			 j.display(1000,"my","name","is","varargs","For loop","multiplevalues");	
			 j.displayChar('a');
			 
		 }     
}
