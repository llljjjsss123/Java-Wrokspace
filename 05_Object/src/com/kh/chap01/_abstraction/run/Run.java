package com.kh.chap01._abstraction.run;

import com.kh.chap01._abstraction.model.vo.Student;

public class Run {

	
		// TODO Auto-generated method stub
		//추상화과정
		/*
		 *1. 내가 구현하고자 하는 프로그램에서 필요한 객체들을 생각해볼것ex)학생프로그램 관리 학생객체: 홍길동 학생, 민경민 학생
		 *2. 그 객체들이 가지고 있는 공통적인 속성,기능들을 모두 추출할것 ex)이름 나이 성별 주소 키 등등
		 *3. 그렇게 추려진 속성들을 가지고 내가 구현한 프로그램의 실질적인 목적에 맞춰서 불필요한 속성과 기능들을 제거
		 *4. 최종적으로 추려진 속성 기능을 가지고 어떤 자료형 어떤 이름으로 사용할 것인지 생각
		 *
		 *예)학생관련 프로그램
		 *     1.학생관련객체(홍길동 학생, 민경민학생,김갑생학생, 등등)
		 *	   2.공통적인 속성 및 기능들(이름, 나이, 성별, 주소, 전화번호, 키, 달리기 속도, 학년, 반,국어점수,영어점수,몸무게,자기,머기,생각하기,달리기 )
		 * 	   3.만약 학생 인적사항을 관리하는 프로그램이라면 : 이름 나이 성별 주소 전화번호 학년 반만 추려낸다
		 * 	     만약 학생 성적을 관리하는 프로그램이라면 :이름 학년 반 국어점수 수학점수만 추력낸다
		 *       만약 학생 건강을 관리하는 프로그램이라면 :이름 키 학년 반 몸무게 먹기
		 *		 최종적으로 추려낸것: 이름 나이 키 라는 가정하에
		 *		 4.이름Stirng name;
		 *		    나이 int age;
		 *			키 double height;
		 *
		 *위의 선정된 것들을가지고 본격적인 프로그래밍을 할것.
		 *			1.변수만을 가지고 프로그래밍을 하게 된다면?
		 *			변수:하나의 지료형으로 하나의 값만 보관할수 있음
		 *			홍길동이라는 학생객체를 만들기 위해서->Stirng name1="홍길동",int age1=20; double height=168.7;
		 *   		민경민이라는 학생객체를 만들기 위해서->Stirng name2="홍길동",int age2=30; double height=188.8;
		 *			String name3...
		 *			관라하고자하는 학생들이 늘어나면 늘어날수록 생성해야할 갯구도 엄청나게 증가하게됨. 즉 관리하기가 굉장히 힘듬.
		 *
		 *
		 *  		2.배열을 이용해서 프로그래밍을 하게 된다면?
		 *			배열:하나의 자료형인 여러개의 값들으 보관할수 있음.(단, 동일자료형일시)
		 *			학생들 이름을 보관하는 배열 선언:String[]name={"홍길돌","민경민","김갑생"}
		 *			학생들 나이을 보관하는 배열 선언:int [] age={20,30,40};
		 *			학생들 키를 보관하는 배열 선언:double[] hight={123.1,123.5,144.6}
		 *			
		 *
		 *			변수를 사용하는 것보다 나아보임	
		 *			하지만 관리하는 학생중 한명이 전학을 가게되는 경우 해당 인데스에있는 모든 키, 나이에 대한정보도 제거를 해줘야함
		 *			그리고 새로운 학생이 들어오게 되는경우 배열의 특성상 한번 크기를 지정하게되면 변견하는게 불가능하므로, 새로운
		 *			정보를 입력하기위해 배열을 복사해서 새롭게 추가해야함. 즉, 유지보수가 힘듬
		 *			
		 *
		 *			3.클래스(구조체)를가지고 프로그래밍한다면
		 *			구조체: 한번에 여러개의 자료형을 보간할수 있는 배열 같은 형태
		 *				String값도 보관하고, int 값도 보관하고, double값도 보관할수있는 나마의 자료형을 만들수 있음
		 *			클래스: 각 객체들의 속성 정보들을 담아내는 그릇과도 같은 존내. 보통vo패키지 안에 보관한다.
		 *			public class student{
		 *			 String name="민경민"
		 *			int age=30;
		 *			double height=188.8;
		 *			}
		 *			
		 *
		 *
		 *
		 *
		 *
		 *		
		 *
		
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *	
		 */
		
		
		//student 클래스 생성해보기
	public static void main(String[] args) {
		//1.student클래스 만들고 나서 객체 생성.
		//홍길동 학생 색체 만들기
		Student hong=new Student();//객체 생성(메모리영역에 객체의 공간이 할당됨)
		//직접적으로 값을 대입
		hong.name="홍길동";
		hong.age=20;
		hong.heigth=166.7;//필드 접근하고자한다면 .을 통해 가져올수 있음 단. 접근자가 public인 경우
		
		//민경민 학생 객체 만들기
		Student min=new Student();
		min.name="민경민";
		min.age=21;
		min.heigth=176;
		
		System.out.println(hong);
		System.out.println(min);
				
		//xxx님의 나이는 xx살이고, 키는 xx.xcm입니다.
		System.out.println(hong.name+"님의 나이는"+hong.age+"살이고, 키는"+hong.heigth+"입니다.");
		System.out.printf("%s님의 나이는 %d살이고 키는 %.1f입니다.",min.name, min.age,min.heigth);
		/*
		 * 필드 public으로 작성시
		 * => 직접적으로 접근해서 값 대입 및 조히 할 경우 보안 문제가 생길 수 있다.
		 * 외부에서 함부러 값을 변질시키거나 죄회권한이 없는 사람이 값을 쉽게 가져올수 있는 문제발생
		 * ->캡슐화로 해결.
		 * 객체지향의 설계원칙중 아나가 바로 정보은닉이며 그 기술 중 하나가 캡슐화
		 * 
		 * 
		 * 
		 * 
		 */
	}
	
	
	

}