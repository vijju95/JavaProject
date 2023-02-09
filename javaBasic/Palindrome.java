package javaBasic;

public class Palindrome {

	public static void main(String[] args) {
		
			int n= 78512587;		
			int r,sum=0,temp;		//r for reminder, sum for number storing, temp for temporary number storing 
			temp=n;					//store number n which change in every cycle thats why ref taken temp=n 
			
			while(n>0) {           	// n is greater than zero then check
				r=n%10;			   	// these will give reminder of n and store into r.....1)1, 2)2, 3)1
				sum=(sum*10)+r;	   	// last value stored every cycle
				n=n/10;				//remove last number upto loop get completed...1)12, 2)1, 3)0(loop closed hrre
			}						//last value is stored in sum
			
			if (temp==sum) {
				System.out.println("number is palindrome");
			}
			else {
				System.out.println("number is not palindrome");
			}
		
		//program for sum of even number upto n
//		int n=10; 							//print sum of even number upto 10 from 0
//		int sum=0;							//initializing sum							
//		for(int i=0; i<=n; i=i+2) { 		//i=i+2 every iteration new even value checked
//			sum=sum+i;
//		  //System.out.println(sum);		//if user want to observe all values printed upto n
//		}
//		System.out.println(sum);			//if user want to observe sum
		
	}
}
