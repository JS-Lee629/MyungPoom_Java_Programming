package Chapter_four;

import java.util.Scanner;

public class WordGameApp {
	
	public static void main(String[] args) {
		

		boolean game = true;
		int i = 0;
		char ans = 'y';
		
		while (ans != 'n') {
			System.out.println("�����ձ� ������ �����մϴ�...");
			System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>> ");
			Scanner scannertwo = new Scanner(System.in);
			int pn = scannertwo.nextInt();
			
			Player[] P;
			P = new Player[pn];
			String startWord="�ƹ���";
			String inputWord;
			String urName;
			
			for (int j=0; j<pn; j++) {
				
				System.out.print("�������� �̸��� �Է��ϼ���>> ");
				Scanner scannerone = new Scanner(System.in);
				urName = scannerone.next();
				P[j] = new Player(urName);
			}
			
			System.out.println("�����ϴ� �ܾ�� "+startWord+" �Դϴ�");
			while (game) {
				
				if (i>pn || i==pn) 
					i=0;
			
				System.out.print(P[i].name+">> ");
				inputWord=P[i].getWordFromUser();
				game=P[i].checkSuccess(startWord);
				startWord=inputWord;
				i++;
			
			}
			
			System.out.println(P[i-1].name + "���� �й��Ͽ����ϴ�.");
			System.out.print("�ٽ� �Ͻðڽ��ϱ�?(y/n)>> ");
			Scanner scannerthree = new Scanner(System.in);
			ans = scannerthree.next().charAt(0);
		}
		
		
	}
}



