package com.javaex.ex20;

public class Circle extends Shape{

	private int radius;
	
	public Circle() {}
	
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("사각형-면색:" + fillColor + ", 선색:" + super.lineColor + ", 반지름:" + radius);
	}
	
	public double area() {
		return radius * radius * 3.14;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
}
