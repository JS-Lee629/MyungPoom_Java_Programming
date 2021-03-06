import java.util.Scanner;

public class StackApp {
	
	public static void main (String[] args) {
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		StringStack stack = new StringStack(n);
		while (true) {
			System.out.print("문자열 입력 >> ");
			String val = scanner.next();
			if (val.equals("그만")) break;
			if (!stack.push(val)) System.out.println("스택이 꽉 차서 푸시 불가!");
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for (int j=0; j<stack.capacity(); j++ ) {
			System.out.print(stack.pop() + " ");	
		}
		scanner.close();
	}

}
