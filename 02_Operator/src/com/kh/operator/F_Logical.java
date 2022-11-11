package com.kh.operator;
import java.util.Scanner;
public class F_Logical {
	/*
	 * 논리연산자
	 * 두개의 논리 값을 연산하는 연산자
	 * 논리값 (논리연산자) 논리값 ->결과값도 논리값
	 * 
	 * AND 연산자 : 논리값 && 논리값
	 * 				왼쪽    오른쪽 논리값이 둘다 ture여야 최종결과가  ture가 반환됨.
	 * OR 연산자  :논리값 ||	논리값 
	 * 				왼쪽    오른쪽  어느값이 true이면 최종결과가 ture
	 *  
	 * 
	 */
	public void method1() {
		//사용자가 입력한 정수값이 양수 이면서 짝수인지 확인하기.
		Scanner sc= new Scanner(System.in);
		
		System.out.println("정수값 한개 입력: ");
		int num=sc.nextInt();
		
		 boolean result= (num >0) && (num % 2==0);
		 //&& 의미: 그리고 , ~이면서 , ~이고
		 
		 System.out.println("사용자가 입력한 값이 양수임녀서 짝수이니까?"+result);
		 
		
	}
	 public void method2() {
		 //사용자가 입련한 정수값이 1이상 100이하의 수인지 확인하기.
		 Scanner sc= new Scanner(System.in);
		 System.out.println("1이상 100이하인 수 확인: ");
			int num=sc.nextInt();
		 //사용자가 입력한 값이 1이상 100이하 입니가? true/false
			boolean result= (num >=1) && (num <= 100);
			System.out.println("사용자가 입력한 값이 1이상 100이하 입니까?"+result);
			/*
			 * &&(and): 그리고,~이면서,~이고 뿐만아니라
			 * 			두개의 모두 참이여야 참값이 나옴
			 * 			둘중하나라고 거짓이면 false 나옴
			 */
	 }
	 public void method3() {
		 //사용자가 입력한 값이  y 이거나 Y인지 확인하기.
		 Scanner sc=new Scanner(System.in);
		 System.out.println("계속 진행하시려면 y또는 Y를 입력하세요: ");
		 char ch=sc.nextLine().charAt(0);
		 
		 boolean result= (ch =='y') || (ch=='Y');
		 System.out.println("사용자가 입력한 값이 y 또는 Y입니까?: "+result);
		 /*
		  * || (OR): 또는, ~이거나
		  * 
		  * 두개의 조건중 하나라고 true일 경우 최종 결과 값은 true
		  * 두개의 조건이 모두 false일 경우 최종 결과 값은 false
		  */
	 }
	 public void  method4() {
		 
		 int num1=10;
		  boolean result1= false && (++num1 >0);
		  /*
		   * 뒤에 비교연산 구문이 Dead code 라고 뜬다.
		   * 실행 할때 오류 나지 않지만, resulf1 결과값이 어차피 false
		   *  인데 왜 작성한 구문인지 물어보는것
		   */
		  System.out.println("num1: "+num1);
		  
		  boolean result2 = true || (++num1>0);
		  System.out.println(num1);
	 }
}
