import java.util.Scanner;
import java.lang.String;

public class CourseandGrade {
	public static void main(String[] args) {
		
		String[] course = {"Java", "C++", "HTML", "JS", "Android"};
		int[] score = {95, 88, 76, 62, 55};
		String quit = "�׸�";
		while (true) {
			System.out.print("���� �̸�>> ");
			Scanner scannerone = new Scanner(System.in);
			String crse = scannerone.next();
			if (course[0].equals(crse))
				System.out.println(crse + "�� ������ " + score[0]);
			else if (course[1].equals(crse))
				System.out.println(crse + "�� ������ " + score[1]);
			else if (course[2].equals(crse))
				System.out.println(crse + "�� ������ " + score[2]);
			else if (course[3].equals(crse))
				System.out.println(crse + "�� ������ " + score[3]);
			else if (course[4].equals(crse))
				System.out.println(crse + "�� ������ " + score[4]);
			else if (quit.equals(crse))
				scannerone.close();
				break;
		}
		
	}
}
