package Array;

public class EvenOdd {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 6, 5, 7, 10 };
		int arr2[]=new int[arr.length];
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				arr2[j]=arr[i];
				j++;
				System.out.println(arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr2[j]=arr[i];
				j++;
				System.out.println(arr[i]);
			}
		}
	}
}