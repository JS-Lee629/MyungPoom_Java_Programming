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
		
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while(true) {
			
		System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
		int choose = scanner.nextInt();
		
			if (choose == 1) {this.input();}
			if (choose == 2) {this.view();}
			if (choose == 3) {this.finish(); break;}
			
		}
		
	}
	
	public void input() {
		
		System.out.print("날짜(1-" + n + ")? ");
		int date = scanner.nextInt();
		System.out.print("할일(빈칸없이입력)? ");
		schedule[date-1].set(scanner.next());
		
	}
	
	public void view() {
		
		System.out.print("날짜(1-" + n + ")? ");
		int date = scanner.nextInt();
		System.out.print(date + "일의 할일은 ");
		schedule[date-1].show();
		
	}		
	
	public void finish() {
		
		System.out.print("프로그램을 종료합니다.");
		
	}
		
	public static void main(String[] args) {
		
		MonthSchedule july = new MonthSchedule(31);
		july.run();
		
	}
	
}
