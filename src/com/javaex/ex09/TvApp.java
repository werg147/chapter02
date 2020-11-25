package com.javaex.ex09;

public class TvApp {

	public static void main(String[] args) {
		
		Tv tv = new Tv(7, 20, false);
		
		tv.status();
		System.out.println(tv.toString());
		
		System.out.println("====================================================");
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		
		System.out.println("====================================================");
		
		//tv.volume(false);
		//tv.status();
		
		tv.channel(0);
		tv.status();
		
		System.out.println("====================================================");
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		System.out.println("====================================================");
		
		tv.power(false);
		tv.status();
		

	}

}
