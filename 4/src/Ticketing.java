import java.util.*;

public class Ticketing {

	public static void main(String[] args) {
		
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >> ");
			int n = scanner.nextInt();
			if (n==1) { Seat.res(); }
			else if (n==2) { Seat.lup(); }
			else if (n==3) { Seat.ccl(); }
			else if (n==4) { scanner.close(); break; }
			else { System.out.println("���� �޴��Դϴ�. �ٽ� �õ����ּ���."); }
		}
		
	}
	
}
