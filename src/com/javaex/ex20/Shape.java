package com.javaex.ex20;

public abstract class Shape { //메소드중 abstract가 하나라도 있다면 전체에 선언해줘야함
	
	protected String fillColor;
	protected String lineColor;
	
	public Shape() {}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	//draw 오버라이딩 사용(제목만 필요할경우)
	//메소드중 abstract가 하나라도 있다면 전체에 선언해줘야함
	public abstract void draw();
	
	public abstract double area();
	
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	

}
