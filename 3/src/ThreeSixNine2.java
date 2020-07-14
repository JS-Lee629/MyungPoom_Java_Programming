public class ThreeSixNine2 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 100; i++ )
			if ((i/10 == 3) || (i/10 == 6) || (i/10 == 9))
				if ((i%10 == 3) || (i%10 == 6) || (i%10 == 9))
					System.out.println(i + " ¹Ú¼ö Â¦Â¦");
				else 
					System.out.println(i + " ¹Ú¼ö Â¦");
			else if (i%10 == 3)
				System.out.println(i + " ¹Ú¼ö Â¦");
			else if (i%10 == 6)
				System.out.println(i + " ¹Ú¼ö Â¦");
			else if (i%10 == 9)
				System.out.println(i + " ¹Ú¼ö Â¦");
			else
				System.out.println(i);
		
	}
}
