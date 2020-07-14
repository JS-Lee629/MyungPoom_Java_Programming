import java.util.Scanner;

public class InCircle {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		double r = scanner.nextDouble();
		System.out.print("점 입력>> ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double d = Math.pow(x-a, 2) + Math.pow(y-b, 2);
		double D = Math.sqrt(d);
		if (D<r)
			System.out.println("점 (" + a + ", " + b + ")는 원 안에 있다.");
		else
			System.out.println("점 (" + a + ", " + b + ")는 원 밖에 있다.");
		scanner.close();
		
	}
}
