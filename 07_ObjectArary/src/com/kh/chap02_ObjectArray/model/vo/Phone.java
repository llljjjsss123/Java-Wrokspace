package com.kh.chap02_ObjectArray.model.vo;

public class Phone {
	private String name;
	private String series;
	private String brand;
	private int price;
	
	public Phone() {
		
	}
	public Phone(String name, String series, String brand, int price) {
		 this.brand=brand;
		 this.name=name;
		 this.price=price;
		 this.series=series;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String information() {
		return "이름은 : "+name+" 시리즈는 : "+series+" 브랜드는 : "+brand+" 가격은 : "+price;
	}
}
