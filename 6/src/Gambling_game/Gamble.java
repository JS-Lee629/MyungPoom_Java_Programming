package Gambling_game;

import java.util.Scanner;
import java.util.Random;

public class Gamble {
	public static void main(String args[]) {
		System.out.print("겜블링 게임에 참여할 선수 수>> ");
		Scanner scannerone = new Scanner(System.in);
		int num = scannerone.nextInt();
		Person p[] = new Person[num];
		for (int i=0; i<p.length; i++) {
			int j = i+1;
			System.out.print(j + "번째 선수 이름>> ");
			String myname = scannerone.next();
			p[i] = new Person(myname);
		}
		Scanner scannertwo = new Scanner(System.in);
		while (true) {
			int i;
			for (i=0; i<p.length; i++) {
				System.out.print(p[i].name + ":");
				scannertwo.nextLine();
				Random random = new Random();
				int a = random.nextInt(3);
				int b = random.nextInt(3);
				int c = random.nextInt(3);
				System.out.print("	" + a + "   " + b + "   " + c);
				if (a==b && a==c) {
					System.out.println("   " + p[i].name + "님이 이겼습니다!");
					scannerone.close();
					scannertwo.close();
					return;
				}
				else 
					System.out.println("   아쉽군요!");
			}
			if (i==p.length-1) i=0;
		}
	}
}
