package com.javaex.ex04;

public class Goods {

	// 필드
	private String name;
	private int price;

	// 생성자
	public Goods() {} 
	// 어차피 넣을 내용이 없어서 {}이렇게 표현하기도 함
	// 다른 생성자가 있으면 생략할 수 없다

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Goods(String name) {
		this.name = name;
	}

	
	/* 제너레이트 필드로 만듦
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	*/
	
	
	// 메소드(getter,setter)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 일반메소드
	public void showInfo() {
		System.out.println("상품: " + name + ". 가격: " + price);
	}
	
}
