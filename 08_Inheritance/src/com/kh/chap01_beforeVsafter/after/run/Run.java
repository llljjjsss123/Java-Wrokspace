package com.kh.chap01_beforeVsafter.after.run;

import com.kh.chap01_beforeVsafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVsafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVsafter.after.model.vo.Tv;

public class Run {
	public static void main(String[] args) {
			
		//데스크탑 객체
		//brand,pCode,pName,price,allInOne
		Desktop d=new Desktop("삼성","d-01","삼성데스크탑",1500000,true);
		
		//스마트폰 객체
		//brand,pCode,pName,price,mobileAgency
		SmartPhone s=new SmartPhone("애플","s-01","아이폰14",1400000,"LG");
		
		//Tv 객체
		//brand,pCode,pName,price,inch
		Tv t=new Tv("엘지","t-01","얇은티비",3500000,60);
		/*
		 * 실행하고자하는 메서드가 자식클래스에 없다면, 자동으로 부모클래스에 있는 메소드가 실행됨.
		 * 단, 자식클래스에서 오버라이딩(메소드 재정의)가 되어있을경우
		 * 자식클래스에 있는 오버라이딩 메소드가 우선권 가짐
		 */
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		/*
		 * 상속의장점
		 * 보다 작은양의 코드로 새로운 클래스 작성가능
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 상속의 특징
		 * 클래간의 상속은 다중상속이 불가능함(단일상속만가능)
		 * 명시되있지 않지만 모든클래스는 Object클래스의 후손
		 * =>Object클래스의 있는 메소드를 사용가능
		 * =>Object클래스에 있는 메소드가 맘에안들면 오버라이딩을 통해 재정의 가능
		 */
	}
}	
