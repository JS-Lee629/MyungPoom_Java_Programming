import java.util.Scanner;

public class Withdraw {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		int i = scanner.nextInt();
		int a = i/50000;
		System.out.println("�������� " + a + "��");
		i = i - 50000*a;
		int b = i/10000;
		System.out.println("������ " + b + "��");
		i = i - 10000*b;
		int c = i/5000;
		System.out.println("��õ���� " + c + "��");
		i = i - 5000*c;
		int d = i/1000;
		System.out.println("õ���� " + d + "��");
		i = i - 1000*d;
		int e = i/500;
		System.out.println("����� " + e + "��");
		i = i - 500*e;
		int f = i/100;
		System.out.println("��� " + f + "��");
		i = i - 100*f;
		int g = i/50;
		System.out.println("���ʿ� " + g + "��");
		i = i - 50*g;
		int h = i/10;
		System.out.println("�ʿ� " + h + "��");
		scanner.close();
		
	}
}
