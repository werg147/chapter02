package com.javaex.ex01;

public class Goods {
	
	//필드
	
	//private String name; 필드와 메소드의 접근을 제한
	//String name; //디폴트값
	private String name;
	private int price;


	//생성자
	
	public Goods() {
		//메모리에 올린다
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	
	
	
	
	//메소드 -겟터/세터
	public void setName(String name) {
		this.name = name; //"니콘" "LG그램" "머그컵"
	}
			
	//getName() 이름읽기
	public String getName() {
		return name;
	}
	
	//setPrice() 가격등록
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//getPrice() 가격읽기
	public int getPrice() {
		return price;
	}
	
	//출력(일반메소드)
	public void showInfo() {
		System.out.println("상품이름: " + name + ", 가격: " + price);
	}

	
	//name 읽어주는 기능
	//price 등록하는 기능
	//메소드 -일반

}
