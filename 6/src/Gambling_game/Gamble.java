package Gambling_game;

import java.util.Scanner;
import java.util.Random;

public class Gamble {
	public static void main(String args[]) {
		System.out.print("�׺� ���ӿ� ������ ���� ��>> ");
		Scanner scannerone = new Scanner(System.in);
		int num = scannerone.nextInt();
		Person p[] = new Person[num];
		for (int i=0; i<p.length; i++) {
			int j = i+1;
			System.out.print(j + "��° ���� �̸�>> ");
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
					System.out.println("   " + p[i].name + "���� �̰���ϴ�!");
					scannerone.close();
					scannertwo.close();
					return;
				}
				else 
					System.out.println("   �ƽ�����!");
			}
			if (i==p.length-1) i=0;
		}
	}
}
