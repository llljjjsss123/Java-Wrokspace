package com.kh.hw.shap.controller;

import com.kh.hw.shap.model.vo.Shape;

public class SquareController {
	Shape s=new Shape();
	
public double calcPerimeter(double height, double width) {
		s.setWidth(width);
		s.setHeight(height);
		double sum= height*2+width*2;
		return sum;
	}
	public double calcArea(double height, double width) {
		s.setWidth(width);
		s.setHeight(height);
		double num=width*height;
		return num;
	}
	public void paintColor(String color) {
		s.setColor(color);
		 s.information();
		
	}
}
