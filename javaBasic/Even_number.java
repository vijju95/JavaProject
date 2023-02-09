package javaBasic;

public class Even_number {

	public static void main(String[] args) {

		
		  //For loop even 
		  int E=229;
		  for(int c=121; c<=E; c++) { 
			  if(c%2 == 0) { 
				  System.out.println(c); 
			  } 
		  }
		  
		  //For loop odd break statement 
		  int O=352;
		  for(int i=252; i<=O; i++) { 
			  if(i%2 != 0) { 
				  System.out.println(i); 
				  break; 
			  }
		  }
		  
		  
		  //While loop 
		  int n=229;
		  while(n<=521) { 
			  if(n%2==0) 
				  System.out.println(n); 
			  n++; 
		  }
		  
		  
		  //Do while loop 
		  int c=121;
			for(;c<=129;c++) {
				if(c%2==0) {
					System.out.println(c);
				}else
					System.out.println("midle");
			}
		  
		  //Alphabets a to z 
		  for(int z='A';z<='Z';z++) { 
			  System.out.printf(" %c", z); 
		  }
		  
		  //sum of even no upto 10
		  int sum=0; 
		  for(int x=0; x<=10; x++) { 
			  if(x%2==0) { 
				  sum=sum+x; 
			  } 
		  }
		  System.out.println(sum);
		  
		  
		  //Number of digit in number 
		  int v=4044555; 
		  int count=0; 
		  while(v>0) { 
			  v=v/10;
			  count++; 
		  } 
		  System.out.println(count);
		  
	}
}