package com.javaex.ex18;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int Y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void showInfo() {
		System.out.println("x=" + x + ", y=" + y);
	}
	
}
