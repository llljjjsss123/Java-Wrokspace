package com.kh.pactice.token.view;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.pactice.token.controller.TokenController;

public class TokenMenu {
	private Scanner sc=new Scanner(System.in);
	private TokenController tc=new TokenController();
	public void mainMenu() {
		
	}
	public void tokenMenu() {
		
		StringTokenizer stn=new StringTokenizer(str," ");
		System.out.println("분리된 문자열의 갯수: "+stn.countTokens());
		
	}
	public void inputMenu() {
		char ch=str.charAt(0);
		System.out.println("ch: "+ch);
		String str2=str.replace('h', 'H');
		System.out.println("str2: "+str2);
	}
}
