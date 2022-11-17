package com.kh.chp_encapulation.run;

import com.kh.chp_encapulation.model.vo.Student;

public class Run {
	/*
	 * 7.캡슐화 과정을 통해 완벽한 클래스의 틀을 갖추게하기
	 * 캘슐화란? 추상화를 통해 정의된 속성들과 기능들을 하나로 관리하는 기법중 하나로
	 * 클래스에서의 가장 중요한 목적인 데이터의 접근제한을 원칙으로
	 * 외부로부터 데이터의 접근을 막고
	 * 대신에 테이터를 간접적으로나마 처리할수 있는 메소드를 클래스내부에 작성해서 관리하는 방식
	 * 캡슐화 하지 않으면 :외부로부터 직접접근이 가능하기때문에 함부로 값이 변질되거나 조화를 막지 못하는 문제 발생
	 * 
	 * 정보은닉:private
	 * 필드들을 외부로부터 직접저급을 막기위해 public대신에 private접근 제한자사용
	 * 학생들이 본인의 성적을 함부로 바꿀수 없게, 다른 학생의 성적이 함부로 조화되지 않도록
	 * setter/getter메소드
	 * 간접적으로 접근해서 값을 담거나, 그값을 가져올수 있는 메소드가 setter/getter메소드
	 * 선생님은 학생의 성적을 기록하거나 조회권한
	 *  
	 *  
	 *  
	 *  
	 *  
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student();
	//	hong.name="홍길동";//the field Student.anme is not visible
	//	hong.age;
	//	hong.height=166.6;
		/*
		 * 
		 * 위와같이 대입할 경우 직접 접근이 불가능해짐
		 * 그러면 접근을 막은 경우 간접적으로나마 접근할수있는 방법
		 * setter/getter
		 * 
		 * 
		 * 
		 * 
		 */
		//setter메서드 호출
		hong.setnameHi("홍길동");
		hong.setAge(20);
		hong.setHeight(168.7);
		
		System.out.println(hong.information());
		
		
		
	}

}
