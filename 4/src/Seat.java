import java.util.*;

public class Seat {

	static String[] S = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	static String[] A = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	static String[] B = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	
	static void res() {
		Scanner scannerone = new Scanner(System.in);
		Scanner scannertwo = new Scanner(System.in);
		System.out.print("좌석구분 S(1), A(2), B(3)>> ");
		int cn = scannerone.nextInt();
		if (cn==1) {
			System.out.print("S>> ");
			for (int i=0; i<S.length; i++) System.out.print(" "+S[i]+" ");
			System.out.print("\n이름>> ");
			String name = scannertwo.next();
			System.out.print("번호>> ");
			int sn = scannertwo.nextInt();
			try { S[sn-1] = name; }
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("없는 번호입니다. 다시 시도해주세요.");
			}
		}
		else if (cn==2) {
			System.out.print("A>> ");
			for (int i=0; i<S.length; i++) System.out.print(" "+A[i]+" ");
			System.out.print("\n이름>> ");
			String name = scannertwo.next();
			System.out.print("번호>> ");
			int sn = scannertwo.nextInt();
			try { A[sn-1] = name; }
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("없는 번호입니다. 다시 시도해주세요.");
			} 
		}
		else if (cn==3) {
			System.out.print("B>> ");
			for (int i=0; i<S.length; i++) System.out.print(" "+B[i]+" ");
			System.out.print("\n이름>> ");
			String name = scannertwo.next();
			System.out.print("번호>> ");
			int sn = scannertwo.nextInt();
			try { B[sn-1] = name; }
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("없는 번호입니다. 다시 시도해주세요.");
			}
		}
		else {
			System.out.println("없는 좌석입니다. 다시 시도해주세요.");
		}
	}
	
	static void lup() {
		System.out.print("S>> ");
		for (int i=0; i<S.length; i++) System.out.print(" "+S[i]+" ");
		System.out.print("\nA>> ");
		for (int i=0; i<S.length; i++) System.out.print(" "+A[i]+" ");
		System.out.print("\nB>> ");
		for (int i=0; i<S.length; i++) System.out.print(" "+B[i]+" ");
		System.out.println("\n<<<조회를 완료하였습니다.>>>");
	}
	
	static void ccl() {
		Scanner scannerthree = new Scanner(System.in);
		System.out.print("좌석 S:1, A:2, B:3>> ");
		int sc = scannerthree.nextInt();
		if (sc==1) {
			System.out.print("S>> ");
			for (int i=0; i<S.length; i++) System.out.print(" "+S[i]+" ");
			System.out.print("\n이름>> ");
			String cname = scannerthree.next();
			boolean is_cname = false;
			for (int j=1; j<S.length; j++) {
				if (cname.equals(S[j])) {
					S[j] = "---";
					is_cname = true;
				}
			}
			if (is_cname==false) 
				System.out.println("없는 이름입니다. 다시 시도해주세요.");
		}
		else if (sc==2) {
			System.out.print("A>> ");
			for (int i=0; i<A.length; i++) System.out.print(" "+A[i]+" ");
			System.out.print("\n이름>> ");
			String cname = scannerthree.next();
			boolean is_cname = false;
			for (int j=1; j<S.length; j++) {
				if (cname.equals(A[j])) {
					A[j] = "---";
					is_cname = true;
				}
			}
			if (is_cname==false) 
				System.out.println("없는 이름입니다. 다시 시도해주세요.");
		}
		else if (sc==3) {
			System.out.print("B>> ");
			for (int i=0; i<B.length; i++) System.out.print(" "+B[i]+" ");
			System.out.print("\n이름>> ");
			String cname = scannerthree.next();
			boolean is_cname = false;
			for (int j=1; j<S.length; j++) {
				if (cname.equals(B[j])) {
					B[j] = "---";
					is_cname = true;
				}
			}
			if (is_cname==false) 
				System.out.println("없는 이름입니다. 다시 시도해주세요.");
		}
		else
			System.out.println("없는 좌석입니다. 다시 시도해주세요.");
	}	
}
