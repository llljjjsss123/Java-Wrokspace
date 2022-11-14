package com.kh.chap02.loop;

import java.util.Scanner;


public class B_While {
	Scanner sc=new Scanner(System.in);
	/*
	 * while[표기법]
	 * [초기식]
	 * while(조건식){//조건아 true일 경우 해당구문을 반복적으로 실행, 조건식 내용에 true를 작성시무한반복함
	 * [증감식];// 필수는아님
	 *}
	 *
	 * for문과 다르게 초기식, 증감식 필수가 아님.
	 * 
	 * 분기문에서 초기식, 증감식없이 작성하는법을 배울예정.
	 * 
	 * 
	 *
	 */
	public void method1() {
		//for문을 while문으로 , 바꿈 while문을 for문으로 표현 할수 있음
		for(int i =0; i<5; i++) {
			System.out.println("안녕하세요");
		}
			int i=0;//초기식
			while(i<5) {//조건식
				System.out.println("안녕하세요");
				i++;//증감식
		}
			System.out.println("i :"+i);
	}
	public void method2() {
		//1~10사의 정수중 홀수만 출력
		//처음에는 for문으로, 두번째는 while문으로
			for(int i=1; i<10; i++) {
				if(i%2==1)
				System.out.print(i+" ");
			}
			System.out.println();
			for(int i=1; i<10; i+=2) {
				System.out.print(i+" ");
		}
		/*	int i=1;
			while(i<10) {
				if(i%2==1) {
					System.out.println(i+" ");
				}
				i++;
			}*/
	}	
		public void method3() {
			//1부터 랜덤값(1~100)까지의 총 합계
			
			int random=(int)(Math.random()*100+1);
			//0.0<=랜덤값 <100.0
			//1.0<=랜덤값 <101.0
			//1.0<=랜덤값 <100.0->1<=랜덤값<=100
			
			int sum=0;
			
//			int i=1;
//			while(i<=random) {
//				sum+=i;
	//			i++;
		//}
			while(random>0) {
				sum+=random--;
			}
			System.out.println("1부터 "+random+"까지의 총 합은:"+sum);
					
		}
		public void method4() {
			//A_For 10번째 메서드를 while문으로 바꾸기
			java.util.Scanner scanner=new java.util.Scanner(System.in);
			System.out.println("문자열 입력하시오");
			String str=sc.nextLine();
			
			int i=0;
			while(i<str.length());{
				System.out.println(str.charAt(i));
				i++;
			}
			
			
		}
		/*
		 * 
		 * 
		 * do while
		 * 표현법
		 * do{//조건 검사없이 무조건 1번은 do 실행 조건이 맞지 않아도 마찬가지
		 *  실행코드
		 * }whlie(조건식);//조건식의 결과가 true면 실행코드 다시실행
		 * 				//조건식의 결과가 false면 반복문을 빠져나옴
		 * for/while문과 do-while문의 차이점
		 * for/while문은 처음 시작할때부터 조건검사를하고 반환값이 true야 실행을 하는데.
		 * do while문은 첫실행은 무조건 조건검사없이 실행함
		 */
		public void method5() {
			//조건식이 맞지 않은 경우에 do-while문 테스트
			int num=999;
			do {
				System.out.println("하이요");
			}while(num==0);
		}
		public void method6() {
			//1 2 3 4 5 
			
			int i=1;
			do {
				System.out.print(i++ +" ");
			}while(i<=5);
		}
		public void method7() {
			//1부터 사용자가 입력한 숫자사지의 총합계
			//do-while문 사용
			//"1부터 x까지의 총 합계:xx"
			Scanner sc=new Scanner(System.in);
			System.out.println("숫자 입력");
			int num=sc.nextInt();
			int sum=0; 			
			int i=1;
			do {
				sum+=i++;
			}while(i<=num);
			System.out.printf("1부터 %d까지의 총 합계:%d",num,sum);
		}
		     
		}
		

