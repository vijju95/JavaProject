package javaBasic;

public class Frequency_number {

	public static void main(String[] args) {

		int n=1592581;
		int temp=n;
		int j;
		int count=0;
		for(int i=1; i<=9;i++) {
			j=temp%10;
			if(j==i) {
				count++;
				System.out.println(i+" "+count);
			}else
				System.out.println(i+" "+count);
			
			temp=temp/10;
		}
		
	}
}