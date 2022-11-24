package com.kh.chap03_override.model.vo;

public class Book /*extends Object*/{
	private String title;
	private String author;
	private int price;
	public Book() {
		super();
		
	}
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
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
	
	/*
	 * 오버라이딩
	 * -상속받고 있는 부모클래스의 메소드를 자식 클래스에서 재정의하는것
	 * -부모가 제공하고 있는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미.
	 * (자식 메소드 우선권)
	 * 
	 * 오버라이딩 성립 조건
	 * 부모메소드의 메소드 명과 동일
	 * 매개변수 자료형,갯수,순서가 동일(매개변수명 상관없음)
	 * 반환형이 동일해야함
	 * 부모에소드의 접근제한다 보다 같거나 공유범위가 더 커야함
	 * ex)만약 부모메소드의 접근제한자가 protected면 자식은 public,protected여야함
	 * =>규약의 개념이 들어가 있음(재정의 하기위해 위의 성립조건은 최소한 지켜야한다는 의미)
	 * 
	 * @Override
	 * -생략가능(명시를 안해도 부모 메소드와 형태가 같으면 오버라이딩이 된것)
	 * -어노테이션을 붙이는 이유
	 * >잘못 기술했을 경우(성립 조건과 다르게)오류를 알려주기 때문에 다시한번 검토 할수있게 유도한다
	 * >혹시라도 부모메소드가 나중에 수정이 되었을 경우 오류를 알려주기때문에 검토 유도
	 * >이 메소드가 오버라이딩된 메소드라는걸 알리고자 하는 목적
	 */
	@Override
	public String toString() {
		return "책 제목은: "+title+", 책 저자: "+author+",책 가격: "+price;
	}
	
}	
