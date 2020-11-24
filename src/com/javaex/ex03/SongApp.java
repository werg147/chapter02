package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		
		Song IU = new Song();

		Song BUSKER = new Song();

		
		
		//아이유
		IU.setArtist("아이유");
		IU.setTitle("좋은날");
		IU.setAlbum("Real");
		IU.setYear(2010);
		IU.setTrack(3);	
		IU.setComposer("이민수");

		Song BIGBANG = new Song ("BIGBANG", "거짓말", "Always", 2007, 3, "G-DRAGON");
		//빅뱅
		/*
		BIGBANG.setArtist("BIGBANG");		
		BIGBANG.setTitle("거짓말");		
		BIGBANG.setAlbum("Always");
		BIGBANG.setYear(2007);		
		BIGBANG.setTrack(3);	
		BIGBANG.setComposer("G-DRAGON");
		*/
		
		//Song.java 에서 게터는 필요없으므로 쓰지않음
		//(버스커는 예시로 써둠)
		//버스커버스커
		BUSKER.setArtist("버스커버스커");
		String BUSKERartist = BUSKER.getArtist();
		
		BUSKER.setTitle("벚꽃엔딩");
		String BUSKERtitle = BUSKER.getTitle();
		
		BUSKER.setAlbum("버스커버스커 1집");
		String BUSKERalbum = BUSKER.getAlbum();
		
		BUSKER.setYear(2012);
		int BUSKERyear = BUSKER.getYear();
		
		BUSKER.setTrack(4);
		int BUSKERtrack = BUSKER.getTrack();
		
		BUSKER.setComposer("장범준");
		String BUSKERcomposer = BUSKER.getComposer();
			
		
		
		//출력
		IU.showInfo();
		BIGBANG.showInfo();
		BUSKER.showInfo();
		
		
		
		
	}
}
		
		
		
		
		
		
	