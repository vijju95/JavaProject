package Assignment;

public class Demo {

	public static void main(String[] args) {

		int num = 7;
		int count = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
			if (count > 1) {
				System.out.println(num + " is prime number");
			}
		else
			System.out.println("NA");
	}}
}

/*
 * int [] arr= {2,5,4,9,7}; int flag=0;
 * 
 * int count=0; for(count=0;count<arr.length;count++) { flag = 0; int
 * num=arr[count]; for(int i=2;i<num;i++) { if(num%i==0) { flag=1; break; } }
 * if(flag==0) { System.out.println(arr[count]); } }
 */