public class ColorTV extends TV {
	
	private int color;
	public ColorTV (int size, int color) {
		super(size);
		this.color = color;
	}
	protected int getColor() { return color; }
	void printProperty() {
		System.out.print(getSize() + "��ġ " + getColor() + "�÷�");
	}
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
	
}
