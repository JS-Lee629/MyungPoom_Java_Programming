import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		Scanner scannerone = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		int i = scannerone.nextInt();
		int b = 0;
		for (int k : unit) {
			int a = i/k;
			System.out.println(unit[b]+"�� ¥��: "+a+"��");
			i = i % unit[b];
			b = b + 1;
		}
		scannerone.close();
		
	}
}
