package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Point 테스트
		Point p = new Point(3, 3);
		p.draw();
		System.out.println(p.getX());
		
		
		Drawable pp = new Point(6, 6);
		pp.draw();
		//pp.getX(); 보이지않음
		
	    ((Point)pp).getX(); //다운캐스팅해서 사용
	    
	    System.out.println("===========================================");
	    
	    //점+도형 함께 관리
	    Drawable[] dArray = new Drawable[4];
	    
	    Drawable r01 = new Ractangle("빨강", "빨강", 5 ,5);
	    Drawable c01 = new Circle("파랑", "파랑", 3);
	    Drawable t01 = new Triangle("노랑", "노랑", 6, 8);
	    Drawable p01 = new Point(9, 9);
	    
	    dArray[0] = r01;
	    dArray[1] = c01;
	    dArray[2] = t01;
	    dArray[3] = p01;
	    
	    for(int i=0; i<dArray.length; i++) {
	    	dArray[i].draw();
	    }
	    
	    //System.out.println(((Shape)c01).area());
		
	    System.out.println("===========================================");
	    
	    //전체 면적구하기 --> Point면적이 없다
	    //순차적으로 area() 부모가 Shape이면 면의 면적을 구한다.
	    for(int i=0; i<dArray.length; i++) {
	    	//부모가 Shape이면 실행
	    	if(dArray[i] instanceof Shape) {
	    	System.out.println(((Shape)dArray[i]).area());
	    	}
	    }
		
	}

}
