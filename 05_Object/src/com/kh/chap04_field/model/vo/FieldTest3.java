package com.kh.chap04_field.model.vo;
//클래스 변수(static변수)와 상수 필드(static final)에 대해
public class FieldTest3 {
	
	//접근제한자 [예약어] 자료형  변수명;
	
	public static int num=100;
	
	
	/*
	 * static"공유"의 개념이 강함=>프로그램 실행과 동시에 메모리영역에 박스를 만들고 공유를 해서 쓰자
	 * 자주사용하는 변수, 메서드를 static으로 선언함.
	 * 생성시점: 프로그램실행과 동시에 메모리의 static영역에 할당됨.(궅이 객체를 생성하지 않아도 할당됨)
	 * 소멸시점: 프로그램 종료시
	 * 
	 * 
	 */
	
	
	/*
	 * 상수필드
	 * public static final자료형 변수명=값;
	 * 한번 지정된 값을 고정해서 쓰기 때문에 무조건 초기화를 해줘야한다.
	 * 
	 * 예약의 순서는 상관없음(final static도 가능)
	 * 
	 * static :공유의 개념(재사용)
	 * final:(한번 지정된 값 변경x)(상수)
	 * 
	 * 값이 변경되서는 안되는 고정적인 값을 메모리상에 올려두고(프로그램 실행과 동시에 메모리 영역에 할당, 값이 변하지 않음)
	 * 공유하면서 사용할 목적으로 사용함.
	 * ex) Math.pi
	 * 
	 * 
	 * **상수명은 할상 모두 대문자로 변수명 작성
	 */
	public static final int NUM=9;
	
	public static void test() {
		System.out.println("안뇽");
	}
}
