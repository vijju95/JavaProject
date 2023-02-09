package Array;

public class Demo {

	public static void main(String[] args) {
		//4, 11, 7,13, 12, 16
		int[] arr= {88,5,3,6,4,7,8,9};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=arr[i]+arr[i+2];
			System.out.println(sum);
		}
		
	}
}
