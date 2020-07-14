import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		Scanner scannerone = new Scanner(System.in);
		System.out.print("금액을 입력하시오>> ");
		int i = scannerone.nextInt();
		int b = 0;
		for (int k : unit) {
			int a = i/k;
			System.out.println(unit[b]+"원 짜리: "+a+"개");
			i = i % unit[b];
			b = b + 1;
		}
		scannerone.close();
		
	}
}
