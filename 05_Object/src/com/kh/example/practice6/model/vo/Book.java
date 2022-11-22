package com.kh.example.practice6.model.vo;

public class Book {



	private String title;

	private String publisher;

	private String author;

	private int price;

	private double discountRate;

	

	public Book() {}

	//생성자

	public Book(String title, String publisher, String author, int price, double discountRate) {

		this.title = title;

		this.publisher = publisher;

		this.author = author;

		this.price = price;

		this.discountRate = discountRate;

	}

	public Book(String title, String publisher, String author) {

		this.title = title;//this(title, publisher, author)

		this.publisher = publisher;

		this.author = author;//

	}

	//초기화

	{

	 title="셜록홈즈";

	 publisher="교본문구";

	 author="김상식";

	 price=150000;

	 discountRate=15;



	}

	public void info() {	

		System.out.println("책정보 출력문\n제목은: "+title+"\n제작사: "+publisher+"\n저자는: "+author+"\n가격은"+price+"할인가격은: "+discountRate);

	}

}

