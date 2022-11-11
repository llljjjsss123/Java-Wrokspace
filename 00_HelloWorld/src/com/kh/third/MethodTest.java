package com.kh.third;

public class MethodTest {
	
	public void printMethodA() {
		
		System.out.println("프린트메소드A 출력중!");
		
		printmethodB();
	}
	
	public void printmethodB() {
		System.out.println("프린트메소드B 출력중!");
				
		printmethodC();
	}
	
	public void printmethodC() {
		
		System.out.println("프린트메소드C 출력중!");
		
		// printMethodA();
	}
}
