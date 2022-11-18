package com.kh.chap05_constructor.model;

public class Circle {
	private static final double PI=3.14;//3.14
	private int radius=1;//반지름
	{
		radius=5;
	}
	public Circle() {
		
	}
	public void setRadius(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public void incrementRadius() {
		radius++;
		 getAreaOfCircle();
		 getSizeOfCircle();
	}
	//원의 둘레
	public void getAreaOfCircle() {
		System.out.println(PI * radius *2);
	}
	//원의 넓이
	public void getSizeOfCircle() {
		System.out.println(radius*radius*PI);
	}
	

}
