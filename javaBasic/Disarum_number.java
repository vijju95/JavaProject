package javaBasic;

import java.util.Scanner;

public class Disarum_number {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		
		int p,i=0,rev,res,s=0,sum=0;
		p=n;
				
		while(p>0) {
			rev=p%10;
			s=s*10+rev;
			p=p/10;
		}while(s>0){
			res=s%10;
			i++;
			sum=sum+(int)Math.pow(res,i);
			s=s/10;
		}if(sum==n) {
			System.out.println("Disariumnumber");
		}else {
			System.out.println("not disarium num");
		}
		sc.close();
	}

}
