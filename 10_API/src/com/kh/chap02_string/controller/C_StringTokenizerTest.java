package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		String str="Java, Oracle, JDBC, HTML, CSS, JavaStript, Server";
		//구분자를 제시해서 해당 문자열을 분리시키는 방법
		//방법1. 분리된 문자열들을 String[]배열에 차곡차곡 담아서 관리하는 방법
		// 		문자열.split(구분자):String[]
		String[]arr=str.split(",");
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//	}
		for(String s:arr) {
			System.out.println(s);
		}
		System.out.println("=================================================");
		
//			방법2. 분리된 각각의 문자열들을 토근으로 취급하고 싶을 때
//			javja.util.Tokrnizer캘르스를 이용하는 방법
//			StringTokenizer stn=new StringTokenizer(분리시키고자 하는 문자열, 구분자)
		StringTokenizer stn=new StringTokenizer(str," ");
		System.out.println("분리된 문자열의 갯수: "+stn.countTokens());
		
		while(stn.hasMoreTokens()) {//다음 토큰이 있으면 true, 없으면 false
			System.out.println(stn.nextToken());
		}
		
	}
}
