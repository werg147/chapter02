package com.javaex.ex18;

public class ColorPoint extends Point{
	
	private String color;
	
	public ColorPoint() {}
	
	public ColorPoint(String color) {
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void showInfo() {
		System.out.println("x=" + super.getX() + ", y=" + super.getY() + ", " + color);
	}
	
	
}
