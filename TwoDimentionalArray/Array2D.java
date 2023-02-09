package TwoDimentionalArray;

import java.util.Scanner;

class TwoD{
	TwoD() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int column=sc.nextInt();
		int row=sc.nextInt();
		
		System.out.println("Enter array element : ");
		int arr[][]=new int[row][column];
		for(int i=0;i<column;i++) {
			for(int j=0;j<row;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//int arr[][]= {{2,3,4},{6,7,9}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
			}
			//System.out.println();
		}
	}
}

class ThreeD{
	ThreeD(){
		
		int arr[][][]= {{{1,2},{4,5}},{{7,8},{9,1}},{{1,2},{2,3}}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				for(int k=0;k<arr.length;k++) {
					System.out.println("arr["+i+"]["+j+"]["+k+"]="+arr[i][j][k]);
				}
			}
		}
	}
}

class Assignment{
	//find max of 2d array
	Assignment(){
		int arr[][] ={{22, 31, 15}, {13, 35, 16}};
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
		}
		System.out.println("Max value in array is : "+max);
	}
}

class FourbyFour{
	FourbyFour(){
		int arr[][]= {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println("arr ["+i+"]["+j+"] = "+arr[i][j]);
			}
		}
	}
	
}

public class Array2D {
	
	public static void main(String[] args) {
		
	TwoD t=new TwoD();
		//ThreeD tt=new ThreeD();
		//Assignment a=new Assignment();
		//FourbyFour f=new FourbyFour();
	}
}
