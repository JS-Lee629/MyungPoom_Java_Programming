import java.util.*;

public class RockPaperScissors {
	public static void main(String[] args) {
		
		while(true) {
			String[] option = {"����", "����", "��"};
			System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �սô�.");
			System.out.print("���� ���� ��!>> ");
			Scanner scannerone = new Scanner(System.in);
			String mine = scannerone.next();
			String quit = "�׸�";
			int n = (int)(Math.random()*3);
			String comp = option[n];
				
			if (option[0].equals(mine)) {
				if (option[0].equals(comp))
					System.out.println("����� = " + mine + ", ��ǻ�� = " + option[n] + ", �����ϴ�.");
				else if (option[1].equals(comp))
					System.out.println("����� = " + mine + ", ��ǻ�� = " + option[n] + ", ��ǻ�Ͱ� �̰���ϴ�.");
				else if (option[2].equals(comp))
					System.out.println("����� = " + mine + ", ��ǻ�� = " + option[n] + ", ����ڰ� �̰���ϴ�.");
			}
			
			else if (option[1].equals(mine)) {
				if (option[0].equals(comp)) 
					System.out.println("����� = " + mine + ", ��ǻ�� = " + option[n] + ", ����ڰ� �̰���ϴ�.");
				else if(option[1].equals(comp))
					System.out.println("����� = " + mine + ", ��ǻ�� = " + option[n] + ", �����ϴ�.");
				else if (option[2].equals(comp))
					System.out.println("����� = " + mine + ", ��ǻ�� = " + option[n] + ", ��ǻ�Ͱ� �̰���ϴ�.");
			}
			
			else if (option[2].equals(mine)) {
				if (option[0].equals(comp)) 
					System.out.println("����� = " + mine + ", ��ǻ�� = " + option[n] + ", ��ǻ�Ͱ� �̰���ϴ�.");
				else if (option[1].equals(comp))
					System.out.println("����� = " + mine + ", ��ǻ�� = " + option[n] + ", ����ڰ� �̰���ϴ�.");
				else if (option[2].equals(comp))
					System.out.println("����� = " + mine + ", ��ǻ�� = " + option[n] + ", �����ϴ�.");
			}
			
			else if (quit.equals(mine))
				scannerone.close();
				break;
			
		}
		
	}
}
