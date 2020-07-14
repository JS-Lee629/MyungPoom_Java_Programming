import java.util.Scanner;

public class SameSame {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>> ");
		int i = scanner.nextInt();
		if (i/10==i%10) 
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else 
			System.out.println("10의 자리와 1의 자리가 같지 않습니다.");
		scanner.close();
		
	}
}
