import java.util.Scanner;

public class Withdraw {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>> ");
		int i = scanner.nextInt();
		int a = i/50000;
		System.out.println("오만원권 " + a + "매");
		i = i - 50000*a;
		int b = i/10000;
		System.out.println("만원권 " + b + "매");
		i = i - 10000*b;
		int c = i/5000;
		System.out.println("오천원권 " + c + "매");
		i = i - 5000*c;
		int d = i/1000;
		System.out.println("천원권 " + d + "매");
		i = i - 1000*d;
		int e = i/500;
		System.out.println("오백원 " + e + "개");
		i = i - 500*e;
		int f = i/100;
		System.out.println("백원 " + f + "개");
		i = i - 100*f;
		int g = i/50;
		System.out.println("오십원 " + g + "개");
		i = i - 50*g;
		int h = i/10;
		System.out.println("십원 " + h + "개");
		scanner.close();
		
	}
}
