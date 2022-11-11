package com.kh.chap01.comdition;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
	System.out.println("1.입력.");
	System.out.println("2.수정.");
	System.out.println("3.조회.");
	System.out.println("4.삭제.");
	System.out.println("7.종료.");
	Scanner sc=new Scanner(System.in);
	System.out.println("번호를 입력하세요:");
	int num=sc.nextInt();
	switch(num){
	case 1:System.out.println("입력메뉴입니다.");
	 break;
	case 2:System.out.println("수정메뉴입니다.");
	 break;
	case 3:System.out.println("조회메뉴입니다.");
	 break;
	case 4:System.out.println("삭제메뉴입니다.");
	 break;
	case 7:System.out.println("프로그램이 종료됩니다.");
	 break;
	default:
		System.out.println("잘못입력하셨습니다.");

}
	
}
	public void practice2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int num=sc.nextInt();
		if(num>0) {
			if(num%2==0){
				System.out.println("짝수입니다.");
			}
			else {
			System.out.println("홀수입니다.");
		}
		}
		else {
			System.out.println("양수만 입력해주세요");
		}
	}
	public void practice3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("국어: ");
		int kor=sc.nextInt();
		
		System.out.println("영어: ");
		int eng=sc.nextInt();
		
		System.out.println("수학: ");
		int math=sc.nextInt();
		
		int sum=kor + eng+math;
		double avg=sum/3.0;
		String result=kor>= 40&& eng>= 40&& math>= 40&& avg>=60 ? "합격" : "불합격";
		
		System.out.println("합계:"+sum);
		System.out.println("평균:"+avg);
		
		System.out.println(result);
	}
	public void practice4() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1월~12월 사이의 월을 입력해주세요:");
		
		int month=sc.nextInt();
		
		switch(month) {
		case 1:System.out.println(month+"월은 겨울입니다.");break;
		case 3:System.out.println(month+"월은 봄입니다.");break;
		case 5:System.out.println(month+"월은 봄 입니다.");break;
		case 7:System.out.println(month+"월은 여름입니다.");break;
		case 8:System.out.println(month+"월은 여름입니다.");break;
		case 10:System.out.println(month+"월은 가을입니다.");break;
		case 12:System.out.println(month+"월은 겨울입니다.");break;
		case 4:System.out.println(month+"월은 봄입니다.");break;
		case 6:System.out.println(month+"월은 초여름입니다.");break;
		case 9:System.out.println(month+"월은 여름입니다.");break;
		case 11:System.out.println("해당 달은 가을입니다.");break;
		case 2:System.out.println(month+"월은 겨울입니다.");break;
		default:System.out.println(month+"월은 잘못입력했습니다.");
			
		}
		
	}
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.println("아이디: ");
		String id=sc.nextLine();
		
		System.out.println("비밀번호 :");
		String pwd=sc.nextLine();
		
		//1. id값을 잘 입력했는지 체크
		//2. id값이 잘 입력되었으면 비밀번호 잘 입력 했는지 체크
		if(id.equals("minmin")) {//id값 확인
			if(pwd.equals("Min1234")) {
				//로그인 성공
				System.out.println("로그인 성공!");
			}
			else {
				//비밀번호 입력 실패
				System.out.println("비밀번호가 잘못 됬습니다.");
			}
		}
		else {
			System.out.println("아이디를 잘못 입력하셨습니다.");
		}
	}
		public void practice6() {
			Scanner sc=new Scanner(System.in);
			System.out.println("권한을 확인하고자 하느 회원 등급:");
			String grade=sc.nextLine();
			
			switch(grade) {
			case "관리자": System.out.print("회원관리, 게시글 관리, ");
			case "회원":	System.out.println("게시글 작성, 댓글 작성");
			case "비회원":System.out.println("게시글 조회");
			
			}
			
		}
		public void practice7() {
			Scanner sc=new Scanner(System.in);
			System.out.println("키(m)를 입력해주세요");
			double height=sc.nextDouble();
			
			System.out.println("몸무게(kg)를 입력해주세요");
			double kg=sc.nextDouble();
			
			double BMI=kg/(height*height);
			String result="";
			
			if(BMI<18.5) {
				result="저체중";
			}
			else if(BMI<23) {
					result="정상체중";
				}
			else if(BMI<25) {
				result="과체중";
			}
			else if(BMI<30) {
				result="비만";
			}
			else {
				result="고도비민";
			}
			System.out.println("BMI"+BMI);
			System.out.println(result);
		}
		public void practice8() {
			Scanner sc=new Scanner(System.in);
			System.out.println("피연산자1 입력");
			int num1=sc.nextInt();
			
			System.out.println("피연사자 2 입력");
			int num2=sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("연산자를 입력(+,-,*,/,%):");
			char op =sc.nextLine().charAt(0);
			
			switch(op) {
			case '+' :System.out.printf("%d %c %d=%d", num1, op, num2, (num1+num2));
			break;
			case '-' :System.out.printf("%d %c %d=%d", num1, op, num2, (num1-num2));
			break;
			case '*' :System.out.printf("%d %c %d=%d", num1, op, num2, (num1*num2));
			break;
			case '/' :System.out.printf("%d %c %d=%f", num1, op, num2, (num1/(double)num2));
			break;
			case '%' :System.out.printf("%d %c %d=%d", num1, op, num2, (num1%num2));
			break;
			default:System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		
			
	}
			public void practice11() {
				Scanner sc=new Scanner(System.in);
				System.out.println("비밀번호 입력1000~9999:");
				int pwd=sc.nextInt();
				
				if(pwd>999 && pwd<9999) {//자리수 체크
					int first=pwd %10;//일의자리수 구하기
					int second=(pwd/10)%10;//십의자리수 구하기
					int third=(pwd/100)%10;//백의자리수 구하기
					int forth=(pwd/1000)%10;//천의자리수 구하기
					//중복값이 있는지 처리하기
					if(first != second && first !=third && first !=forth && second != third &&
							second != forth && third != forth) {
						//성공
						System.out.println("생성 성공");
					}
					else {
						System.out.println("중복 값 있음");
					}
				}
				else{//자리수가 3자리이하거나, 5자리 이상인경우
					//자리수 안 맞음 출력
					System.out.println("자리수 안맞음");
				}
}
}
