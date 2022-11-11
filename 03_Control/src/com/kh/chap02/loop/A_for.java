package com.kh.chap02.loop;

import java.util.Scanner;

public class A_for {
	/*
	 * <반복문>
	 * 프로그램 흐름을 제어하는 제어문중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두종류로 나뉜다
	 * for, while(DO-WHILE)
	 * 
	 * [표현법]
	 * for(초기식; 조건식 증감식;){//세미콜론을 통해서 구분, 무조건 있어야함
	 * 	반복적으로 실행시키고자 하는 코드 작성
	 * }
	 * 초기식: 반복문이 시작될대 "초기식에 딱 한번만 실행" 되는 구문
	 * 		(반목문에서 사용할 변수를 선언 및 초기화 할때 사용)
	 * 		ex)int i=0;
	 * 조건식: 반복문이 수행될 조건을 작성하는 구문
	 * 		조건식의 결과 ture이면 반복문 실행
	 * 		조건식의 결과가 false면 반복문 멈추고, 빠져나옴
	 * 		(보통 초기식에 제시된 변수를가지고 조건식을 작성)
	 * 증감식: 반복문을 제어하는 변수값을 증감식키는 구문
	 * 		(보통 초기식에 제시된 변수를 가지고 증감식을 작성)
	 * 			ex)i++, i+=1
	 * for문을 만나는 순간
	 * 초기식->조건식(조건검사)->ture일 경우 실행 할 코드 실행->증감식
	 * 		->조건식(조건검사)->ture일 경우 실행 할 코드 실행-> 증감식
	 * 		->조건식(조건검사)->ture-> 실행코드 실행->증감식
	 * 		->조건식(조건검사)->false경우 실행코드 실행x
	 * 매번 조건식의 조건검사 결과값을 가지고 조건이 true일 경우에만 반복 실행
	 * for문안에 초기식, 조건식, 증감식 각각 생력 가능, 단 반드시 ;작성
	 * 
	 */
	
	
	
	
	public void method1() {
		//안녕하세요를 5번 반복해서 출력
	//	System.out.println("안녕하세요");
	//	System.out.println("안녕하세요");
	//	System.out.println("안녕하세요");
	//	System.out.println("안녕하세요");
	//	System.out.println("안녕하세요");
		//5번 반복해서 출력되는 반복문
		for(int i=0; i<=4; i++) {//01234
			System.out.println("안녕하세요");
		}

//		for(;i<=4; i++) {//초기식 조건식 증감식이 없더라고 문법적 오류는 아님 다만 무한반복 됨
	//		System.out.println("야호~");
	//	}
		for(int i=11; i<=16; i++) {//01234
			System.out.println("무야호~");
	}
		for(int i=1; i<10;  i+=2) {
			System.out.println("반갑습니다요");
		}
	}
	public void method2() {
		//1~5까지 출력
		//i값을 1에서부터 6보다 작을때가지 1식증가할동안 반복 수행
		//12345
		for(int i=1; i<6; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i=5; i>0; i--) {
			System.out.print(i+" ");
		}
	}
	public void method3() {
		//i값이 1~10사이의 홀수만 출력
		//1 3 5 7 9
		
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
			System.out.print(i+" ");
		}
		}
		
		System.out.println();
	
		for(int i=5; i>10; i+=2) {
			System.out.print(i+" ");
		}
	}
	public void method4() {
		//1 2 3 4 5 6 7 8 9 10
		for(int i=0; i<=9; i++) {
			System.out.print((i+1)+" ");
		}
	}
	//산술 연산+반복문
	public void method5() {
		//1~10까지의 총 합계
		//방법 1. int sum=1+2+3....+10
		//방법 2. int sum=0선언후
				// sum+=1;
				//sum+=2;
				//sum+=3;....
		int sum=0;
		for(int i=1; i<=10; i++) {
			 sum+=i;
		}
				System.out.println("1부터 10까지의 합:"+sum);	
	}
	public void method6() {
		//1에서부터 사용자가 입력한 숫자까지 모두 더해서 출력해보기
		Scanner sc=new Scanner(System.in);
		System.out.println("양수값을 입력하시오: ");
		int num=sc.nextInt();
		
		if(num>0) {
			int sum=0;
			for(int i=1; i<=num; i++) {
				sum+=i;
			}
			System.out.println("1부터 "+num+"까지의 합계:"+sum);
		}
		else {
			System.out.println("잘못입력하셨습니다");
		}
	}
	
	public void method8() {
		//1부터 매번 달라지는 랜덤값(1~10사이의 랜덤한 정수)까지의 총합계
		/*
		 * java.lang.Math클래스에 이미 정의되어 있는 random()매소드를 호출하여
		 * 매번 다른 랜덤값을 얻어 올수 있다
		 * 
		 * static->객체시간에 자세히 다뤄좀 예정
		 * 
		 * 
		 * random():0.0~0.9999999999999..사이의 랜덤값 발생
		 * 0.0<=랜덤값<1.0
		 */
	//	Math m=new Math();
		//m.random();
		//int random=Math.random();
		//우선 10을 곱해보기
		//0.0<=랜덤값<10.0
		//1을 더해보자
		//1.0<=램덤값<11
		//소수점만 버려버리면 원하는 범위의 정수 랜덤값을 가져올수가있음
		//1<=랜덤값<=10
		
		//[표현법]
		//Math.random()*출력을하고자하는갯수+시작하고싶은수
		//시작수~(시작수+출력을하고하는개수)
		int random=(int)(Math.random() * 10 +1);
		System.out.println(random);
		
		int sum=0;
		for(int i=1; i<=random; i++) {
			sum+=i;
		}
		System.out.printf("1부터 %d까지의 총 합은 %d",random, sum);
	}
	public void method9() {
		//반복문 +String
		String str="hello";
		/*
		 *h=>str.chatAt(0)
		 *e=>str.chatAt(1)
		 *l=>str.chatAt(2)
		 *l=>str.chatAt(3)
		 *o=>str.chatAt(4)
		 *
		 *규칙을 찾기, 우선 반복적으로 set.charAt을 호출함.
		 *인덱스에 해당하는 숫자만 0부터 1식 4까지 증가함.
		 *  
		 */
		for(int i=0; i<=4;i++) {
			System.out.println(str.charAt(i));
		}
	}
	public void method10() {
		//사용자에세 문자열을 입력받아서
		//각 인덱스 별로 문자를 하나씩 뽑아서 출력
		// apple 길이: 5
		// 01234
		//kiwi 길이: 4
		//0123
		//마지막 인덱스는 문자열의 길이-1
		//추출하고자하는 인데스ㅢ 값의 범위는
		//0~(문자열의 길이-1)까지 매번 1씩증가
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열 입력");
		String str=sc.nextLine();
		
		//문자열의 길이를 알려주는 메소드
		System.out.println("문자열의 길이:"+str.length());
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		
	}
	public void method11() {
		//구구단 출력(2단)
		/*
		 * 2x1=2
		 * 2x2=4
		 * 2x3=6
		 * 2x4=8
		 * 2x5=10
		 * 2x6=12
		 * 2x7=14
		 * 2x8=16
		 * 2x9=18
		 */
		int num1=2;
		for(int i=1; i<=9;i++) {
			System.out.println("2X"+i+"="+(num1*i));
		}
	}
	public void method12() {
		//사용자가 입력한 단을 출력
		//단수가 2~9단이 아니라면 잘못입력했습니다
		//제대로입력했다면 해당 단수를 출력
		Scanner sc=new Scanner(System.in);
		System.out.println("단 입력:");
		int dan=sc.nextInt();
		
		if(dan>=2 && dan<=9) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d= %d\n", dan, i ,(dan*i));
			}
			
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
		}
	public void method13() {
		//1 ~5까지 연이어 출력
		//1 2 3 4 5가 출력 되도록 반복문 사용
		for(int i=1; i<=3; i++) {
		  for(int j=1; j<=5; j++) {//i , j, k
			System.out.print(j+" ");	
		}
		  System.out.println();
	}
	}
	public void method14() {
		//****
		//****
		//****
		//****
		//중첩반복문
		for(int i=1; i<=4; i++) {
			  for(int j=1; j<=4; j++) {//i , j, k
				System.out.print("*");	
			}
			  System.out.println();
		}
	}
	public void method15() {
		//1***
		//*2**
		//**3*
		//***4
		//중첩반복문
		for(int i=1; i<=4; i++) {
			  for(int j=1; j<=4; j++) {//i , j, k
				  if(i==j)
					 System.out.print(i);
				  else{
					  System.out.print("*");
		}
			  }
			  System.out.println();
	}
	}
	public void method16(){
		//2단부터 9단까지 출력
		int dan=2;
		
	//	System.out.printf("---%d 단---\n", dan);
	//	for(int i=1; i<=9; i++) {
	//		System.out.printf("%d X %d=%d \n", dan , i ,dan *i);
	//		}
		for(; dan<=9; dan++) {
		System.out.printf("---%d 단---\n", dan);
		for(int i=1; i<=9; i++) {
			System.out.printf("%d X %d=%d \n", dan , i ,dan *i);
		}
}
	}
}
