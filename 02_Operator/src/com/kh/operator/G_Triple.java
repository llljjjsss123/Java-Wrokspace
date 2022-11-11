package com.kh.operator;
import java.util.Scanner;
public class G_Triple {
	/*
	 * 삼항연산자 : 3개의 항목을 가지고 연산하는 연산자.
	 * 
	 * [표현법]
	 * 
	 * 조건식 ? 조건식이 true일경우 결과값: 조건이 false일 경우의 결값
	 * 
	 * 
	 */
	public void method1() {
		//사용자가 입력한 정수값이 양수인지 아닌지 판별후, 양수라면 양수입니다, 아니라면 양수가 아닙니다 출력
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수 값을 입력: ");
		int num=sc.nextInt();
				
	   // String result=(num>0) ? "양수입니다" : "양수가 아닙니다";
	   // System.out.println(num+"은(는)"+result);
	    
		//산술연산이 삼항연사보다 우선순위가 높아서 괄호로 묶어줘야 한다.
	    System.out.println(num+"은(는)"+(num <=0 ? "양수가 아닙니다" : "양수입니다."));
	}
	public void method2() {
		//사용자가 입력한 정수값이 짝수인지 홀수인지 판별후 출력
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수 값을 입력: ");
		int num=sc.nextInt();
		//xx는 짝수(홓수)입니다
		String result= num%2==0 ? "짝수입니다."  : "홀수입니다.";;
		// System.out.println(num+"은(는)"+(num /2==0 ? "짝수입니다" : "홀수입니다."));
		System.out.println(num+"(은)는"+result);
	}
	public void method3() {
		//사용자로부터 영문자 하나를 입력받아 대문자인지, 아닌지 판별후 출력(아스키 코드표 활용)
		Scanner sc=new Scanner(System.in);
		System.out.println("영문자 한개만 입력: ");
		char ch=sc.nextLine().charAt(0);
		
		String result=('A'<=ch && ch<='Z') ? "대문자입니다" : "대문자가 아닙니다.";
			
		System.out.printf("%c 는 %s \n", ch, result);
		
	}
	//삼항연산자를 중첩사용
	public void method4() {
		//method1()의 내용보완
		//사용가가 입력한 정수값이 양수인지, 0인지 음수인지 판단
		Scanner sc=new Scanner(System.in);
		System.out.println("정수값 입력:");
		int num=sc.nextInt();
		
		String result =(num> 0? "양수입니다." :(num==0? "0입니다" : "음수입니다"));
		
		System.out.println("사용자가 입력한 값인"+num+"은" +result);
		
	}
	public void method5() {
		//두개의 정수값과 +, -의 문자를 입력 받아
		//+일경우 두 정수값 +
		//-일경우 두 정수값 -
		//둘다 아닐 경우 잘못 입력했습니다.
		Scanner sc=new Scanner(System.in);
		System.out.println("연산자 입력: (+,-)");
		char op=sc.nextLine().charAt(0);
		
		System.out.println("첫번째 정수를 입력하시오");
		int num1=sc.nextInt();
		
		System.out.println("두번째 정수를 입력하시오");
		int num2=sc.nextInt();
		
		String result= (op == '+') ? (num1 +num2)+"" :(op=='-') ? (num1-num2)+" ": "잘못입력했습니다.";
				System.out.println(result);
	}
}
