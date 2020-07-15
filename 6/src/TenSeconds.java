import java.util.*;

public class TenSeconds {
	public static void main(String args[]) {
		Scanner scannerone = new Scanner(System.in);
		System.out.print("플레이어 수를 입력하세요>> ");
		int n = scannerone.nextInt();
		String player[] = new String[n];
		String winner = player[0];
		int ans[] = new int[n];
		int record = 10;
		for (int i=0; i<n; i++) {
			System.out.print("플레이어 이름을 입력하세요>> ");
			String name = scannerone.next();
			player[i] = name;
		}
		Scanner scannertwo = new Scanner(System.in);
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");		
		for (int j=0; j<player.length; j++) {
			System.out.print(player[j] + " 시작 <Enter>키>> ");
			scannertwo.nextLine();
			Calendar cal_a = Calendar.getInstance();
			int a = cal_a.get(Calendar.SECOND);
			System.out.println("	현재 초 시간 = " + a);
			System.out.print("10초 에상 후 <Ener>키>> ") ;
			scannertwo.nextLine();
			Calendar cal_b = Calendar.getInstance();
			int b = cal_b.get(Calendar.SECOND);
			System.out.println("	현재 초 시간 = " + b);
			ans[j] = (int)(cal_b.getTimeInMillis() - cal_a.getTimeInMillis())/1000;
			int c = 10 - ans[j];
			if (Math.abs(c) < record) {
				record = Math.abs(c);
				winner = player[j];
			}
		}
		for (int k=0; k<player.length; k++) {
			System.out.println(player[k] + "의 결과 " + ans[k]);
		}
		System.out.println("승자는 " + winner);
		scannerone.close();
		scannertwo.close();
	}
}
