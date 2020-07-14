public class Song {
	
	int year;
	String country;
	String artist;
	String title;
	
	public Song(int year, String country, String artist, String title) {
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}
	
	public void show() {
		System.out.print(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
	
	public static void main(String[] args) {
		
		int year = 1978;
		String country = "스웨덴";
		String artist = "ABBA";
		String title = "Dancing Queen";
		Song mySong = new Song(year, country, artist, title);
		mySong.show();
		
	}
}
