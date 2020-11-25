package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {

		
		//Point() 생성자 사용
		//setter getter 사용o
		//draw() 점을 그린다.
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);
		p1.draw();
		
		//Point(int x, int y) 생성자 사용
		//setter 사용x
		//draw() 점을 그린다.
		Point p2 = new Point(10, 23);
		p2.draw();
		
		
		//Point(int x)생성자 사용
		//setY() 사용
		//draw() 점을 그린다.
		Point p3 = new Point(15);
		p3.setY(11);		
		p3.draw();
		
	}

}
