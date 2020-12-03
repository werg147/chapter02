package com.javaex.ex22;

public class Triangle extends Shape implements Drawable{
	
	private int bottom;
	private int height;
	
	public Triangle() {}
	
	public Triangle(String fillColor, String lineColor, int bottom, int height) {
		super(fillColor, lineColor);
		this.bottom = bottom;
		this.height = height;
	}
	
	public int getBottom() {
		return bottom;
	}

	public void setBottom(int bottom) {
		this.bottom = bottom;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println("사각형-면색:" + fillColor + ", 선색:" + lineColor + ", 밑변:" + bottom + ", 높이:" + height);
	}
	
	public double area() {
		return bottom * height / 2;
	}

}
