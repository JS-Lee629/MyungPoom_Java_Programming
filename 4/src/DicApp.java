import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�? ");
			String word = scanner.next();
			if (word.equals("�׸�")) {
				scanner.close();
				break;
			}
			Dictionary.kor2eng(word);
		}
	}
	
}
