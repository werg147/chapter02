package com.javaex.ex02;

public class Point {

	//필드
	private int x;
	private int y;
	
	
	//생성자
	public Point() {
		//메모리에 업로드.
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y  = y;
	}
	
	
	//메소드(겟터,세터)
	//x값 입력
	public void setX (int x) {
		this.x = x;
	}
	
	//x값 읽기
	public int getX() {
		return x;
	}
	
	//y값 입력
	public void setY (int y) {
		this.y = y;
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
