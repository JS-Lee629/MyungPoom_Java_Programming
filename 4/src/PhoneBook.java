import java.util.*;

public class PhoneBook {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수>> ");
		int n = scanner.nextInt();
		Phone phone[] = new Phone[n];
		for (int i=0; i<n; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>> ");
			String name = scanner.next();
			String tel = scanner.next();
			phone[i]= new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		while (true) {
			System.out.print("검색할 이름>> ");
			String name = scanner.next();
			boolean is_name = false;
			if (name.equals("그만")) {
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
				System.out.println(name + " 이 없습니다");
			}
		}
		
	}
}

