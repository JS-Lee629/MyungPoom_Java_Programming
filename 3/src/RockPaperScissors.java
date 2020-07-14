import java.util.*;

public class RockPaperScissors {
	public static void main(String[] args) {
		
		while(true) {
			String[] option = {"가위", "바위", "보"};
			System.out.println("컴퓨터와 가위 바위 보 게임을 합시다.");
			System.out.print("가위 바위 보!>> ");
			Scanner scannerone = new Scanner(System.in);
			String mine = scannerone.next();
			String quit = "그만";
			int n = (int)(Math.random()*3);
			String comp = option[n];
				
			if (option[0].equals(mine)) {
				if (option[0].equals(comp))
					System.out.println("사용자 = " + mine + ", 컴퓨터 = " + option[n] + ", 비겼습니다.");
				else if (option[1].equals(comp))
					System.out.println("사용자 = " + mine + ", 컴퓨터 = " + option[n] + ", 컴퓨터가 이겼습니다.");
				else if (option[2].equals(comp))
					System.out.println("사용자 = " + mine + ", 컴퓨터 = " + option[n] + ", 사용자가 이겼습니다.");
			}
			
			else if (option[1].equals(mine)) {
				if (option[0].equals(comp)) 
					System.out.println("사용자 = " + mine + ", 컴퓨터 = " + option[n] + ", 사용자가 이겼습니다.");
				else if(option[1].equals(comp))
					System.out.println("사용자 = " + mine + ", 컴퓨터 = " + option[n] + ", 비겼습니다.");
				else if (option[2].equals(comp))
					System.out.println("사용자 = " + mine + ", 컴퓨터 = " + option[n] + ", 컴퓨터가 이겼습니다.");
			}
			
			else if (option[2].equals(mine)) {
				if (option[0].equals(comp)) 
					System.out.println("사용자 = " + mine + ", 컴퓨터 = " + option[n] + ", 컴퓨터가 이겼습니다.");
				else if (option[1].equals(comp))
					System.out.println("사용자 = " + mine + ", 컴퓨터 = " + option[n] + ", 사용자가 이겼습니다.");
				else if (option[2].equals(comp))
					System.out.println("사용자 = " + mine + ", 컴퓨터 = " + option[n] + ", 비겼습니다.");
			}
			
			else if (quit.equals(mine))
				scannerone.close();
				break;
			
		}
		
	}
}
