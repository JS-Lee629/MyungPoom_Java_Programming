import java.util.*;

public class TenSeconds {
	public static void main(String args[]) {
		Scanner scannerone = new Scanner(System.in);
		System.out.print("�÷��̾� ���� �Է��ϼ���>> ");
		int n = scannerone.nextInt();
		String player[] = new String[n];
		String winner = player[0];
		int ans[] = new int[n];
		int record = 10;
		for (int i=0; i<n; i++) {
			System.out.print("�÷��̾� �̸��� �Է��ϼ���>> ");
			String name = scannerone.next();
			player[i] = name;
		}
		Scanner scannertwo = new Scanner(System.in);
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");		
		for (int j=0; j<player.length; j++) {
			System.out.print(player[j] + " ���� <Enter>Ű>> ");
			scannertwo.nextLine();
			Calendar cal_a = Calendar.getInstance();
			int a = cal_a.get(Calendar.SECOND);
			System.out.println("	���� �� �ð� = " + a);
			System.out.print("10�� ���� �� <Ener>Ű>> ") ;
			scannertwo.nextLine();
			Calendar cal_b = Calendar.getInstance();
			int b = cal_b.get(Calendar.SECOND);
			System.out.println("	���� �� �ð� = " + b);
			ans[j] = (int)(cal_b.getTimeInMillis() - cal_a.getTimeInMillis())/1000;
			int c = 10 - ans[j];
			if (Math.abs(c) < record) {
				record = Math.abs(c);
				winner = player[j];
			}
		}
		for (int k=0; k<player.length; k++) {
			System.out.println(player[k] + "�� ��� " + ans[k]);
		}
		System.out.println("���ڴ� " + winner);
		scannerone.close();
		scannertwo.close();
	}
}
