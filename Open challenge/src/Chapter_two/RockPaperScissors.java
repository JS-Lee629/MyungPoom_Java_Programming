package Chapter_two;

import java.util.*;

public class RockPaperScissors {
	
//	public static void main (String[] args) {
//		
//		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
//		Random random = new Random();
//		int m = random.nextInt(3);
//		int n = random.nextInt(3);
//		String choose[] = {"����", "����", "��"};
//		String var1 = choose[m];
//		String var2 = choose[n];
//		System.out.println("ö�� >> " + var1);
//		System.out.println("���� >> " + var2);
//		if (m==0) {
//			if (n==1) System.out.println("���� �̰���ϴ�.");
//			else if (n==2) System.out.println("ö���� �̰���ϴ�.");
//			else System.out.println("�����ϴ�.");
//		}
//		if (m==1) {
//			if (n==0) System.out.println("ö���� �̰���ϴ�.");
//			else if (n==2) System.out.println("���� �̰���ϴ�");
//			else System.out.println("�����ϴ�.");
//		}
//		if (m==2) {
//			if (n==0) System.out.println("���� �̰���ϴ�.");
//			else if (n==1) System.out.println("ö���� �̰���ϴ�.");
//			else System.out.println("�����ϴ�.");
//		}
//		
//	}
	
	public static void main (String[] args) {
		
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		System.out.print("ö�� >> ");
		String m = scanner.next();
		System.out.print("���� >> ");
		String n = scanner.next();
		if (m.equals("����")) {
			if (n.equals("����")) System.out.println("���� �̰���ϴ�.");
			else if (n.equals("��")) System.out.println("ö���� �̰���ϴ�.");
			else System.out.println("�����ϴ�.");
		}
		if (m.equals("����")) {
			if (n.equals("����")) System.out.println("ö���� �̰���ϴ�.");
			else if (n.equals("��")) System.out.println("���� �̰���ϴ�.");
			else System.out.println("�����ϴ�.");
		}
		if (m.equals("��")) {
			if (n.equals("����")) System.out.println("���� �̰���ϴ�.");
			else if (n.equals("����")) System.out.println("ö���� �̰���ϴ�.");
			else System.out.println("�����ϴ�.");
		}
		scanner.close();
		
	}
}
