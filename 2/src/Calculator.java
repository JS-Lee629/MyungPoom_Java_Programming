import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("����>> ");
		double a = scanner.nextDouble();
		String s = scanner.next();
		double b = scanner.nextDouble();
		double k = 0;
		if (s.equals("+")) k = a + b;
		else if (s.equals("-")) k = a - b;
		else if (s.equals("*")) k = a * b;
		else if (s.equals("/")) 
			if (b == 0) System.out.println("0���� ���� �� �����ϴ�.");
			else k = a / b;
		System.out.println(a + s + b + "�� ��� ����� " + k);
		scanner.close();
		
	}
}
