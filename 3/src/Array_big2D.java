import java.util.Random;

public class Array_big2D {
	public static void main(String[] args) {
		
		Random randone = new Random();
		int[][] a = new int[4][4];
		for (int i=0; i<4; i++ ) {
			for (int j=0; j<4; j++) {
				a[i][j] = randone.nextInt(10) + 1;
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
	}
}
