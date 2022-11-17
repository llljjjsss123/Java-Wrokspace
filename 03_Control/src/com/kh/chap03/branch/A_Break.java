package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	/*
	 *break문을 만나는 순가 현재 속해있는 가까운 반복문만 빠져나감
	 *
	 * switch안에 break와는 다른 개념
	 * switch안에 break는 switch만 빠져나감
	 * 
	 *
	 */
	public void method1() {
		//매번 반복적으로 발생되는 랜덤값(1~100)출ㄹ력
		//그 랜덤값이 3의 배수일경우에만 반복문 종료.
		while(true) {
			//랜덤값 추출
			int random=(int)(Math.random()*100+1);
			//랜덤값을 출력 
			System.out.println("random:"+random);
			//랜덤값이 3의 배수인지 검사
			if(random %3==0) {
				break;
			}
			
			
		}
	}
	public void method2() {
		//매번(무한반복) 사용자에게 문자열을 입력받은 후 해당 문자열의 길이 출력
		//단 사용자가 입력한 문자열이 "exit"인경우 반복문을 종료
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("문자열을 입력:");
			String str=sc.nextLine();
			if(str.equals("exit")) {
				break;
			}
			
			System.out.println(str+"의 길이는:"+str.length());
		}
	}
	public void method3() {
		//매번 반복적으로 사용자에게 양수를 입력 받아 1~사용자가 입력한 수까지 출력
		//단, 정삭적을 양수를 입력했을시 1~사용자가입력한수까지 출력 하고 종료
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("양수 입력:");
			int num=sc.nextInt();
			
			if(num>0) {//양수 제대로 입력->1~num출력 후 종료
				for(int i=1; i<=num; i++) {
					System.out.println(i);
				}
				break;
			}
			else{//잘못입력시 ->잘못 입력시 다시입력 출력
				System.out.println("잘못된 입력 다시 입력하세요");
			}
		}
	}
}
