public class ArrayUtil {
	
	public static int[] concat(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		return c;
	}
	public static void print(int[] a) {
		System.out.print("[ ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
	}
	
}
