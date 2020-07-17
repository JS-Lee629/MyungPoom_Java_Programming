package Chapter_three;

import java.util.Scanner;
import java.util.Random;

public class UpDown {
	public static void main(String[] args) {
		
		char ans = 'y';
		while (ans != 'n') {
			int i = -1;
			int n = 1;
			Random random = new Random();
			int j = random.nextInt(99);
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			System.out.println("0-99");
			do {

				Scanner scannerone = new Scanner(System.in);

				i = scannerone.nextInt();

				System.out.print(n+">>");
			
				if (i<j) 
					System.out.println("더 높게");
			
				if (i>j) 
					System.out.println("더 낮게");
			
				if (i==j)
					break;
			
				n++;
			
			} while(i!=j);
			System.out.println("맞았습니다.");
			System.out.print("다시하시겠습니까(y/n)>> ");
			Scanner scannertwo = new Scanner(System.in);
			ans = scannertwo.next().charAt(0);
			if (ans == 'n') break;
		}
	
	}
}