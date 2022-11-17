package com.kh.parctice.array;

import java.util.Scanner;

public class ArrayPractice {
	Scanner sc=new Scanner(System.in);
	public void practice1() {
		int[] arr=new int[10];
		for(int index=0; index<arr.length; index++) {
			arr[index]=index+1;
			System.out.print(arr[index]+" ");
		}
	}
	public void method2() {
		int[] arr=new int[10];
		for(int i=0;i<arr.length; i++) {//10 9 8 7 6 ...
			arr[i]=10-i;
			System.out.print(arr[i]+" ");
		}
		}
	public void method3() {
		//1.사용자에게 양의 정수 입력 받기
		System.out.println("양의 정수 입력");
		int size=sc.nextInt();
		//2.사용자에게 입력받은 정수만큼의 길이를 가진 배열의 생성
		int[] arr=new int[size];
		//3.1부터 size까지의 값을 배열에 초기화(대입하기)
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		///4.출력 하기
	}
	public void method4() {
		String[] arr=new String[5];
		arr[0]="사과";
		arr[1]="귤";
		arr[2]="포도";
		arr[3]="복숭아";
		arr[4]="참외";
		System.out.println(arr[1]);
	}
	public void method5() {
		//문자열,문자 사용자에게 입력받기
		System.out.println("문자열: ");
		String str=sc.nextLine();
		System.out.print("문자: ");
		char ch=sc.nextLine().charAt(0);
		//2.문자열의 문자를 하나하나 배열에다가 담기
		char[] arr=new char[str.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] =str.charAt(i);
		}
		int count=0;
		String index="";//4 8
		//3.검색할 문자가 문자열에 몇번 몇개있는지,어느 인덱스에 있는지
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==ch) {
				//갯수증가
				index+=i+" ";
				count++;
			}
		}
		//4.출력문
		System.out.printf("%s에 %c가 존재하는 위치(인덱스):%s \n",str,ch,index);
		System.out.printf("%c의  개수%d",ch, count);

	}
	public void method6() {
		///1.월 화 수 목 금 토 일로 초기화 된 문자열 배열 만들기
		String[] days= {"월,화,수,목,금,토,일"};
		//2.사용자에게 숫자를 입력받기
		System.out.print("0부터 6사이의 숫자를 입력하세요:");
		int num=sc.nextInt();
		
		if(num>=0 && num<=6) {
			System.out.println(days[num]+"요일");
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
	public void method7() {
		System.out.print("정수는 : ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		for(int i=0; i<arr.length; i++) {
			System.out.printf("배열 %d번쩨 인데스에 넣을값: ",i);
			sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			System.out.println(arr[i]+" ");
		}
		System.out.println("\n총 합:"+sum);
	}
	public void method8() {
		System.out.print("정수: ");
		int size=sc.nextInt();
		
		if(size<3 || size % 2==0) {
			System.out.println("다시 입력하세요");
			method8();
		}
		else {
			int[] arr= new int[size];//5->2
			//7->3    0,1,2,3,4,5,6
			//9->4    0,1,2,3,4,5,6,7,8
			for(int index=0; index<=size/2; index++) {
				arr[index]=1+index;
			}
			int value=1;
			for(int index=size/2+1; index<arr.length; index++) {
				arr[index]=size/2+1- value;
				value++;
			}
			for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+(i==arr.length-1?"":","));
			//0,1,2->1,2,3
			//3,4->2,1
			}
			
		}
	}
		public void method9() {
			String[] menu= {"양념","후라이드","고추바사삭","레드콤보"};
	     	System.out.print("치킨이름을 입력하세요:");
	     	String chiken=sc.nextLine();
	     	
	     	for(int i=0; i<menu.length; i++) {
	     		if(menu[i].equals(chiken)) {
	     			System.out.println(chiken+"치킨 배달 가능");
	     			return;
	     		}
	     		System.out.println(chiken+"치킨은 없는 치킨입니다.");

	     	}
		}
}
