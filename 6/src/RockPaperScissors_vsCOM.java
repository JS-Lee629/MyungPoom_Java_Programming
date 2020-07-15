import java.util.*;

public class RockPaperScissors_vsCOM {
	Scanner scanner = new Scanner(System.in);
	String name;
	int score = 0;
	public void player() {
		System.out.print("플레이어 이름을 입력하세요: ");
		String name = scanner.next();
		this.name = name;
	}
	public void run() {
		while (true) {
			System.out.println(name + "의 점수: " + score);
			System.out.print(name + "[가위(1), 바위(2), 보(3), 기권(4)]>> ");
			int player_choice = scanner.nextInt();
			int com_choice = (int)(Math.random()*3 + 1);
			System.out.println(name + show(player_choice) + " : 컴퓨터" + show(com_choice));
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
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	public String show(int n) {
		if (n==1) return "(가위)";
		else if (n==2) return "(바위)";
		else if (n==3) return "(보)";
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
