public class Dictionary {

	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };
	public static void kor2eng(String word) {
		boolean is_word = false;
		for (int i=0; i<kor.length; i++) {
			if (word.equals(kor[i])) {
				is_word = true;
				System.out.println(kor[i] + "��(��) " + eng[i]);
			}
		}
		if (is_word == false) System.out.println(word + "��(��) ���� ������ �����ϴ�.");;
	}
	
}
