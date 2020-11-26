package com.javaex.ex10;

public class Goods {

	//필드
	private String name;
	private int price;
	public static int totalCount;
	
	//생성자
	public Goods() {
		totalCount = totalCount + 1;
	}
	
	public Goods(String name) {
		this.name = name;
		totalCount = totalCount + 1;
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		totalCount = totalCount + 1;
	}

	

	//메소드 getter setter
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
	
	public int getTotalCount() {
		return totalCount;
	}
	
	
	
	//일반메소드
	public void showInfo() { //복잡한 로직이라고 가정
		System.out.println("상품평: " + name + ", 가격: " + price);
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + "]";
	}
	

	
	
	
	
}
