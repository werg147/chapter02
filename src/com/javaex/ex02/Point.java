package com.javaex.ex02;

public class Point {

	private int x;
	private int y;
	
	//x값 입력
	public void setX (int xv) {
		x = xv;
	}
	
	//x값 읽기
	public int getX() {
		return x;
	}
	
	//y값 입력
	public void setY (int yv) {
		y = yv;
	}
	
	//y값 읽기
	public int getY() {
		return y;
	}
	
	//출력(일반메소드)
	public void draw() {
		System.out.println("점[x= " + x + ", y= " + y + "]을 그렸습니다.");
	}
	
}
