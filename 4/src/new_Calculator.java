import java.util.Scanner;

public class new_Calculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String w = scanner.next();
		if (w.equals("+")) {
			add.setValue(a, b);
			System.out.print(add.calculate());
		}
		if (w.equals("-")) {
			sub.setValue(a, b);
			System.out.print(sub.calculate());
		}
		if (w.equals("*")) {
			mul.setValue(a, b);
			System.out.print(mul.calculate());
		}
		if (w.equals("/")) {
			div.setValue(a, b);
			System.out.print(div.calculate());
		}
		scanner.close();
		
	}
}
