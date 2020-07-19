package Chapter_seven;

public class Word {
	String eng, kor;
	public Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}
	public String open() {
		return kor;
	}
	public String check() {
		return eng;
	}
}
