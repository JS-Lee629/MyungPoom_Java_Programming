import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어? ");
			String word = scanner.next();
			if (word.equals("그만")) {
				scanner.close();
				break;
			}
			Dictionary.kor2eng(word);
		}
	}
	
}
