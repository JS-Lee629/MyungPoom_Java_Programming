import java.util.Calendar;

public class Clock {
	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
		int hourofday = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		System.out.println("���� �ð��� " + hourofday + "�� " + minute + "���Դϴ�.");
		if (hourofday >= 6 && hourofday < 12)
			System.out.println("Good Morning");
		else if (hourofday >= 12 && hourofday < 18)
			System.out.println("Good Afternoon");
		else if (hourofday >= 18 && hourofday < 24)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	}
}
