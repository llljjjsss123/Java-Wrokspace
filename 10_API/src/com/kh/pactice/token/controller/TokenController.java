package com.kh.pactice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		
	}
	public String afterToken(String str) {
		StringTokenizer stn=new StringTokenizer(str," ");
		System.out.println("분리된 문자열의 갯수: "+stn.countTokens());
		
	}
	public void firstCap(String input) {
		String str="hello";
		char ch=str.charAt(0);
		System.out.println("ch: "+ch);
		String str2=str.replace('h', 'H');
		System.out.println("str2: "+str2);
	}
	public void findChar(String input,char one) {
		
		String index[]=new String[5];
		int count=0;
		for(int i=0; i<index.length; i++) {
		}
		count++;
		return ;
	}
}
