import java.util.Scanner;

public class SameSame {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>> ");
		int i = scanner.nextInt();
		if (i/10==i%10) 
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else 
			System.out.println("10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		scanner.close();
		
	}
}
