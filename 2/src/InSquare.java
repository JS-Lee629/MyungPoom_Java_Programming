import java.util.Scanner;

public class InSquare {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점 (x, y)의 좌표를 입력하시오>> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if ((x < 200 && x > 100) && (y < 200 && y > 100))
			System.out.println("(" + x + "," + y + ")는 사각형 안에 있습니다.");
		else 
			System.out.println("(" + x + "," + y + ")는 사각형 안에 없습니다.");
		scanner.close();
	}

}
