import java.util.*;

public class RockPaperScissors_vsCOM {
	Scanner scanner = new Scanner(System.in);
	String name;
	int score = 0;
	public void player() {
		System.out.print("�÷��̾� �̸��� �Է��ϼ���: ");
		String name = scanner.next();
		this.name = name;
	}
	public void run() {
		while (true) {
			System.out.println(name + "�� ����: " + score);
			System.out.print(name + "[����(1), ����(2), ��(3), ���(4)]>> ");
			int player_choice = scanner.nextInt();
			int com_choice = (int)(Math.random()*3 + 1);
			System.out.println(name + show(player_choice) + " : ��ǻ��" + show(com_choice));
			switch (player_choice) {
			case 1 :
				if (com_choice==1) { tie(); break; }
				if (com_choice==2) { lose(); break; }
				if (com_choice==3) { win(); break; }
			case 2 :
				if (com_choice==1) { win(); break; }
				if (com_choice==2) { tie(); break; }
				if (com_choice==3) { lose(); break; }
			case 3 :
				if (com_choice==1) { lose(); break; }
				if (com_choice==2) { win(); break; }
				if (com_choice==3) { tie(); break; }
			case 4 :
				return;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		}
	}
	public String show(int n) {
		if (n==1) return "(����)";
		else if (n==2) return "(����)";
		else if (n==3) return "(��)";
		else return "???";
	}
	public void win() { System.out.println("Win!!"); score++; }
	public void lose() { System.out.println("Lose.."); score--;}
	public void tie() { System.out.println("Tie"); }
	public static void main(String args[]) {
		RockPaperScissors_vsCOM game = new RockPaperScissors_vsCOM();
		game.player();
		game.run();
	}
}
