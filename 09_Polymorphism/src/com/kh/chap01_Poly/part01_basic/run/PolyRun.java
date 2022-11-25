package com.kh.chap01_Poly.part01_basic.run;

import com.kh.chap01_Poly.part01_basic.model.vo.*;

public class PolyRun {

	public static void main(String[] args) {
		/*
		 * 명심:=대입 연사자 기준으로 왼쪽 오른쪽 자료형은 항상 같아야함
		 * 
		 * 1.부모타입 레퍼런스 변수로 부모타입의 객체를 다루는것 당연히 가능
		 * 
		 */
		System.out.println("1.부모타입 레퍼런스 변수로 부모객체를 다루는 경우");
		Parent p1=new Parent();
		p1.printParent();
	//p1.레퍼런스 변수로 Parent에만 접근 가능
	
	//2.자식타입 레퍼런스 변수로 자식 객체를 다르는 경우(지난시간에 배운것)
		System.out.println("2. 자식타입 레퍼런스 변수로 자식 객체를 다루는 경우");
		Child1 c1=new Child1();//기본생성자에 슈퍼 생성자 호출하는 구문이 항상 있음. 따라서 부모객체 사용가능.
		c1.printChild1();
		c1.printParent();
	//c1. 레퍼런스 Parent(부모),child1(자식)에 있는 필드나 메서드 둘다 접근 가능
	//c1. 레러펀스 변수가 Parent에 있는 메소드에 접근시 자동으로 형변환된채 진행됨
	//즉 자식에서 부모클래스 자동형변환(업캐스팅)->작은것에서 큰것을 형변환 된것과 같은 이치
	
	//3. 부모타입 레퍼런스 변수로 자식 객체를 다루는 경우(다향성이 적용된 개념)
		System.out.println("3. 부모 타입 레퍼런스로 자식 객체를 다루는 경우(다향성 적용된 개념)");
		Parent p2=/*(Parent)*/ new Child1();
	/*
	 * 양쪽의 자료형이 다른데도 불구하고 오류 발생 안됨
	 * Parent 형으로 자동형반환 되기 때문
	 * 상속 구조에서는 클래스 형변환이 가능하다.
	 * 
	 */
		p2.printParent();//p2라는 레퍼런스 변수로는 Parent에만 접근이 가능
		((Child1)p2).printChild1();//단 자식객체로 접근하고싶을때 Child1형으로 접근하고싶을때 강제형변환으로 가능
		/*
		 * 클래스간에 형변환 가능(단, 상속구조일 경우에만)
		 * 1.UpCasting
		 * 자식타입->부모 형변환
		 * 생략가능(자동현변환개념)
		 * ex)자식객체 부모매서드();->((부모객체)자식객체).부모메서드()
		 * 부모변수=new자식객체
		 * 
		 * 
		 * 
		 * 2.DownCasting
		 * 
		 * 부모타입=>자식타입으로형변환
		 * 생략불가능(강제변환 해야함)
		 * ex((자식)부모).자식메서드();
		 * 
		 * 
		 * 다향성 쓰는 이유
		 * -부모타입으로부터 파생된 여러가지 타입의 자식객체들을 부모클래스 타입하나로 다룰수있음
		 * 
		 * 장점.
		 * 다향성을 배우기 전
		 * Child1 객체 2개
		 * Child2 객체 2개
		 * 객체 배열을 이용하기
		 * 
		 */
			Child1[] arr1=new Child1[2];
			arr1[0]=new Child1(1,2,3);
			arr1[1]=new Child1(4,5,6);
			Child2[] arr2=new Child2[2];
			arr2[0]=new Child2(5,5,5);
			arr2[1]=new Child2(7,7,7);
			//단, 다형성이 적용되면 부모타입의 레퍼런스 변수로 모든 자식 객체를 다 받아줄수 있다.
			System.out.println("=====다형성 접목한 객체 배열=====");
			Parent[] arr=new Parent[4];
			arr[0]=new Child1(1,2,3);
			arr[1]=new Child2(4,5,6);
			arr[2]=new Child1(8,8,8);
			arr[3]=new Child2(9,9,9);
			//하나의 부모타입으로 모든 자식 객체들을받을수 있음->편리 코드수 갑소, 생산성 증가
			((Child1)arr[0]).printChild1();
			((Child2)arr[1]).printChild2();
			((Child1)arr[2]).printChild1();
			((Child2)arr[3]).printChild2();
			
			System.out.println("====반복문 활용해서 실행====");
			for(int i=0; i<arr.length; i++) {
				//instanceof 연산자//반환값->true,false
				///현재 참조하고 있는 레퍼런스 변수가 실제로 어떤 클래스 (객체)타입을 참조하고 있는지 확인할때 사용
//				if(arr[i] instanceof Child1) {
//					((Child1)arr[i]).printChild1();
//				}
//				else {
//					((Child2)arr[i]).printChild2();
//				}
				//단 오버라이딩을 이용하면 궅이 형변환도 안해도됨.
				arr[i].print();
				/*
				 * 동적바인딩:프로그램 실행되기전에 자동으로 컴파일되면서 정적으로 현재 레퍼런스 변수의 메소드를 가리킴
				 * 단, 참조하고 있는 자식클래스에 해당 메소드가 오버라이딩 되어 있다면
				 * 프로그램을 시작핼대는 동적으로 그 자식클래스의 오버라이딩된 메소드를 찾아서 실행하게됨
				 * (ctrl누르고 돌어가보면 parent 클래스의 메소드를 실행한다고 했지만(정적바인딩)),
				 * 실제로 실행시에는 자식클래스의 오버라이딩된 메소드 실행됨;.(동적바인딩)
				 */
			}
	}

}
