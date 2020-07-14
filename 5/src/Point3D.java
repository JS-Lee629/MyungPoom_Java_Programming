public class Point3D extends Point {
	private int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	protected void moveUp() {
		this.z = z+1;
	}
	protected void moveDown() {
		this.z = z-1;
	}
	protected void move(int x, int y, int z) {
		super.x = x;
		super.y = y;
		this.z = z;
	}
	public String toString() {
		return "(" + x + "," + y + "," + z + ")�� ��";
	}
	public static void main (String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.moveUp();
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString() + "�Դϴ�.");
	}
}