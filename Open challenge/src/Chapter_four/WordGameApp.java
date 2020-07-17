package Chapter_four;

import java.util.Scanner;

public class WordGameApp {
	
	public static void main(String[] args) {
		

		boolean game = true;
		int i = 0;
		char ans = 'y';
		
		while (ans != 'n') {
			System.out.println("끝말잇기 게임을 시작합니다...");
			System.out.print("게임에 참가하는 인원은 몇명입니까>> ");
			Scanner scannertwo = new Scanner(System.in);
			int pn = scannertwo.nextInt();
			
			Player[] P;
			P = new Player[pn];
			String startWord="아버지";
			String inputWord;
			String urName;
			
			for (int j=0; j<pn; j++) {
				
				System.out.print("참가자의 이름을 입력하세요>> ");
				Scanner scannerone = new Scanner(System.in);
				urName = scannerone.next();
				P[j] = new Player(urName);
			}
			
			System.out.println("시작하는 단어는 "+startWord+" 입니다");
			while (game) {
				
				if (i>pn || i==pn) 
					i=0;
			
				System.out.print(P[i].name+">> ");
				inputWord=P[i].getWordFromUser();
				game=P[i].checkSuccess(startWord);
				startWord=inputWord;
				i++;
			
			}
			
			System.out.println(P[i-1].name + "님은 패배하였습니다.");
			System.out.print("다시 하시겠습니까?(y/n)>> ");
			Scanner scannerthree = new Scanner(System.in);
			ans = scannerthree.next().charAt(0);
		}
		
		
	}
}



