import java.util.Scanner;

public class SpringSummerFallWinter {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>> ");
		int i = scanner.nextInt();
		if (i <= 0)
			System.out.println("잘못입력");
		else if (i <= 3 ) 
			System.out.println("봄");
		else if (i <= 6)
			System.out.println("여름");
		else if (i <= 9)
			System.out.println("가을");
		else if (i <= 12)
			System.out.println("겨울");
		else 
			System.out.println("잘못입력");
		scanner.close();
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("달을 입력하세요(1~12)>> ");
//		int i = scanner.nextInt();
//		switch (i) {
//			case 1:
//			case 2:
//			case 3:
//				System.out.println("봄"); break;
//			case 4:
//			case 5:
//			case 6:
//				System.out.println("여름"); break;
//			case 7:
//			case 8:
//			case 9:
//				System.out.println("가을"); break;
//			case 10:
//			case 11:
//			case 12:
//				System.out.println("겨울"); break;
//			default:
//				System.out.println("잘못입력");
//		}
		
		scanner.close();
		
	}
}
