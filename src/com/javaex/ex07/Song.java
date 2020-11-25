package com.javaex.ex07;

public class Song {

	//필드6개
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	//생성자0
	public Song() {}
	
	
	
	//생성자2: 타이틀 트랙번호 -->확인 : 파라미터의 자료형이 달라서 사용가능
	public Song(String title, int track) {
		this.title = title;
		
		if(track<1) {
			this.track = 0;
			//복잡한 로직이 있을수있다. 가정100라인
		} else {
		this.track = track;
		}
		
		System.out.println("생성자(2)");
	}
	
	

	//생성자6
	public Song(String title, String artist, String album, String composer, int year, int track) {
		//추가작업 --> 초기값 대입
		this(title, track); //다른 생성자를 호출한다.(사용한다)
		
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
	
		System.out.println("생성자(6)");
		
	}
	
	//생성자2: 타이틀 아티스트
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	//생성자2: 타이틀 작곡가 -->확인
	/*
	public Song(String title, String composer) {
		this.title = title;
		this.composer = composer;
	}
	*/
	

	
	
	//메소드 getter setter
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getArtist() {
		return artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbum() {
		return album;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getComposer() {
		return composer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	public int getTrack() {
		return track;
	}
	
	
	//메소드 일반메소드 showInfo()
	public void showInfo() {
		System.out.println(artist + ", " + title + ", ( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡)");
	}
	
	//메소드 일반메소드 toString() <--테스트
	public String toString() {
		return "artist + \", \" + title + \", ( \" + album + \", \" + year + \", \" + track + \"번 track, \" + composer + \" 작곡)\"";
	}
		
	
	
}
