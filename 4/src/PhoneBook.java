import java.util.*;

public class PhoneBook {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ο���>> ");
		int n = scanner.nextInt();
		Phone phone[] = new Phone[n];
		for (int i=0; i<n; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>> ");
			String name = scanner.next();
			String tel = scanner.next();
			phone[i]= new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		while (true) {
			System.out.print("�˻��� �̸�>> ");
			String name = scanner.next();
			boolean is_name = false;
			if (name.equals("�׸�")) {
				scanner.close(); 
				break;
			}
			for (int j=0; j<n; j++) {
				if (name.equals(phone[j].name)) { 
					phone[j].show();
					is_name = true;
				}
				
				}
			if (is_name == false) {
				System.out.println(name + " �� �����ϴ�");
			}
		}
		
	}
}

