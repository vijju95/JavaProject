package javaBasic;

public class Fibonacci {

	public static void main(String[] args) {
			
			int n = 20;
			int f=1, s=1, t;
			
			System.out.println(f);
			System.out.println(s);
			
			
			for(int i=1;i<=n;i++)
			{
				t=f+s;
				System.out.println(t);
				f=s;					//every iteration f will get value of s
				s=t;					//every iteration s will get value of t
			}
	}
}