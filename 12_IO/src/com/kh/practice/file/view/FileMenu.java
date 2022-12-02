package com.kh.practice.file.view;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.kh.chap05_assist2.model.vo.Phone;
import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc=new Scanner(System.in);
	private FileController fc=new FileController();
	public void mainMenu() {
		System.out.println("***** My Note *****");
		while(true) {
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.print("9. 끝내기  ");
			int num = Integer.parseInt(sc.nextLine());
			sc.nextLine();
			
			switch(num) {
			case 1: fileSave(); break;
			case 2:	fileOpen(); break;
			case 3:	fileEdit(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
	public void fileSave() {
		StringBuilder sb=new StringBuilder();
		while(true) {
		System.out.println("파일에 저장할 내용을 입력하세요.\n ex끝it 이라고 입력하면 종료됩니다.");
		System.out.print("내용: ");
		String str=sc.nextLine();
		if(str.equals("ex끝it")) {
			break;
		}
		sb.append(str+" \n ");
		}
		while(true) {
		System.out.println("저장할 파일명을 입력해주세요.(ex.myFile.txt):");
		String file=sc.nextLine();
		if(fc.checkName(file)) {//file이라는 이름이 이미 존재하는 경우
			System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
			char yes=sc.nextLine().charAt(0);
			if(yes=='y'|| yes=='Y') {//덮어씌우기
				fc.fileSave(file, sb);
			}else {
				System.out.println("파일명을 다시 입력해주세요");
				continue;
		

	}
}
	public void fileOpen() {
		System.out.println("열 파일명: ");
		String file=sc.nextLine();
		if(fc.checkName(file)) {//true파일이 있음
			System.out.println(fc.fileOpen(file));
		}else {//false 파일이 없음
			System.out.println("없는 파일 입니다.");
		}	
	}

	public void fileEdit() {
		System.out.println("수정할 파일명: ");
		String file=sc.nextLine();
		if(fc.checkName(file)) {//파일이 있는 경우
			
		}else {//파일이 없는경우
			System.out.println("없는 파일 입니다.");
		}
	}
}

