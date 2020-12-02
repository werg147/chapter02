package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape[] sArray = new Shape[3];
		
		//원
		Shape s1 = new Circle("빨강", "빨강", 5);
		
		//사각형
		Shape s2 = new Ractangle("파랑", "파랑", 3, 5);
		
		//삼각형
		Shape s3 = new Triangle("노랑", "노랑", 6, 2);
		
		sArray[0] = s1;
		sArray[1] = s2;
		sArray[2] = s3;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}

		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
		
	}

}
