import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>> ");
		double a = scanner.nextDouble();
		String s = scanner.next();
		double b = scanner.nextDouble();
		double k = 0;
		if (s.equals("+")) k = a + b;
		else if (s.equals("-")) k = a - b;
		else if (s.equals("*")) k = a * b;
		else if (s.equals("/")) 
			if (b == 0) System.out.println("0으로 나눌 수 없습니다.");
			else k = a / b;
		System.out.println(a + s + b + "의 계산 결과는 " + k);
		scanner.close();
		
	}
}
