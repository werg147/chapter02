package com.javaex.ex18;

public class PointApp {

	public static void main(String[] args) {
		
		Point[] pcArray = new Point[4];
		
		Point p1 = new Point(2, 4);
		Point p2 = new Point(3, 5);
		
		Point c1 = new ColorPoint(1, 1, "pink");
		Point c2 = new ColorPoint(9, 9, "black");
		
		pcArray[0] = p1;
		pcArray[1] = p2;
		pcArray[2] = c1;
		pcArray[3] = c2;
		
		for(int i=0; i<pcArray.length; i++) {
			pcArray[i].showInfo();
		}
		
		System.out.println("--------------------------------------");
		
		((ColorPoint)pcArray[3]).setColor("블랙");
		System.out.println(((ColorPoint)pcArray[3]).getColor());
		
		Point t1 = pcArray[2];  //업캐스팅 / 자식클래스가 부모클래스 타입으로 변환(자동)
		ColorPoint t2 = (ColorPoint)pcArray[3];  //다운캐스팅 (업캐스팅 된 것을 원래대로 되돌림/타입변환 해야함)
		
		

	}

}
