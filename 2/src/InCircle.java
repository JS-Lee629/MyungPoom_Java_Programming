import java.util.Scanner;

public class InCircle {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �߽ɰ� ������ �Է�>> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		double r = scanner.nextDouble();
		System.out.print("�� �Է�>> ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double d = Math.pow(x-a, 2) + Math.pow(y-b, 2);
		double D = Math.sqrt(d);
		if (D<r)
			System.out.println("�� (" + a + ", " + b + ")�� �� �ȿ� �ִ�.");
		else
			System.out.println("�� (" + a + ", " + b + ")�� �� �ۿ� �ִ�.");
		scanner.close();
		
	}
}
