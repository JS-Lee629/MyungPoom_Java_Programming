import java.util.*;

public class Multiply {
	public static void main(String[] args) {
		
		while(true) {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>> ");
			Scanner scannerone = new Scanner(System.in);
			
			try {	
				int a = scannerone.nextInt();
				int b = scannerone.nextInt();

				System.out.println(a + "x" + b + "=" + a*b);
				scannerone.close();
				break;
			}
		
			catch (InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scannerone.nextLine();
				continue;
			}
		}
		
	}
}
