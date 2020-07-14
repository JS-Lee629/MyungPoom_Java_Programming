import java.util.Scanner;

public class InSquare2 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, 
			int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 점 (x1, y1),(x2, y2)를 입력하시오>> ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		if (inRect(x1, y1, 100, 100, 200, 200)==true || 
				inRect(x2, y2, 100, 100, 200, 200)==true)
			System.out.println("두 사각형이 충돌합니다");
		else
			System.out.println("두 사각형이 충돌하지 않습니다");
		scanner.close();	
				
	}
}
