import java.util.Scanner;

public class CircleandCircle {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>> ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		double r1 = scanner.nextInt();
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>> ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		double r2 = scanner.nextInt();
		double d = Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2);
		double D = Math.sqrt(d);
		if (D < r1+r2)
			System.out.println("�� ���� ���� ��ģ��");
		else
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�");
		scanner.close();
		
	}
}
