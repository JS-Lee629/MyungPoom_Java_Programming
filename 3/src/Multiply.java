import java.util.*;

public class Multiply {
	public static void main(String[] args) {
		
		while(true) {
			System.out.print("곱하고자 하는 두 수 입력>> ");
			Scanner scannerone = new Scanner(System.in);
			
			try {	
				int a = scannerone.nextInt();
				int b = scannerone.nextInt();

				System.out.println(a + "x" + b + "=" + a*b);
				scannerone.close();
				break;
			}
		
			catch (InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scannerone.nextLine();
				continue;
			}
		}
		
	}
}
