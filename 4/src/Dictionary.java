public class Dictionary {

	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };
	public static void kor2eng(String word) {
		boolean is_word = false;
		for (int i=0; i<kor.length; i++) {
			if (word.equals(kor[i])) {
				is_word = true;
				System.out.println(kor[i] + "는(은) " + eng[i]);
			}
		}
		if (is_word == false) System.out.println(word + "는(은) 저의 사전에 없습니다.");;
	}
	
}
