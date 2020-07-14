import java.util.Scanner;

public class StackApp {
	
	public static void main (String[] args) {
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		StringStack stack = new StringStack(n);
		while (true) {
			System.out.print("���ڿ� �Է� >> ");
			String val = scanner.next();
			if (val.equals("�׸�")) break;
			if (!stack.push(val)) System.out.println("������ �� ���� Ǫ�� �Ұ�!");
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		for (int j=0; j<stack.capacity(); j++ ) {
			System.out.print(stack.pop() + " ");	
		}
		scanner.close();
	}

}
