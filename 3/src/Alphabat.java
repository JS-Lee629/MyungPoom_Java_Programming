import java.util.Scanner;

public class Alphabat {
	public static void main(String[] args) {
		
		Scanner scannerone = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
		char alphabat = scannerone.next().charAt(0);
		for (char i = 'a'; i <= alphabat; alphabat--) {
			for (char j = 'a'; j <= alphabat; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
		scannerone.close();
		
	}
}
