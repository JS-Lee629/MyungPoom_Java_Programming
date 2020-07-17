package Chapter_five;

import java.util.*;

public class Game_BnF {

	public static void main(String[] args) {
		
		System.out.println("**Bear의 Fish 먹기 게임을 시작합니다.**");
		String[][] Board = new String[10][20];
		Random random = new Random();
		int a = random.nextInt(10);
		int b = random.nextInt(20);
		Bear bear = new Bear(0, 0, 1);
		Fish fish = new Fish(a, b, 1);
		
		while (true) {
			for (int i=0; i<Board.length; i++) {
				for (int j=0; j<Board[i].length; j++) {
					Board[i][j] = "-";
				}
			}
			try {
				Board[bear.getX()][bear.getY()] = bear.getShape();
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Bear Lost!!");
				break;
			}
			try {
				Board[fish.getX()][fish.getY()] = fish.getShape();
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Bear Lost!!");
				break;
			}
			for (int i=0; i<Board.length; i++) {
				for (int j=0; j<Board[i].length; j++) {
					System.out.print(Board[i][j]);
				}
				System.out.println();
			}
			bear.move();
			fish.move();
			bear = new Bear(bear.getX(), bear.getY(), 1);
			fish = new Fish(fish.getX(), fish.getY(), 1);
			if (bear.collide(fish) == true) {
				Board[fish.getX()][fish.getY()] = bear.getShape();
				Board[bear.getX()][bear.getY()] = "-";
				for (int i=0; i<Board.length; i++) {
					for (int j=0; j<Board[i].length; j++) {
						System.out.print(Board[i][j]);
					}
					System.out.println();
				}
				System.out.print("Bear Win!!");
				break;
			}
		}	
		
	}
	
}
