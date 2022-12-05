package com.kh.chap02_set.part01_hashSet.run;

import java.util.HashSet;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		HashSet<String> hs1=new HashSet();
		//값 추가: add(추가할 값)
		hs1.add(new String("반갑습니다"));
		hs1.add(new String("반갑습니다"));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		
		System.out.println(hs1);//중복값 저장x, 저장 순서 유지x
		//크기구하기: size()
		System.out.println("hs1의 크기는?"+hs1.size());
		//값 삭제:remove(삭제할값)
		hs1.remove("여러분");
		System.out.println(hs1);
		//모든 값 삭제:clear();
		hs1.clear();
		System.out.println(hs1);
		
		System.out.println("--------------------------------------------------------------------");
		
		HashSet<Student> hs2=new HashSet();
		hs2.add(new Student("민경민",31,100));
		hs2.add(new Student("홍길동",41,90));
		hs2.add(new Student("김갑생",21,80));
		hs2.add(new Student("민경민",31,100));
		
		System.out.println(hs2);
		//저장순서 유지x 중복저장o->동일객체 판단x
		//값이 추가될때 equals(), hashCode()로 비교 후 둘다 결과가 true면 동일객체로 판단
		
		//hashSet에 객체를 담을때 내부적으로 equals()로 비교+hashCode()값이 일치하는지도 비교
		//equals() 한 결과가 true이고 hashCode값이 일치하면=>동일객체로 판단
		
		//Object클래스에 있는 equals():두 객체의 주소값을 가지고 비교해서 일치면true/일치하지 않으면 false
		//Object클래스에 있는 hashCode:두 객체의 주소값을 가지고 기반으로해서 해시코드값을 만들어서 변환하여 비교
		
		//만약 위 2개의 메서드를 내가 원하는 형대로 바꿔서 중복저장이 안되게 하고 싶다면 오버라이딩을 해줘야함
		
		//Student 클래스에 equals()오버라이딩: 새 필드값(name, age, score)이 일치하면  true, 아니면 false
		//Student 클래스에 equals()오버라이딩: 새 필드값 기반으로 해서 해시코드값을 만들어서 반환.
		System.out.println("------------------------------------------------------------------");
		//3.hashSet클래스에서 제공하는 Iterator 사용
		//Iterator<Student> it=hs2.iterator();
		//while
	}

}
