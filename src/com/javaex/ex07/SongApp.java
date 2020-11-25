package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		
		//생성자0
		Song s01 = new Song();
		
		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수");
		s01.setYear(2010);
		s01.setTrack(3);
		
		s01.showInfo();
		
		System.out.println("========================================");
		
		//생성자6
		Song s02 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", 2007, 2);
		
		s02.showInfo();
		
		System.out.println("========================================");
		
		//생성자2: 타이틀 아티스트
		Song s03 = new Song("벚꽃엔딩", "버스커버스커");
		s03.setAlbum("버스커버스커1집");
		s03.setYear(2012);
		s03.setTrack(4);
		s03.setComposer("장범준");
		
		s03.showInfo();
		
		//생성자2: 타이틀 작곡가-->위와 같은 스트링2개 조건이라 파라미터가 겹친다
		
		//생성자2: 타이틀 트랙번호
		Song s04 = new Song("좋은날", 3);
		s04.setArtist("아이유");
		s04.setAlbum("Real");
		s04.setYear(2010);
		s04.setComposer("이민수");
		
		s04.showInfo();
		
		
	}

}
