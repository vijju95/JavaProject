package javaBasic;

public class PositiveNegative {

	public static void main(String[] args) {
		int arr[]= {3,5,-1,6,7,-2,4};
		int arr1[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
}
