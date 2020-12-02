package com.javaex.ex20;

public class Ractangle extends Shape{

	private int width;
	private int height;
	
	public Ractangle() {}
	
	public Ractangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println("사각형-면색:" + fillColor + ", 선색:" + super.lineColor + ", 가로:" + width + ", 세로:" + height);
	}
	
	public double area() {
		//double area = width * height;
		//return area;
		return width * height;
	}
	
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
}
