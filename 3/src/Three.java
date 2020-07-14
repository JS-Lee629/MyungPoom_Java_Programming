import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		
		System.out.println("양의 정수 10개를 입력하시오>> ");
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
		System.out.print("3의 배수는");
		for (int tw : k) {
			if (tw%3==0)
				System.out.print(" "+tw);
		}
		scannerone.close();
		
	}
}
