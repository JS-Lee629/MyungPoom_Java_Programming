import java.util.*;

public class Ticketing {

	public static void main(String[] args) {
		
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
			int n = scanner.nextInt();
			if (n==1) { Seat.res(); }
			else if (n==2) { Seat.lup(); }
			else if (n==3) { Seat.ccl(); }
			else if (n==4) { scanner.close(); break; }
			else { System.out.println("없는 메뉴입니다. 다시 시도해주세요."); }
		}
		
	}
	
}
