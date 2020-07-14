public class Rectangle {

	int x;
	int y;
	int width;
	int height;
	
	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square() {
		int A = width * height;
		return A;
	}
	
	void show() {
		System.out.print("(" + x + "," + y + ")" 
				+ "���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
		
	}
	
	boolean contains(Rectangle a) {		
		if (this.x < a.x && this.y < a.y 
				&& this.width > a.width && this.height > a.height)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�");
	
	}
}
