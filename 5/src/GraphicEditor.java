import java.util.Scanner;

public class GraphicEditor {
	private Shape head, tail;
	private Scanner scanner;
	public GraphicEditor() {
		head = null;
		tail = null;
		scanner = new Scanner(System.in);
	}
	
	public void run() {
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
		while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: 
				System.out.print("Line(1), Rect(2), Circle(3)>> ");
				choice = scanner.nextInt();
				insert(choice);
				break;
			case 2:
				System.out.print("삭제할 도형의 위치>> ");
				choice = scanner.nextInt();
				delete(choice);
				break;
			case 3:
				show();
				break;
			case 4:
				System.out.println("beauty를 종료합니다.");
				scanner.close();
				return;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void insert(int choice) {
		Shape graphic = head;
		switch (choice) {
		case 1:
			graphic = new Line();
			break;
		case 2:
			graphic = new Rect();
			break;
		case 3:
			graphic = new Circle();
			break;
		default:
			System.out.println("다시 입력해주세요.");
			break;
		}
		if (head == null) { 
			head = graphic; 
			tail = graphic; 
		}
		else {
			tail.setNext(graphic);
			tail = graphic;
		}
	}
	
	public void delete(int choice) {
		Shape cur = head;
		Shape tmp = head;
		int i;
		if (choice == 1) {
			if (head == tail) {
				head = null;
				tail = null;
				return;
			}
			else {
				head = head.getNext();
				return;
			}
		}
		for (i=1; i<choice; i++) {
			tmp = cur;
			cur = cur.getNext();
			if (cur == null) {
				System.out.println("삭제할 수 없습니다.");
				return;
			}
		}
		if (i == choice) {
			tmp.setNext(cur.getNext());
			tail = tmp;
		}
		else 
			tmp.setNext(cur.getNext());	
	}

	public void show() {
		Shape graphic = head;
		while (graphic != null) {
			graphic.draw();
			graphic = graphic.getNext();
		}
	}
	
	public static void main(String[] args) {
		GraphicEditor editor = new GraphicEditor();
		editor.run();
	}
}
