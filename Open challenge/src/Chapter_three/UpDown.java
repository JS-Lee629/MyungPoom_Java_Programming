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
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
			System.out.println("0-99");
			do {

				Scanner scannerone = new Scanner(System.in);

				i = scannerone.nextInt();

				System.out.print(n+">>");
			
				if (i<j) 
					System.out.println("�� ����");
			
				if (i>j) 
					System.out.println("�� ����");
			
				if (i==j)
					break;
			
				n++;
			
			} while(i!=j);
			System.out.println("�¾ҽ��ϴ�.");
			System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>> ");
			Scanner scannertwo = new Scanner(System.in);
			ans = scannertwo.next().charAt(0);
			if (ans == 'n') break;
		}
	
	}
}