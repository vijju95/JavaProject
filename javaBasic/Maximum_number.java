package javaBasic;

public class Maximum_number {

	public static void main(String[] args) {
		
		int n = 523686;
		int max=n%10;
		n=n/10;
		
		while(n>0) {
			int i = n%10;
			if(i>max) {
				max=i;
			}
			n=n/10;
		}
		System.out.println(max);
	}
}