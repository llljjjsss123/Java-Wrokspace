package com.kh.example.practice4.model.vo;

public class Student {

	private int grade;

	private int classroom;

	private String name;

	private double height;

	private char gender;

	{

		grade = 6;

		classroom = 3;

		name = "이준석";

		height = 185;

		gender = '남';

	}

	public int getGrade() {

		return grade;

	}

	public void setGrade(int grade) {

		this.grade = grade;

	}

	public int getClassroom() {

		return classroom;

	}

	public void setClassroom(int classroom) {

		this.classroom = classroom;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public double getHeight() {

		return height;

	}

	public void setHeight(double height) {

		this.height = height;

	}
	public char getGender() {

		return gender;

	}

	public void setGender(char gender) {

		this.gender = gender;
	}


	public void information() {

		System.out.println( grade+"학년"+classroom+"반"+name+"이름"+ height+"cm \n 성: "+gender);

	}



}



