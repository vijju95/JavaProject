package javaBasic;

public class Prime_number {

	public static void main(String[] args) {
		
		int[] arr= {2,5,4,9,7};
		
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			for(int j=2;j<arr[i];j++) {
				if(arr[i]%j==0) {
					flag=true;
					break;
				}
			}
			if(flag=false) {
				System.out.println(arr[i]+"prime number");
			}
		}
	}
}