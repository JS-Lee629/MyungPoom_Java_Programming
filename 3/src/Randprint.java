import java.util.Random;
import java.util.Scanner;

public class Randprint {
	public static void main(String[] args) {
		
		Scanner scannerone = new Scanner(System.in);
		Random randone = new Random();
		System.out.print("정수 몇개? ");
		int i = scannerone.nextInt();
		int a[] = new int[i];
		for (int r : a) {
			int x = randone.nextInt(100)+1;
			a[r] = x;
			System.out.print(x+" ");
		}
		scannerone.close();
		
	}
}
