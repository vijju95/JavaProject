package javaBasic;

public class Armstrong_number {

	public static void main(String[] args) {

		int n=407;
		int temp=n, sum=0, e;
		while(n>0) {
			e=n%10;
			sum = sum + (e*e*e);
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("armstrong no");
		}
		else
			System.out.println("not a armstrong no");
		
	}

}
