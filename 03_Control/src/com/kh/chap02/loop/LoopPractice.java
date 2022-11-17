package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
    Scanner sc=new Scanner(System.in);
    public void practice1() {
    	System.out.println("첫번째 수:");
    	int num1=sc.nextInt();
    	
    	System.out.println("두번째 수:");
    	int num2=sc.nextInt();
    	
    	if(num1 <1 || num2<1) {
    		System.out.println("1 이상의 숫자를 입력해주세요.");
    		practice1();
    	}
    	else {
    		if(num1 <= num2) {
    			for(int i= num1; i<=num2; i++) {
        			System.out.print(i+" ");
    			}
    			}else {
    				for(int i= num2; i<=num1; i++) {
    	    			System.out.print(i+" ");
    	    		}
}
    	}
}
    public void practice2() {
    	System.out.println("시작 숫자: ");
    	int num=sc.nextInt();
    	
    	System.out.println("공차: ");
    	int gong=sc.nextInt();
    	
    	for(int i=1; i<=10; i++) {
    		System.out.print(num+" ");
    		num+=gong;
    		
    	}
    }
    public void practice3() {
    	//*\n
    	//**
    	//***
    	//****
    	System.out.println("정수 입력");
    	int num=sc.nextInt();
    	
    	 for(int i=1; i<=num; i++) {
    		 for(int j=0; j<i; j++) {
        		 System.out.print("*");
        	 }
    		 System.out.println();
    	 }
    }
    public void practice4(){
    	System.out.print("정수를입력하세요");
    	int num=sc.nextInt();
    	
    	for(int i=num; i>=1; i--) {
    		for(int j=1; j<=i; j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
    public void practice5() {
    	//   *
    	//  **
    	// ***
    	//****
    	System.out.print("정수입력:");
    	int num=sc.nextInt();
    	for(int i=0; i<num; i++) {		
    	for(int j=1; j<num-i; j++) {
    		System.out.print(" ");
    	}
    	for(int j=1; j<2+i; j++) {
    		System.out.print("*");
    	}
    	System.out.println();
    }
    }
    public void practice6() {
    	//****
    	// ***
    	//  **
    	//   *
    	System.out.println("정수 입력: ");
    	int num=sc.nextInt();
    	for(int i=0; i<num; i++) {		
    	for(int j=0; j<i; j++) {
    	System.out.print(" ");
    	}
    	
    	for(int j=0; j<num; j++) {
    		System.out.print("*");
    	}
    	System.out.println();
    	}
    }
    public void practice7() {
    	//   *
    	//  ***
    	// *****
    	//*******
    	System.out.print("정수 입력 : ");
		int num = sc.nextInt(); // 4
		for(int i = 0; i < num; i++) {  // 0 1 2 3
			//   *
			for(int j = 0; j < num - (1 + i); j++) { // 3 2 1 0
				System.out.print(" ");
			}
			for(int j = 0; j < 1 + 2*i ; j++) {// 1+2*0 1+2*1 1+2*2 1+2*3
				System.out.print("*");
			}
			System.out.println();
		}
	}
    public void practice8(){
    	System.out.print("숫자 :");
    	int num=sc.nextInt();
    	
    	if(num<2) {  
    	System.out.println("잘못입력했습니다.");	
    	return;
    	}
    	int count=0;
    	for(int i=2; i<=num; i++) {
    		boolean isPrime=true;
    		//i값이 소수인지 아닌지 검사를 하고
    		for(int j=2; j<i; j++) {
    			if(i%j==0) {
    				isPrime=false;
    				//break;
    			}
    		}
    		if(isPrime) {
    			System.out.println(i+" ");
    			count++;
    		}
    		//i 값이 소수라면 출력을하고, 값을 1 증가시킴.
    	}
    	
    	System.out.printf("2부터 %d까지의 소수의 개수는 %d입니다.", num,count);
    	}
    	public void practice9() {
    	    //   *
        	//  ***
        	// *****
        	//*******
    		// *****
    	    //  ***
    	    //   *
    		System.out.print("정수 입력 : ");
    		int num = sc.nextInt();
    		
    		for(int i =0; i<num; i++) {
    			//  *
    			for(int j =0; j < num - (1 + i); j++) { // 0 1
    				System.out.print(" "); //  ;
    			}
    			for(int j = 0; j < 1 + 2 * i; j++) {// 0
    				System.out.print("*");// *
    			}
    			System.out.println();
    		}
    		//3 2
    		//4 3
    		//5 4
    		for(int i = 0; i<num-1; i++) { // 0 1 2 ...
    			// ***
    			for(int j =0; j < 1+i; j++) { // 0
    				System.out.print(" "); // ;
    			}
    			for(int j = 0; j < (num - i) * 2 - 3 ; j++) {
    				// 1 + 2 * (num - 2 - i) -> 1 -> 0
    				// 1 + 2num -4 -2i ->  2(num-i) -3
    				System.out.print("*");// *****
    			}
    			System.out.println();
    		}
    		
    	}
}