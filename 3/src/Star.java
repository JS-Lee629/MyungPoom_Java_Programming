import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		
		System.out.print("������ �Է��Ͻÿ�>> ");
		Scanner scannerone = new Scanner(System.in);
		int n = scannerone.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=i; j<=n; j++) {
				String s = "*";	
				System.out.print(s);
			}
			System.out.print("\n");
		}
		scannerone.close();
		
	}
}
