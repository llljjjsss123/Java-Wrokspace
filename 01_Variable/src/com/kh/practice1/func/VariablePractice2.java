package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2{
	public void test2(){
	
	Scanner sc=new Scanner(System.in);
	System.out.print("첫번째 정수를 입력하세요:");
	int num1=sc.nextInt();
	System.out.print("두번째 정수를 입력하세요: ");
	int num2=sc.nextInt();
	System.out.println("더하기 결과 :"+(num1+num2)+"입니다");
	System.out.println("빼기 결과 :"+(num1-num2)+"입니다");
	System.out.println("곱하기 :"+(num1*num2)+"입니다");
	System.out.println("나누기 몫 결과 :"+(num1/num2)+"입니다");
}
}