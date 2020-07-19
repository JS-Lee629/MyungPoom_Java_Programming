package Chapter_seven;

import java.util.*;

public class WordQuiz {
	public static void main(String args[]) {
		Vector<Word> v = new Vector<Word>();
		v.add(new Word("sculpture", "조각상"));
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("eye", "눈"));
		v.add(new Word("picture", "사진"));
		v.add(new Word("society", "사회"));
		v.add(new Word("human", "인간"));
		v.add(new Word("doll", "인형"));
		v.add(new Word("emotion", "감정"));
		v.add(new Word("baby", "아기"));
		v.add(new Word("error", "오류"));
		v.add(new Word("example", "보기"));
		v.add(new Word("drawing", "그림"));
		v.add(new Word("deal", "거래"));
		while (true) {
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();
			System.out.println("\"명품영어\"의 단어 테스트를 시작합니다.");
			System.out.print("1을 입력하면 시작합니다. 0을 입력하면 옵션. -1을 입력하면 종료합니다. >> ");
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
						System.out.println("옵션");
						System.out.print("(1): 단어 저장 (2): 단어 삭제 (3) 단어 조회 (4) 종료 >> ");
						wnum = scanner.nextInt();
						if (wnum == 1) {
							System.out.print("저장할 단어를 입력하세요.. >> ");
							String neng = scanner.next();
							System.out.print("뜻을 입력하세요.. >> ");
							String nkor = scanner.next();
							v.add(new Word(neng, nkor));
							System.out.println("저장되었습니다..");
						}
						if (wnum == 2) {
							System.out.print("삭제할 단어를 입력하세요.. >> ");
							String weng = scanner.next();
							boolean deleted = false;
							for (int x=0; x<v.size(); x++) {
								if (weng == v.get(x).check()) {
									v.remove(x);
									deleted = true;
								}
							}
							if (deleted == false) System.out.println(weng + " 는(은) 없는 단어입니다.");
							if (deleted == true)  System.out.println("삭제되었습니다..");
						}
						if (wnum == 3) {
							System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");
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
				else System.out.println("다시 입력해주세요.");
			}
			catch (InputMismatchException e) { System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
