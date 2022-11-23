package com.kh.chap01_oneVsmany.model.vo;

public class Book {
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {
		
	}
	public Book(String title, String author,int price, String publisher) {
		this.title=title;
		this.author =author;
		this.price=price;
		this.publisher=publisher;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String information() {
		return title+","+author+","+price+","+publisher;
	}
}