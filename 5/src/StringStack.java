public class StringStack implements Stack {
	private int index;
	private String[] elements;
	public StringStack(int capacity) {
		elements = new String[capacity];
		index = 0;
	}
	public int length() {
		return index;
	}
	public int capacity() {
		return elements.length;
	}
	public String pop() {
		if (index == 0) return null;
		index--;
		return elements[index];
	}
	public boolean push(String val) {
		if (index == elements.length) return false;
		elements[index++] = val;
		return true;
	}
}
