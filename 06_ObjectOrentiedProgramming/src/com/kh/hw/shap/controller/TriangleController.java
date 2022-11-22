package com.kh.hw.shap.controller;

import com.kh.hw.shap.model.vo.Shape;

public class TriangleController {
	Shape s=new Shape();	
	public double calcArea(double height,double width) {
		s.setHeight(height);
		s.setWidth(width);
		double sum2=height*width;
		return sum2;
	}
	public void paintColor(String color) {
		s.setColor(color);
		s.getType();
		s.information();
	}

}
