public class PositivePoint extends Point {
	public PositivePoint() {
		super();
	}
	public PositivePoint(int x, int y) {
		if (x>0 && y>0) { super.x = x; super.y = y; }
	}
	public String toString() {
		return "(" + x + "," + y + ")�� ��";
	}
	protected void move(int x, int y) {
		if (x>0 && y>0) {
			super.x = x;
			super.y = y;
		}
	}
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(-5, 5);
		System.out.println(p.toString() + "�Դϴ�.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "�Դϴ�.");
	}
}
