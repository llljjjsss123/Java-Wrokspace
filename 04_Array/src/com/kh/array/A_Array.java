package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	/*
	 * 변수 : 하나의 공간에 하나의 값을 담을수 있음
	 * 		 예) int a = 10;
	 * 			a = 20;
	 * 
	 * 배열 : 하나의 공간에 여러개의 값을 담을수 있음.("같은 자료형의 값"으로만 담을수 있음.)
	 * 		  정확히 얘기하자면 배열의 각 인덱스 자리에 실제값이 담김(인덱스는 0부터 시작.)
	 * 		 예) int[] a = new int[3]; // int 형의 자료가 들어갈 수 있는 방을 3개 만든다
	 * 								  // 방 [0] [1] [2] 을 만든 것
	 *								  // 인덱스는 항상 0부터 시작한다. (중요)
	 *								  // 배열의 크기 = 3, 마지막 인덱스 = 2
	 *								  // 배열의 크기 = 5, 마지막 인덱스 = 4
	 *								  // 문자열의 길이 = 5, 마지막 인덱스 = 4
	 *								  // 항상 크기 = n, 마지막 인덱스 = n-1
	 * 			a[0] = 5;
	 * 			a[1] = 10;
	 * 			a[2] = 15;
	 */
	
	public void method1() {
		
		// 배열을 왜 써야 할까?
		// 변수만을 가지고 프로그래밍을 하게 되면..
		// 0, 1, 2, 3, 4 기록해야됨
		/*
		//변수로 이용하면 각각의 데이터를 보관하고자할때 각각의 변수를 만들어서 따로관리해야함.
			int num1 = 0;
			int num2 = 1;
			int num3 = 2;
			int num4 = 3;
			int num5 = 4;
			
			// 출력할 때는? => 일일이 출력해야 한다. 반복문 안됨
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
			
			for(int i = 1; i <= 5; i++) {
				// System.out.println(numi);
				System.out.println("num" + i);
			}
			
			// 총합계 => 일일이 더해줘야 한다. 반복문 안됨
			int sum = num1 + num2 + num3 + num4 + num5;
		*/
		
		// 만약 기록해야하는 변수의 갯수가 100, 1000, 10000개로 늘어난다면?
		
		// 배열을 가지고 프로그래밍 하기
		// 0, 1, 2, 3, 4 기록해야됨
		
		/*
		 * 1. 배열 선언
		 * [표현법] => 두 가지 표현법이 있다.
		 * 자료형 배열명 [];
		 * 자료형[] 배열명;
		 */
		// int a; // 변수 선언
		// int arr[]; // 배열 선언
		// int[] arr;
		
		/*
		 * 2. 배열 할당 
		 * 이 배열에 몇개의 값들을 보관할건지 배열의 크기를 지정해주는 과정
		 * 지정한 갯수만큼 값이 들어갈 방이 만들어짐
		 * [표현법]
		 * 배열명 = new 자료형[배열크기];
		 */
		// arr = new int[5];
		
		// 배열 선언과 동시에 할당
		int[] arr = new int[5];
		//그림으로 설명
		/*
		 * 3. 배열의 각 인덱스(=방번호) 자리에 값 대입
		 * [표현법]
		 * 배열명[인덱스] = 값;
		 */
		/*
			arr[0] = 0;
			arr[1] = 1;
			arr[2] = 2;
			arr[3] = 3;
			arr[4] = 4;
		*/
		
		// 배열의 가장 큰 장점 : 반복문을 활용할 수 있다.
		for(int i = 0; i < 5; i++) {
			arr[i] = i;
		}
		
		// 배열의 출력 => 출력 또한 반복문 활용이 가능하다.
		/*
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			System.out.println(arr[4]);
		*/
		//배열은 포문을 활용해 값을입력, 값을 출력할수 있다!!
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d번 인덱스의 값 : %d \n", i, arr[i]);
		}
		// 각각의 인덱스값을 확인하기 위해서는 []불럭을 꼭 사용해야함.
		// 그럼 arr에 전체담겨있는거 확인하고 싶다면? 
		// arr만 출력하면 되지 않을까?
		System.out.println(arr); // 실제 arr이라는 값에는 주소값이라는게 담겨있음. 메모리상에 어떻게 존재하는지 알아보자.
		// [I@57829d67 와 같은 알 수 없는 값이 나온다
		//주소값이라는 개념만숙지하면 자바를 이해하는데 조금더 수월해짐.
	}
	
	public void method2() {
		//(메모리그림셋팅)

		int i = 10; // 일반변수. i라는 박스에 10이라는 값이 그냥 담겨있음.
		//stack , heap , static
		//변수(박스) i박스안에 10이라는값이 담겨있음.
		// static은 지금당장 다루지않음. 객체에서다룰것.
		
		int[] iArr = new int[5];
		//배열 자료형임.
		//우선 대입연산자기준ㅇ 왼쪽먼저 실행되므로 .iArr이라는 박스가 먼저 만들어짐. 즉 스택영역에 만들어짐.
		// 그다음 int[5]짜리 방이 만들어질것. 이건 heap이라는 영역에 만들어짐
		// new키워드가 붙은애들은 항상 heap이라는 영역에 만들어짐!!
		// 5칸짜리 방이 만들어짐. 그후 그 방의 "주소지"를 부여해줌. ex(0x123) 
		// 각 방은 0부터 ~4까지 방번호도 있음.
		// 마지막으로 대입연산자가 실행이 되면 arr방의 주소값이 arr[]박스에 저장됨!
		
		//우리는 요 주소지를 "참조"해서 arr[5]를 찾아가는것.
		// 이 주소값의 개념을 꼭 기억해두자!
		
		System.out.println("i : " + i);
		System.out.println("iArr : " + iArr);
		System.out.println("iArr의 해시코드값 : " + iArr.hashCode());
		// 해시코드 : 주소값을 십진수의 형태로
		
		double[] dArr = new double[3]; //0x234
		System.out.println("dArr : " + dArr);
		System.out.println("dArr의 해시코드값 : " + dArr.hashCode());
		
		/*
		 * 기본자료형 (boolean, char, byte, short, int, long, float, double)
		 * => 실제 값(리터럴)을 바로 담을 수 있는 변수 => 일반 변수
		 * 
		 * 그 외 자료형 (int[], double[], short[], ..., String, Scanner, ...)
		 * => 주소 값을 담고 있는 변수 => 참조 변수(레퍼런스 변수)
		 * String은 특이한녀석!
		 */
	}
	
	public void method3() {
		
		int[] iArr = new int[3]; // 0번, 1번, 2번
		double[] dArr = new double[3];  // 0번, 1번, 2번
		//배열선언후 크기만 지정한 상태.
		//그럼 각각의 인덱스는 초기화 되어있나?

		for(int i = 0; i<3;i++){
			System.out.println(iArr[i]);
		}
		for(int i = 0; i<3;i++){
			System.out.println(dArr[i]);
		}
		//내가 각 인덱스 초기화 하지 않았는데도 값들이 담겨있음. 왜?
		//heap라는 영역에는 절대 빈공간이 존재할수 없기 때문.
		//따라서 jvm이 각 공간에 기본값으로라도 초기화(대입)를 시켜줌.!

		// 배열의 크기를 아는 방법
		System.out.println("iArr 배열의 크기 : " + iArr.length);
		System.out.println("dArr 배열의 크기 : " + dArr.length);
		
		for(int i = 0; i < iArr.length; i++) {
			
			System.out.println(iArr[i]);
		}
		
		for(int i = 0; i < dArr.length; i++) {
			
			System.out.println(dArr[i]);
		}
		
	}
	
	public void method4() {
		
		int[] arr = new int[5];
		/*
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		*/
		// arr[10] = 10; 
		// ArrayIndexOutOfBoundsException: 10
		// 배열의 인덱스 범위를 벗어남
		// 10번 인덱스에서 오류가 발생
	
		// 값 대입을 위한 for문
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println(arr); // 해당 배열의 주소값 : 배열의자료형+@+16진수.
		System.out.println(arr.hashCode()); // 해시코드 : 주소값의 10진수 형태
	}
	
	public void method5() {

		int result = 0; //int형 자료 기본값 0

		int []arr = null;// 주소값을 담는 변수의 기본값은 null임.
		
		System.out.println(arr);//null

		/*
		 * 기본값이 null 변수를 가지고 메소드를 호출한다거나 특정 어딘가에 접근하고자한다면
		 * 무조건 오류 발생 => NullPointerException
		 * ex)arr.hashcode()
		 *    arr.length	
		 */
	}
	
	public void method6() {
		
		int[] arr = new int[5];
		
		// 직접 해보기!		
		/*
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		*/
		
		// 대입

		int value = 2;
		for(int i = 0; i < arr.length; i++) {
			// arr[i] = (i + 1) * 2;
			arr[i] = value;
			value += 2;
		}
		
		// 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
		// arr[5] = 12;
		// arr[6] = 14;
		// arrayoutofinexException -> 배열에 부적절한 인덱스 제시시 발생.(범위에서 벗어난 인덱스)
		/*
		 * 배열의 가장 큰 단점
		 * 한번 지정한 배열의 크기는 변경 불가
		 * => 배열의 크기를 변경하고자 한다면 어쩔 수 없이 새로운 배열을 다시 만들어야 한다.
		 */
		
		arr = new int[7];
		
		System.out.println("===== arr 변경 후 =====");
		System.out.println(arr);
		System.out.println("arr의 해시코드 값 : " + arr.hashCode());
		/*
		 * 항상 고유한 주소값 부여, 기존에 생성 되었던 주소와 절대 겹치지 않는다.
		 * 기존에 참조하고 있던 연결이 끊기고 새로운 곳 참조
		 * 연결이 끊어진 기존의 배열은 Heap 영역에 둥둥 떠다님
		 * 일정 시간이 지나면 "가비지 컬렉터(GC)" 가  삭제 시켜준다 : 자동 메모리 관리
		 * => 자바에서 "자동메모리관리" 특징. 개발자가 코드에만 신경쓸수 있게 해줌.
		 */
		
		// 현재 연결되어있는 고리를 끊고자 한다면?
		arr = null; // null : 아무것도 존재하지 않음을 의미
		
		System.out.println(arr); // null 출력
		
	}
	public void method7() {
		
		// 배열 선언과 동시에 할당 (크기 지정)
		int[] arr = new int[4];
		// 각 인덱스에 값 초기화 (대입)
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		// 배열 선언 및 할당과 동시에 초기화(대입) 까지 한번에 끝내는 방법 2가지
		// 방법 1.
		int[] arr1 = new int[] {1, 2, 3, 4};
		// 방법 2.
		int[] arr2 = {1, 2, 3, 4};
		
		// 배열 비교
		System.out.println(arr1 == arr2); // false 왜?
		// 주소값 간의 동등비교이기 때문에 false 가 나옴
	}
	public void method81(){
		//1.크기 10짜리 정수배열 선언.
		//2. 반복문 활용해서 0번인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 값대입
		//   매번 발생하는 랜덤값(1~100)
		//3. 반복문활용해서 0번 인덱스 ~ 마지막인덱스까지 배열에 담긴갑 출력
		//출력예시) arr[x] : xx 
		int arr [] = new int[10];

		for(int i =0;i<10;i++){
			arr[i] = (int)(Math.random() * 100 +1);
		}
		for(int i=0;i<10;i++){
			System.out.printf("arr[%d] : %d", i,arr[i]);
		}
	}
	public void method82(){
		//1. 사용자에게 매번 키의 정보를 입력받은후 해당크기만큼 문자열배열 생성.
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();

		String [] arr = new String[size];
		//2. 반복문을 활요해서 매번 사용자에게 과일명을 입력받아 그 값을 매 인덱스자리에 대입
		sc.nextLine();
		for(int i =0; i<arr.length;i++){
			System.out.print("좋아하는 과일 입력 : ");
			arr[i] = sc.nextLine();
		}

		for(int i =0; i<arr.length;i++){
		
			System.out.println(arr[i]);
		}
}
	
	public void method9() {
		
		// 사용자에게 문자열 하나 입력받은 후
		// 각각의 문자들을 char 배열에 옮겨 담기
		
		// 1. 사용자에게 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 하나 입력 : ");
		String str = sc.nextLine();
		
		// 2. char 배열 생성해두기 (배열 크기 == 문자열의 길이만큼)
		char[] arr = new char[str.length()];
		
		// 3. 문자열에서 각 인덱스별 문자를 뽑아서 char 배열의 각 인덱스에 담기
		/*
		 * arr[0] = str.charAt(0);
		 * arr[1] = str.charAt(1);
		 * ...
		 */
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		// 4. char 배열의 각 인덱스에 잘 담겨있는지 출력해보기
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public void method10(){
		//1. 사용자에게 배열의 길이 입력받은후 해당 크기만큼 정수배열 생성.
		//2. 반복문 활용해서 0번인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 값대입
		//   매번 발생하는 랜덤값(1~100)
		//3. 반복문활용해서 0번 인덱스 ~ 마지막인덱스까지 배열에 담긴갑 출력과 동시에 해당인덱스에 담긴 값이 짝수인
		// 값들의 총합 구하기. 
		// 위해서 구한 짝수갑 출력.

		//출력예시) arr[x] : xx 
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr [] = new int[size];
		int sum = 0;
		for(int i =0;i<size;i++){
			arr[i] = (int)(Math.random() * 100 +1);
		}
		for(int i=0;i<size;i++){
			System.out.printf("arr[%d] : %d", i,arr[i]);
			if(arr[i] %2 == 0){
				sum += arr[i];
			}
		}
		System.out.println("총합 : "+sum);
	}
	//스캐너 + 배열 + 반복문 실습.	
	public void method83() {

		Scanner sc = new Scanner(System.in);
		
		double[] heights = new double[3];
		
		for(int i = 0; i < heights.length; i++) {
			System.out.print("키 입력(cm) : ");
			heights[i] = sc.nextDouble();
		}
		
		// 3명의 키 정보 출력
		double sum = 0.0;
		for(int i = 0; i < heights.length; i++) {
			System.out.println(heights[i]);
			sum += heights[i];
		}
		
		// 3명의 키의 총 합계, 평균 출력
		// 평균 구하기 = 총 합 / 갯수
		System.out.println("3명의 키의 총 합계 : " + sum);
		// System.out.println("3명의 키의 평균 : " + sum / heights.length);
		System.out.printf("3명의 키의 평균 : %.1f", sum / heights.length);
	}	
	
	}