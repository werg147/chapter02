package com.javaex.ex09;

public class TvApp {

	public static void main(String[] args) {
		
		//초기값 설정
		Tv tv = new Tv(7, 20, false);
		tv.status();

		System.out.println("-----------------------------------------");
		
		//전원 켜졌을때 볼륨테스트
		tv.power(true);
		tv.volume(120);
		tv.status();
		
		//볼륨 up이 참이 아니므로 -1
		tv.volume(false);
		tv.status();		
		
		System.out.println("-----------------------------------------");
		
		//채널 테스트
		tv.channel(0);
		tv.status();
		
		//채널 up이 세번 참이므로 +3
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		System.out.println("-----------------------------------------");
		
		tv.power(false);
		tv.status();
		
	}
}
