import java.util.Scanner;

public class InSquare {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� (x, y)�� ��ǥ�� �Է��Ͻÿ�>> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if ((x < 200 && x > 100) && (y < 200 && y > 100))
			System.out.println("(" + x + "," + y + ")�� �簢�� �ȿ� �ֽ��ϴ�.");
		else 
			System.out.println("(" + x + "," + y + ")�� �簢�� �ȿ� �����ϴ�.");
		scanner.close();
	}

}
