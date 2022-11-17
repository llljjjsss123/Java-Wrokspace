package com.kh.array.dimesion;

public class DimensionPractice {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	public void method1() {
		String[][] arr=new String[3][3];
		
		for(int i=0; i<arr.length; i++) {//012
			for(int j=0; j< arr[i].length; j++) {//012
				//arr[i][j]
				System.out.printf("(%d, %d)", i,j);
			}
			System.out.println();
		}
	}
	public void practice2() {
		int [][] arr=new int[4][4];
		
		int value=1;
		
		for(int i=0; i<arr.length; i++) {//012
			for(int j=0; j< arr[i].length; j++) {//012
				arr[i][j]=value++;	
			}
			
			
		}
		printArray(arr);
	}
	public void printArray(int[][]arr) {
		for(int i=0; i<arr.length; i++) {//012
			for(int j=0; j< arr[i].length; j++) {//012
				//arr[i][j]
				System.out.printf("%2d ", arr[i][j]);
			}
		System.out.println();
		}
	}
}
