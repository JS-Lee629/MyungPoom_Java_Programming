import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		
		System.out.println("���� ���� 10���� �Է��Ͻÿ�>> ");
		Scanner scannerone = new Scanner(System.in);
		int a = scannerone.nextInt();
		int b = scannerone.nextInt();
		int c = scannerone.nextInt();
		int d = scannerone.nextInt();
		int e = scannerone.nextInt();
		int f = scannerone.nextInt();
		int g = scannerone.nextInt();
		int h = scannerone.nextInt();
		int i = scannerone.nextInt();
		int j = scannerone.nextInt();
		int[] k = {a,b,c,d,e,f,g,h,i,j};
		System.out.print("3�� �����");
		for (int tw : k) {
			if (tw%3==0)
				System.out.print(" "+tw);
		}
		scannerone.close();
		
	}
}
