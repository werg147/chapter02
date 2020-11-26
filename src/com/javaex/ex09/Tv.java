package com.javaex.ex09;

public class Tv {
	
	//필드 - private제어
	private int channel;
	private int volume;
	private boolean power;
	
	
	//생성자(기본생성자 오버로딩)
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	//메소드 setter제외
	//getter
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	
	//파워
	public void power(boolean on) {
		this.power = on;
	}
	
	//채널
	public void channel(int channel) {
		if(power==true) {
			if(channel<0) {
				this.channel = 0;
			} else if(channel>255) {
				this.channel = 255;
			} else {
				this.channel = channel;
			}
		}
	}
	
	public void channel(boolean up) {
		if(up==true) {
			channel(this.channel+1);
		} else {
			channel(this.channel-1);
		}
	}
	
	//볼륨
	public void volume(int volume) {
		if(power==true) {
			if(volume<0) {
				this.volume = 0;
			} else if(volume>100) {
				this.volume = 100;
			} else {
				this.volume = volume;
			}
		}
	}
	
	public void volume(boolean up) {
		if(up==true) {
			volume(this.volume+1);
		} else {
			volume(this.volume-1);
		}
	}
	
	
	//일반메소드
	public void status() {
		System.out.println("채널:" + channel + "\t,\t볼륨:" + volume + ",\t전원:" + power);
	}

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	
	
	
}
