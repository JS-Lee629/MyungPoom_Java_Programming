import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>> ");
		int i = scanner.nextInt();
		if ((i/10 == 3) || (i/10 == 6) || (i/10 == 9))
			if ((i%10 == 3) || (i%10 == 6) || (i%10 == 9))
				System.out.println("박수짝짝");
			else 
				System.out.println("박수짝");
		else if (i%10 == 3)
			System.out.println("박수짝");
		else if (i%10 == 6)
			System.out.println("박수짝");
		else if (i%10 == 9)
			System.out.println("박수짝");
		else
			System.out.println(i);
		scanner.close();
		
	}
}

