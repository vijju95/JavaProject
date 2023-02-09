package javaBasic;

public class HarshadNumber {

	public static void main(String[] args) {
		
	int num=156,i;
	int sum=0;
	int temp=num;
	
	while(num>0) {
		i=num%10;
		sum=sum+i;
		num=num/10;
	}
	System.out.println(sum);
	System.out.println(temp);
	if(temp%sum==0) {
		System.out.println("The number is Tanu @@@ number");
	}
	else
		System.out.println("Number is not harshad number");
	}
}
