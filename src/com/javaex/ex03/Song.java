package com.javaex.ex03;

public class Song {

	private String artist;
	private String title;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	//생성자
	//메소드와 유사하다. 이름은 클래스명, 리턴없음
	public Song() {
		//메모리에 올린다.
	}
	
	public Song(String artist, String title, String album, int year, int track, String composer) {
		//메모리에 올린다.
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}
	
	

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public void showInfo() {
		System.out.println(
				artist + ", " + title + "( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡)");
	}

}
