package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		
		//p1.x = 2;
		//p1.y = 2;
		//캡슐화
		//메소드 만들기
		
		//p1 x,y   p2 x,y 
		
		//p1
		p1.setX(5);
		int p1x = p1.getX();
		
		p1.setY(5);
		int p1y = p1.getY();
		
		//p2
		p2.setX(10);
		int p2x = p2.getX();
		
		p2.setY(23);
		int p2y = p2.getY();
		
		//출력
		//System.out.println("점 [x=" + p1x + ", y=" + p1y + "]을 그렸습니다.");
		//System.out.println("점 [x=" + p2x + ", y=" + p2y + "]을 그렸습니다.");
		
		p1.showInfo();
		p2.showInfo();

	}

}
