package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void test3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("세로의 길이:");
		double height=sc.nextDouble();
		System.out.print("가로의 길이:");
		double width=sc.nextDouble();
		System.out.println("면적"+(height*width));
		System.out.println("둘레"+(height+width)*2);
	}

	
}
