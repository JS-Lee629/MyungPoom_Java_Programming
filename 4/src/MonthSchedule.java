import java.util.*;

public class MonthSchedule {
	
	Scanner scanner = new Scanner(System.in);
	int choose;
	int n;
	int date;
	Day schedule[];
	
	public MonthSchedule(int n) { 
		
		this.n = n; 
		this.schedule = new Day[n];
		for (int i=0; i<n; i++) {
			this.schedule[i] = new Day();
		}
		
	}
	
	public void run() {
		
		System.out.println("�̹��� ������ ���� ���α׷�.");
		while(true) {
			
		System.out.print("����(�Է�:1, ����:2, ������:3) >> ");
		int choose = scanner.nextInt();
		
			if (choose == 1) {this.input();}
			if (choose == 2) {this.view();}
			if (choose == 3) {this.finish(); break;}
			
		}
		
	}
	
	public void input() {
		
		System.out.print("��¥(1-" + n + ")? ");
		int date = scanner.nextInt();
		System.out.print("����(��ĭ�����Է�)? ");
		schedule[date-1].set(scanner.next());
		
	}
	
	public void view() {
		
		System.out.print("��¥(1-" + n + ")? ");
		int date = scanner.nextInt();
		System.out.print(date + "���� ������ ");
		schedule[date-1].show();
		
	}		
	
	public void finish() {
		
		System.out.print("���α׷��� �����մϴ�.");
		
	}
		
	public static void main(String[] args) {
		
		MonthSchedule july = new MonthSchedule(31);
		july.run();
		
	}
	
}
