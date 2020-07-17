package Chapter_six;

import java.util.*;

public class Histogram {
	String readString() {
		System.out.println("영문 텍스트를 입력하고, 세미콜론을 입력하세요.");
		StringBuffer sb = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String line = scanner.nextLine();
			if(line.equals(";")) break;
			sb.append(line);
		}
		return sb.toString();
	}
	public static void main(String args[]) {
		Histogram histogram = new Histogram();
		String h_gram = histogram.readString();
		String H_gram = h_gram.toUpperCase();
		System.out.println("히스토그램을 그립니다.");
		String alphabat[] = {"A", "B", "C", "D", "E", "F", "G", "H",
							"I", "J", "K", "L", "M", "N", "O", "P", "Q",
							"R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		for (int sn=0; sn<H_gram.length(); sn++) {
			if (H_gram.charAt(sn) == 'A') { String a = alphabat[0].concat("-"); alphabat[0] = a; } 
			if (H_gram.charAt(sn) == 'B') { String b = alphabat[1].concat("-"); alphabat[1] = b; }
			if (H_gram.charAt(sn) == 'C') { String c = alphabat[2].concat("-"); alphabat[2] = c; }
			if (H_gram.charAt(sn) == 'D') { String d = alphabat[3].concat("-"); alphabat[3] = d; }
			if (H_gram.charAt(sn) == 'E') { String e = alphabat[4].concat("-"); alphabat[4] = e; }
			if (H_gram.charAt(sn) == 'F') { String f = alphabat[5].concat("-"); alphabat[5] = f; }
			if (H_gram.charAt(sn) == 'G') { String g = alphabat[6].concat("-"); alphabat[6] = g; }
			if (H_gram.charAt(sn) == 'H') { String h = alphabat[7].concat("-"); alphabat[7] = h; }
			if (H_gram.charAt(sn) == 'I') { String i = alphabat[8].concat("-"); alphabat[8] = i; }
			if (H_gram.charAt(sn) == 'J') { String j = alphabat[9].concat("-"); alphabat[9] = j; }
			if (H_gram.charAt(sn) == 'K') { String k = alphabat[10].concat("-"); alphabat[10] = k; }
			if (H_gram.charAt(sn) == 'L') { String l = alphabat[11].concat("-"); alphabat[11] = l; }
			if (H_gram.charAt(sn) == 'M') { String m = alphabat[12].concat("-"); alphabat[12] = m; }
			if (H_gram.charAt(sn) == 'N') { String n = alphabat[13].concat("-"); alphabat[13] = n; }
			if (H_gram.charAt(sn) == 'O') { String o = alphabat[14].concat("-"); alphabat[14] = o; }
			if (H_gram.charAt(sn) == 'P') { String p = alphabat[15].concat("-"); alphabat[15] = p; }
			if (H_gram.charAt(sn) == 'Q') { String q = alphabat[16].concat("-"); alphabat[16] = q; }
			if (H_gram.charAt(sn) == 'R') { String r = alphabat[17].concat("-"); alphabat[17] = r; }
			if (H_gram.charAt(sn) == 'S') { String s = alphabat[18].concat("-"); alphabat[18] = s; }
			if (H_gram.charAt(sn) == 'T') { String t = alphabat[19].concat("-"); alphabat[19] = t; }
			if (H_gram.charAt(sn) == 'U') { String u = alphabat[20].concat("-"); alphabat[20] = u; }
			if (H_gram.charAt(sn) == 'V') { String v = alphabat[21].concat("-"); alphabat[21] = v; }
			if (H_gram.charAt(sn) == 'W') { String w = alphabat[22].concat("-"); alphabat[22] = w; }
			if (H_gram.charAt(sn) == 'X') { String x = alphabat[23].concat("-"); alphabat[23] = x; }
			if (H_gram.charAt(sn) == 'Y') { String y = alphabat[24].concat("-"); alphabat[24] = y; }
			if (H_gram.charAt(sn) == 'Z') { String z = alphabat[25].concat("-"); alphabat[25] = z; }
		}
		for (int sn=0; sn<alphabat.length; sn++) {
			System.out.println(alphabat[sn]);
		}
	}
}


