package com.javaex.ex15;

public class ColorPoint extends Point{

	//필드
	private String color;
	
	//생성자
	public ColorPoint() {
		System.out.println("ColorPoint() 테스트");
	}
	
	public ColorPoint(String color) {
		this.color = color;
		System.out.println("ColorPoint(1) 테스트");
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		System.out.println("ColorPoint(3) 테스트");
	}

	
	//메소드 g,s
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	//메소드 일반
	public void showInfo() {
		/*
		System.out.println(x);
		System.out.println(y);
		System.out.println(color);
		*/
		System.out.println(x + ", " + y + ", " + color);
	}
	
}
