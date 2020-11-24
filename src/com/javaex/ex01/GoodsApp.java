package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods();
		
		
		/*캡슐화 때문에 사용불가
		camera.name = "니콘";
		camera.price = 400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		
		
		Goods computer = new Goods();
		
		computer.name = "LG그램";
		computer.price = 1000000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		
		Goods cup = new Goods();
		
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		
		camera.price = 450000;
		System.out.println(camera.name);
		System.out.println(camera.price);
		*/
		
		
		camera.setName("니콘");
		String cameraName = camera.getName();
		//System.out.println(cameraName);
		
		
		camera.setPrice(400000);
		int cameraPrice = camera.getPrice();
		//System.out.println(cameraPrice);
		
		
		computer.setName("LG그램");
		String computerName = computer.getName();
		//System.out.println(computerName);
		
		computer.setPrice(1000000);
		int computerPrice = computer.getPrice();
		//System.out.println(computerPrice);
		
		cup.setName("머그컵");
		String cupName = cup.getName();
		//System.out.println(cupName);
		
		cup.setPrice(2000);
		int cupPrice = cup.getPrice();
		//System.out.println(cupPrice);
		
		//출력
		/*
		System.out.println("상품이름: " + cameraName);
		System.out.println("가격: " + cameraPrice);
		
		System.out.println("상품이름: " + computerName);
		System.out.println("가격: " + computerPrice);
		
		System.out.println("상품이름: " + cupName);
		System.out.println("가격: " + cupPrice);
		*/
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		
		
		

	}

}
