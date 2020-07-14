import java.util.Random;

public class Array_neo2D {
	public static void main(String[] args) {
		
		Random randone = new Random();
		Random randtwo = new Random();
		Random randthree = new Random();
		int[][] a = new int[4][4];
		for (int i=0; i<4; i++ ) {
			for (int j=0; j<4; j++) {
				a[i][j] = randone.nextInt(10) + 1;
			}
		}
		for (int k=0; k<6; k++) {
			int x = randtwo.nextInt(4);
			int y = randthree.nextInt(4);
			a[x][y] = 0;
		}
		for (int n=0; n<4; n++ ) {
			for (int m=0; m<4; m++) {
				System.out.print(a[n][m] + "\t");
			}
		System.out.println("\n");
		}
		
	}
}
