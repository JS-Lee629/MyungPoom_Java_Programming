import java.util.Scanner;

public class Up_Calculator {
	public static void main (String[] args) {
		Calc cal;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		char w = scanner.next().charAt(0);
		switch (w) {
		case '+':
			cal = new N_Add();
			break;
		case '-':
			cal = new N_Sub();
			break;
		case '*':
			cal = new N_Mul();
			break;
		case '/':
			cal = new N_Div();
			break;
		default:
			System.out.println("�߸��� ������ �Դϴ�.");
			scanner.close();
			return;
		}
		cal.setValue(a, b);
		System.out.println(cal.calculate());
		scanner.close();
	}
}
