package com.kh.operator;

public class C_Compound {
	/*
	 * 복합대입 연산자: 산술연산자 대입연산자를 함께 사용하는 연산자
	 * += -= *= /= %=
	 * 
	 * a= a+3; a +=3;
	 * 기존에 a값에 3을 더해 a에 다시 대입해 주겠다.
	 * 
	 */
	public void method() {
		int num =12;
		System.out.println("현재 num:"+ num);
		//num3 증가시키기
		num = num+3;
		System.out.println("3을 증가시킨 num:"+num);
		//num을 3 또 증가시키기
		num +=3;
		System.out.println("또 증가시킨 num:"+num);
		
		//num을 5 감소시키키
		num -=5;
		System.out.println("5 감소시킨 num:"+ num);
		
		//num을 6배 증가시키기
		num *=6;
		System.out.println("6배 증가시킨 num:" +num);
		//num을 2배 감소시키키
		num /=2;
		System.out.println("2배 감소시킨 num:" +num);
		//num을 4로 나눳을때 나머지값을 num에 대입
		num %=4;
		System.out.println("최종 num:" +num);
		//+= 의경우 문자열 접합도 가능하다.
		String str="Hello";
		
		//str=str+"world";
		str +="world";
		System.out.println(str);
		
	}
	
}
