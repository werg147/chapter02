package com.javaex.ex09;

public class TvApp {

	public static void main(String[] args) {
		
		Tv tv = new Tv(7, 20, false);
		
		tv.status();
		System.out.println(tv.toString());
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		

	}

}
