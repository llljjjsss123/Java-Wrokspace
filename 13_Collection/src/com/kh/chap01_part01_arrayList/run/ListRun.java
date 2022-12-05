package com.kh.chap01_part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_part01_arrayList.moderl.vo.Music;

public class ListRun {

	public static void main(String[] args) {
		/*
		 * 컬렉션
		 * 자료구조가 내장되어 있는 클래스로 자바에세 제공하는 "자료구조"를 담당하는 프레임워크
		 * 
		 * 자료구조
		 * 방대한 데이터들을 효율적으로(구조적으로)다룰때 필요한 개념
		 * 
		 * 프레임워크 효율족안 기능들이 이미 정의되어 있는 틀(프레임)
		 * 
		 * 정리
		 * 데이터들이 새로이 추가되거나, 삭제되거나, 수정이 되는 기능(알고리즘) 들이 이미 정의 되어있는 틀이 있다
		 * ==컬렉션
		 * =>다량의 데이터들을 관리하고자 할때 배열 가지고 충분히 사용했엇음 ,단 배열의 단점들을 보완한 것이 컬렉션
		 * 
		 * -배열의 단점
		 * 1.배열을 쓰고자 할때 먼저 크기를 지정해야함
		 * =>한번지정된 크기는 변경이 불가
		 * 새로운값을 추가 하고자 할때 크기가 오버될 경우 새로운 크기의 배열을 만들고 기존의 내용들을 복사해주는 
		 * 코드를 직접구현해야됨
		 * 2. 배열 중간 위치에 새로운 데이터를 추가하거나 삭제해야 하는 경우 기존의 값들을 
		 * 땡겨주는 코드를  직접생성해야함
		 * 3.한 타입의 데이터들만 저장가능
		 * 
		 * 컬렉션의 장점
		 * 1.크기에 제약x
		 * 2.중간에 값 추가 삭제해도 메소드가 이미 저장되어있음
		 * 3.여러탑이데에터 저장가능
		 * 
		 * 
		 * 방대한 데이터들을 단지 담아만 두고 조회만 할 목적=>배열
		 * 방대한 데이터들을 ㅂ빈번하게 추가,삭제,수정 해야함=>컬렉션
		 * 
		 * 컬렉션의 3가지 분류
		 * List계열=>담고자 하는값만 저장/ 값 저장시 순서유지됨(index의개념이 있음)/중복값 허용
		 * ex)ArrayList,Vector,LinkedList=>ArrayList가 제일 많이 쓰임(90퍼)
		 * 
		 * set계열 : 담고자하는 값만 저장 값 저장시 순서 유지 x(index개념이 없음)/중복값허용x
		 * 
		 * map계열: 키(key) +담고자하는 값세트로 저장 값저장시 순서유지x(index개념없음)
		 * key중복허용x ->hashMap, Properties
		 * )
		 */
		 ArrayList<Music> list=new ArrayList<>(3);//내부적으로 크기 10짜리인 배열이 생성됨.
		 System.out.println(list);
		 /*
		  * 재네릭(<E-->element)
		  * 별도의 재네릭 제시 없이 컬렉션 객체를 생성하게 되면
		  * 해당컬렉션에 다양한 타입의 데이터 값들이 담길수 있음.(Default R==Object)
		  * 
		  * 별도의 제네릭 설정으로 <Music>으로 하게되면 (E==Music)
		  * 
		  * 제네릭 설정 이유
		  * 1.명시한 타입의 객체만 저장 가능하도록 타입의 제한을 두기 위해
		  * 2.컬렉션 저장된 객체를 꺼내서 사용할때 매번 형변환 하는 절차를 없애기 위해
		  */
		  //1. add(E e):해당 리스트의 끝에 전달된 e를 추가시켜주는 메소드.
		 	list.add(new Music("Cookie","new jeans"));
		 	list.add(new Music("hype boy","new jeans"));
		 	list.add(new Music("die for you","the weekends"));
		 	//list.add("흐흐");
		 	/*
		 	 * 순서가 유지 되면서 값 추가됨.
		 	 * 각 index에 담겨있음.
		 	 * 크기에 제약이 없다.
		 	 * 다양한 타입의 값 추가 가능
		 	 */
		 	System.out.println(list);
		 	//2.add(int index, E e): 리스트에 전달되는 index 값 위치에 전달되는 e를 추가시켜주는 메소드
		 	list.add(1, new Music("바다의 왕자","박명수"));
		 	System.out.println(list);
		 	//중간에 값 추가시 알아서 기존의 값들을 뒤로 땡겨주는 작업이 내부적으로 진행됨
		 	
		 	//3.set(int index,E e):리스트에 원하는 위치의 인데스값을 제시하면 전달하는 e값으로 변경해주는 메소드
		 	list.set(0, new Music("피 땀 눈물","BTS"));
		 	System.out.println(list);
		 	
		 	//4. remove(int index):리스트에서 해당 인덱스 위치에 있는 값을 삭제시켜주는 메소드
		 	list.remove(1);
		 	System.out.println(list);
		 	//5. size():리스트에 담겨있는 데이터의 수를 반환해주는 메소드
		 	System.out.println("리스트의 담긴 데이터수: "+list.size());
		 	System.out.println("리스트의 마지막 인덱스:"+(list.size()-1));
		 	
		 	//6.get(int index) :E=>리스트에 해당 index위치의 데이터를 반환해주는 메소드
		 	//제네릭 설정전
//		 	Music m= (Music)list.get(0);
//		 	System.out.println(m.getTitle());
		 	Music m=list.get(0);
		 	System.out.println(m);
		 	System.out.println(m.getTitle());
		 	System.out.println(list.get(1).getTitle());
		 	
		 	//0번~마지막 인덱스까지 데이터 출력
		 	//for문
		 	for(int i=0; i<list.size(); i++) {
		 		System.out.println(list.get(i));
		 	}
		 	//for each문:향상된 반복문
		 	//for(값을 담아줄 변수:순차적으로 접근할 배열, 컬렉션)
		 	for(Music o : list ) {
		 		System.out.println(o);
		 	}
		 	System.out.println("================================================================");
		 	//7.sublist(int index1, int index2:해당 리스트로부터 index1번에서 index2까지의 데이터 값들을 추출)
		 	//해서 새로운 List로 변환시켜주는 메소드
		 	
		 	List<Music> sub=list.subList(0,2);//0<=인덱스범위<2
		 	System.out.println(sub);
			System.out.println("================================================================");
		 	//8.addAll(Collection c):해당 리스트에 다른 컬렉션에 있는 데이터들을 통채로 추가해주는 메소드
		 	list.addAll(sub);
		 	System.out.println(list);
			System.out.println("================================================================");
			
			//9.isEmpty():해당리스트가 비어있는지 묻는 메소드(비어있으면 true 아니면 false반환)
			System.out.println("리스트가 비어있습니까?"+list.isEmpty());
			
			//10.clear():해당 리스트를 비워주는 메소드
			list.clear();
			System.out.println(list);
			System.out.println("리스트가 비어있습니까?"+list.isEmpty());
	}

}
