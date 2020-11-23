package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		Point p4 = new Point();
		
		//p1.x = 2;
		//p1.y = 2;
		//캡슐화
		//메소드 만들기
		
		//p1 p2 p3 p4
		
		//p1
		p1.setXval(5);
		int p1x = p1.getXval();
		
		
		//p2
		p2.setYval(5);
		int p2y = p2.getYval();
		
		//p3
		p3.setXval(10);
		int p3x = p3.getXval();
		
		//p4
		p4.setYval(23);
		int p4y = p4.getYval();
		
		//출력
		System.out.println("점 [x=" + p1x + ", y=" + p2y + "]을 그렸습니다.");
		System.out.println("점 [x=" + p3x + ", y=" + p4y + "]을 그렸습니다.");
		
	}

}
