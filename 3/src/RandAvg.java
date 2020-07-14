import java.util.Random;

public class RandAvg {
	public static void main(String [] args) {
		
		Random randone = new Random();
		int a = randone.nextInt(10);
		int b = randone.nextInt(10);
		int c = randone.nextInt(10);
		int d = randone.nextInt(10);
		int e = randone.nextInt(10);
		int f = randone.nextInt(10);
		int g = randone.nextInt(10);
		int h = randone.nextInt(10);
		int i = randone.nextInt(10);
		int j = randone.nextInt(10);
		int[] k = {a,b,c,d,e,f,g,h,i,j};
		System.out.print("·£´ýÇÑ Á¤¼öµé :");
		for (int tw : k) {
			System.out.print(" "+tw);
		}
		System.out.println("");
		double avg = (a+b+c+d+e+f+g+h+i+j)/10;
		System.out.print("Æò±ÕÀº "+avg);
	}
}
