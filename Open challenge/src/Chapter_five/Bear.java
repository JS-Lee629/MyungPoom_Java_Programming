package Chapter_five;

import java.util.Scanner;

public class Bear extends GameObject {

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}
	protected String getShape() {
		String b = "B";
		return b;
	}
	protected void move() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����(a), �Ʒ�(s), ��(d), ������(f) >> ");
		String dir = scanner.next();
		if (dir.equals("d")) { x = x-distance; }
		if (dir.equals("s")) { x = x+distance; }
		if (dir.equals("a")) { y = y-distance; }
		if (dir.equals("f")) { y = y+distance; }
	}
	
}
