package com.javaex.ex15;

public class Point {

	//필드
	protected int x;
	protected int y;
	
	//생성자
	public Point() {
		System.out.println("Point() 테스트");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point(2) 테스트");
	}
	
	//메소드 g,s
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	//메소드 일반
	public void showInfo() {
		
	}
	
	
}