import java.util.Scanner;

public class SpringSummerFallWinter {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1~12)>> ");
		int i = scanner.nextInt();
		if (i <= 0)
			System.out.println("�߸��Է�");
		else if (i <= 3 ) 
			System.out.println("��");
		else if (i <= 6)
			System.out.println("����");
		else if (i <= 9)
			System.out.println("����");
		else if (i <= 12)
			System.out.println("�ܿ�");
		else 
			System.out.println("�߸��Է�");
		scanner.close();
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("���� �Է��ϼ���(1~12)>> ");
//		int i = scanner.nextInt();
//		switch (i) {
//			case 1:
//			case 2:
//			case 3:
//				System.out.println("��"); break;
//			case 4:
//			case 5:
//			case 6:
//				System.out.println("����"); break;
//			case 7:
//			case 8:
//			case 9:
//				System.out.println("����"); break;
//			case 10:
//			case 11:
//			case 12:
//				System.out.println("�ܿ�"); break;
//			default:
//				System.out.println("�߸��Է�");
//		}
		
		scanner.close();
		
	}
}
