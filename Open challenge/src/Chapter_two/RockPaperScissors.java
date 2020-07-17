package Chapter_two;

import java.util.*;

public class RockPaperScissors {
	
//	public static void main (String[] args) {
//		
//		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
//		Random random = new Random();
//		int m = random.nextInt(3);
//		int n = random.nextInt(3);
//		String choose[] = {"가위", "바위", "보"};
//		String var1 = choose[m];
//		String var2 = choose[n];
//		System.out.println("철수 >> " + var1);
//		System.out.println("영희 >> " + var2);
//		if (m==0) {
//			if (n==1) System.out.println("영희가 이겼습니다.");
//			else if (n==2) System.out.println("철수가 이겼습니다.");
//			else System.out.println("비겼습니다.");
//		}
//		if (m==1) {
//			if (n==0) System.out.println("철수가 이겼습니다.");
//			else if (n==2) System.out.println("영희가 이겼습니다");
//			else System.out.println("비겼습니다.");
//		}
//		if (m==2) {
//			if (n==0) System.out.println("영희가 이겼습니다.");
//			else if (n==1) System.out.println("철수가 이겼습니다.");
//			else System.out.println("비겼습니다.");
//		}
//		
//	}
	
	public static void main (String[] args) {
		
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		Scanner scanner = new Scanner(System.in);
		System.out.print("철수 >> ");
		String m = scanner.next();
		System.out.print("영희 >> ");
		String n = scanner.next();
		if (m.equals("가위")) {
			if (n.equals("바위")) System.out.println("영희가 이겼습니다.");
			else if (n.equals("보")) System.out.println("철수가 이겼습니다.");
			else System.out.println("비겼습니다.");
		}
		if (m.equals("바위")) {
			if (n.equals("가위")) System.out.println("철수가 이겼습니다.");
			else if (n.equals("보")) System.out.println("영희가 이겼습니다.");
			else System.out.println("비겼습니다.");
		}
		if (m.equals("보")) {
			if (n.equals("가위")) System.out.println("영희가 이겼습니다.");
			else if (n.equals("바위")) System.out.println("철수가 이겼습니다.");
			else System.out.println("비겼습니다.");
		}
		scanner.close();
		
	}
}
