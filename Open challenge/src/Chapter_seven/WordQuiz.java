package Chapter_seven;

import java.util.*;

public class WordQuiz {
	public static void main(String args[]) {
		Vector<Word> v = new Vector<Word>();
		v.add(new Word("sculpture", "������"));
		v.add(new Word("love", "���"));
		v.add(new Word("animal", "����"));
		v.add(new Word("bear", "��"));
		v.add(new Word("eye", "��"));
		v.add(new Word("picture", "����"));
		v.add(new Word("society", "��ȸ"));
		v.add(new Word("human", "�ΰ�"));
		v.add(new Word("doll", "����"));
		v.add(new Word("emotion", "����"));
		v.add(new Word("baby", "�Ʊ�"));
		v.add(new Word("error", "����"));
		v.add(new Word("example", "����"));
		v.add(new Word("drawing", "�׸�"));
		v.add(new Word("deal", "�ŷ�"));
		while (true) {
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();
			System.out.println("\"��ǰ����\"�� �ܾ� �׽�Ʈ�� �����մϴ�.");
			System.out.print("1�� �Է��ϸ� �����մϴ�. 0�� �Է��ϸ� �ɼ�. -1�� �Է��ϸ� �����մϴ�. >> ");
			try { 
				int choice = scanner.nextInt(); 
				if (choice == 1) {
					while (true) {
						int a = random.nextInt(v.size());
						String A = v.get(a).open(); 
						int w1 = random.nextInt(v.size());			
						if (w1 == a) w1 = random.nextInt(v.size());
						String W1 = v.get(w1).open();
						int w2 = random.nextInt(v.size());
						if (w2 == a) w2 = random.nextInt(v.size());
						if (w2 == w1) w2 = random.nextInt(v.size());
						String W2 = v.get(w2).open();
						int w3 = random.nextInt(v.size());
						if (w3 == a) w3 = random.nextInt(v.size());
						if (w3 == w1) w3 = random.nextInt(v.size());
						if (w3 == w2) w3 = random.nextInt(v.size());
						String W3 = v.get(w3).open();
						HashMap<Integer, String> hashmap = new HashMap<Integer, String>(4);
						int n = random.nextInt(4);
						hashmap.put(n, A);
						if (n==0) { hashmap.put(1, W1); hashmap.put(2, W2); hashmap.put(3, W3); }
						if (n==1) { hashmap.put(0, W1); hashmap.put(2, W2); hashmap.put(3, W3); }
						if (n==2) { hashmap.put(1, W1); hashmap.put(0, W2); hashmap.put(3, W3); }
						if (n==3) { hashmap.put(1, W1); hashmap.put(2, W2); hashmap.put(0, W3); }
						System.out.println(v.get(a).check() + "?");
						for (int i=0; i<4; i++) {
							int j = i+1;
							System.out.print(" (" + j + ")"+ hashmap.get(i)); 
						}
						System.out.print(" >> ");
						int ans = scanner.nextInt();
						if (ans == -1) { scanner.close(); return; }
						else if (ans == 0) { break;	}
						else if (ans == 1) {
							if (hashmap.get(ans-1).equals(A)) System.out.println("Excellent !!");
							else System.out.println("No !!");
						}
						else if (ans == 2) {
							if (hashmap.get(ans-1).equals(A)) System.out.println("Excellent !!");
							else System.out.println("No !!");
						}
						else if (ans == 3) {
							if (hashmap.get(ans-1).equals(A)) System.out.println("Excellent !!");
							else System.out.println("No !!");
						}
						else System.out.println("No !!");
					}	
				}
				else if (choice == 0) {
					int wnum;
					do {
						System.out.println("�ɼ�");
						System.out.print("(1): �ܾ� ���� (2): �ܾ� ���� (3) �ܾ� ��ȸ (4) ���� >> ");
						wnum = scanner.nextInt();
						if (wnum == 1) {
							System.out.print("������ �ܾ �Է��ϼ���.. >> ");
							String neng = scanner.next();
							System.out.print("���� �Է��ϼ���.. >> ");
							String nkor = scanner.next();
							v.add(new Word(neng, nkor));
							System.out.println("����Ǿ����ϴ�..");
						}
						if (wnum == 2) {
							System.out.print("������ �ܾ �Է��ϼ���.. >> ");
							String weng = scanner.next();
							boolean deleted = false;
							for (int x=0; x<v.size(); x++) {
								if (weng == v.get(x).check()) {
									v.remove(x);
									deleted = true;
								}
							}
							if (deleted == false) System.out.println(weng + " ��(��) ���� �ܾ��Դϴ�.");
							if (deleted == true)  System.out.println("�����Ǿ����ϴ�..");
						}
						if (wnum == 3) {
							System.out.println("���� " + v.size() + "���� �ܾ ��� �ֽ��ϴ�.");
							for (int y=0; y<v.size(); y++) {
								System.out.println(v.get(y).eng + "   " + v.get(y).kor);
							}	
						}
						if (wnum == 4) {
							break;
						}
					} while (wnum>0 && wnum<5);
				}
				else if (choice == -1) break;
				else System.out.println("�ٽ� �Է����ּ���.");
			}
			catch (InputMismatchException e) { System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
}
