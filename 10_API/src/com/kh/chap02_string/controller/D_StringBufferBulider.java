package com.kh.chap02_string.controller;

public class D_StringBufferBulider {
	
	/*
	 * String은 불변 클래스.
	 * StringBuffer과 StringBuiler은 mutable클래스
	 * 
	 * 문자열 연산이 번번하게 일어나는 알고리즘에서 발생하는 메모리 이슈를 해결하기 위해 나온 클래스
	 * 
	 * 기본적으로 두개의 클래스는 동일한 메소드를 지나며 차이점은 동기화(쓰레드 safe)여부.
	 * 
	 * StringButter는 멀티 스레드 환경에서 유용하며
	 * StringBuilder는 단일 스래드 환경에서 유용함
	 * 
	 */
	public void method() {
		String str="hello";
		str+="world";
		
		StringBuffer sb1=new StringBuffer("hello");
		sb1.append("world");
		StringBuffer sb2=new StringBuffer("hello");
		sb2.append("world");
		
		System.out.println(sb1.toString());
		System.out.println(sb2);
		System.out.println("sb의 길이는?"+sb1.length());
		//String fileName="TEST.txt"
		System.out.println("o의 마지막 위치는?"+sb2.lastIndexOf("."));
		//마지막위치의 문자를 없애는 매서드
		//마지막위치->문자열의 길이-1
		//sb.deleteCharAt(인덱스);
		sb1.deleteCharAt(sb1.length()-1);
		System.out.println(sb1);
		
		//내가 원하는 위치의 인덱스부터 내각 정한 마지막 인덱스까지 삭제
		//시작인덱스<=인덱스 범위 <=종료인덱스
		System.out.println(sb1.delete(0, sb1.length()-1));
	}
}	
