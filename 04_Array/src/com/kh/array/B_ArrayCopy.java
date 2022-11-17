package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	/*
	 * 
	 * 배열 복사
	 * -얕은 복사: 배열의 주소값만 복사
	 * 
	 * -깊은 복사: 동일한 새로운 배열을 하나더 만들어서 실제 내부값들을 복사
	 * 
	 * 
	 */
	//배열복사
	public void method1() {
		//원본배열
		int[] origin= {1,2,3,4,5};//복사하기
		System.out.println("==원복 배열 출력==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
		//단순하게 origin을 다시 copy본 배열에 대입. 주소값 대입
		int[] copy=origin;
		System.out.println("\n==카피본 출력==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		copy[2]=99;
		System.out.println("\n복사본 배열 수정후==");
		//복사본 배열만 가지고 수정을 했는데도 원본 배열도 함께 수정된다
		//이유는 얕은 복사가 이룽 졌기 대문->배열의 주소값이 복사되어
		//원본과 복사본은 사실상 동일한 데이터를 공유하고있다
		System.out.println("\n원본 배열 해시코드"+origin.hashCode());
		System.out.println("복사본 해시코드"+copy.hashCode());
	}
		//깊은복사
		public void method2(){
			//for문 방법
			//새로운 배열 생성 내부값 일일이 대입
			int[] origin = {1,2,3,4,5};
			 
			int[] copy=new int[origin.length];
			
			for(int i=0; i<copy.length; i++) {
				copy[i]=origin[i];
			}
			//복사가 잘 이루어졌는지 출력
			for(int i=0; i<copy.length; i++) {
				System.out.println(copy[i]);
			}
			
			copy[2]=99;
			System.out.println("\n복사본 배열 수정후==");
			System.out.println("\n원본 배열 해시코드"+origin.hashCode());
			System.out.println("복사본 해시코드"+copy.hashCode());
		}
	
		//자바에세 제공하는 댜양한 메서드 사용해서 배열 복사
		public void method3() {
			//2.새로운 배열을 생성한 후 Systpem 클래스에서 Arraycopy메서드를 이용
			 int [] origin= {1,2,3,4,5};
			 
			 int [] copy = new int[10];
			 
			 //Syetem.arraycopy(원본배열명, 원본배열의 복삿를 시작할 인덱스, 복사본 배열명, 복사본 배열의
			 //복사될 시작 인텍스, 복사할 갯수)
			// System.arraycopy(origin, 0 , copy, 0, 5);//1 2 3 4 5 0 0 0 0 0
			// System.arraycopy(origin, 0, copy,2,5);
			 //0 0 1 2 3 4 5 0 0 0
			// System.arraycopy(origin, 2 , copy, 1 ,3);
			 //0 3 4 5 0 0 0 0 0 0
			 System.arraycopy(origin, 2, copy, 9, 2);
			 //0 0 0 0 0 0 0 0 0 3 4
			 //인덱스 범위를 벗어난 복사는 불가능함.
			 for(int i=0; i<copy.length; i++) {
				 System.out.print(copy[i]+" ");
			 }
			 
			
			
		}
			public void method4() {
				//3.Arrays클래스에서 제공하는 copyOf 메소드를 이용한복사
				int [] origin= {1,2,3,4,5};
				
				//복사본 배열=Array.copyOf(원복 배열명,복사할 갯수)
				int[] copy=Arrays.copyOf(origin,7 );//copy배열의 크기==복사할 갯수
				
				for(int i=0; i<copy.length; i++) {
					System.out.print(copy[i]+" ");
					
				}
				/*
				 * 2.System.arraycopy메소드:몇번 인데스부터 몇개를 어느 위치의 인ㄷ게스에
				 * 복사할 것인지 세밀하게 지정가능
				 * 
				 * 3.Arrays.dopyOf메소드: 무조건 원본 배열의 0번 인덱스 부터 내가 제시한
				 * 갯수만큼 복사 진행됨. 제시한 길이가 원본보다 커보 0값으로 채워서 복사
				 * 
				 */
			}
			public void method5() {
				///4.clone메소드 사용
				int[] origin= {1,2,3,4,5};
				
				//복사본 배열=원본배열.clone();
				int [] copy=origin.clone();//인덱스 직접수정x, 복사할 갯수 지정
				//무조건 원본배열과 동일한 녀석 반환됨.
				System.out.println(Arrays.toString(origin));
				System.out.println(Arrays.toString(copy));
				/*
				 * Arrays.toString(배열)
				 * ->앞과 뒤에[] ,각 값마다 ,를 넣어서 하나의 문자열로 출력해주는 메서드
				 */
				System.out.println("원본 배열의 해시코드:"+origin.hashCode());
				System.out.println("복사본 배열의 해시코드:"+copy.hashCode());
			}
}
