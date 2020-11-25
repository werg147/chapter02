package com.javaex.ex09;

public class Tv {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public Tv() {}
	
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	//메소드(getter,setter 작성하지않음)
	
	public void channel(int channel) {
		
	}
	
	public void volume(int volume) {
		
	}
	
	public void power(boolean power) {
		
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
