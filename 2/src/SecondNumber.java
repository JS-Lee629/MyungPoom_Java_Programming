import java.util.Scanner;

public class SecondNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 3�� �Է�>> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int n = 0;
		if ((a>b) && (a>c))
			if (b>c) n = b;
			if (b<c) n = c;
		else if ((b>a) && (b>c))
			if (a>c) n = a;
			if (a<c) n = c;
		else if ((c>a) && (c<b))
			if (a>b) n = a;
			if (a<b) n = b;
		System.out.println("�߰� ���� " + n);
		scanner.close();
		
	}
}
