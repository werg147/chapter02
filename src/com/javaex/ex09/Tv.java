package com.javaex.ex09;

public class Tv {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	//public Tv() {}
	
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	//메소드(getter,setter 작성하지않음)
	
	//채널
	public void channel(int channel) {
		if(channel>=255) {
			this.channel = 225;
		} else if(channel<1) {
			this.channel = 1;
		}
	}
	
	public void channel(boolean up) {
		
	}
	
	//볼륨
	public void volume(int volume) {
		if(volume<0) {
			this.volume = 0;
		} else if(volume>=100) {
			this.volume = 100;
		}
	}
	
	
	//파워
	public void power(boolean on) {
		if(on==true) {
		this.power = on;
		}
	}
	

	
	
	//메소드(일반)
	public void status() {
		System.out.println("Tv (채널: " + channel + ",\t볼륨: " + volume + ",\t전원: " + power + ")");
	}
	
	@Override
	public String toString() {
		return "Tv [채널: " + channel + ",\t볼륨: " + volume + ",\t전원: " + power + "]";
	}
	
	
	
	
	
	
	
}
