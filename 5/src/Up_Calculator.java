import java.util.Scanner;

public class Up_Calculator {
	public static void main (String[] args) {
		Calc cal;
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>> ");
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
			System.out.println("잘못된 연산자 입니다.");
			scanner.close();
			return;
		}
		cal.setValue(a, b);
		System.out.println(cal.calculate());
		scanner.close();
	}
}
