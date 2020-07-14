public class ColorPoint extends Point {
	private String color;
	public ColorPoint() {
		super();
		this.color = "BLACK";
	}
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		super.x = x;
		super.y = y;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return color + "���� (" + x + "," + y + ")�� ��"; 
	}
	public static void main (String [] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "�Դϴ�.");
		
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "�Դϴ�.");
		
		cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "�Դϴ�.");
	}
}
	
