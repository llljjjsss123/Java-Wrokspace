package com.kh.hw.shap.view;

import java.util.Scanner;

import com.kh.hw.shap.controller.SquareController;
import com.kh.hw.shap.controller.TriangleController;

public class ShapeMenu {
	Scanner sc=new Scanner(System.in);
	
	SquareController scr=new SquareController();
	
	public void SquareController(){
		
	}
	TriangleController tc=new TriangleController();
	public void TriangleCountroller() {
		
	}
	public void inputMenu() {
		System.out.println("삼각형 사각형 둘중 하나 선택하세요.");
		int type=sc.nextInt();
		
	}
	public void triangleMenu() {
		
	}
	public void squareMenu() {
		
	}
	public void inputSize(int type, int menuNum) {
		
	}
	public void printInformation(int type) {
		
	}
}
//+ inputMenu() : void
//+ triangleMenu() :void
//+ squareMenu():void
//+ inputSize(type:int, menuNum:int):void
//+ printInformation(type:int):void
