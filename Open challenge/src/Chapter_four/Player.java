package Chapter_four;

import java.util.Scanner;

public class Player {
	
	public String name;
	public String word;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getWordFromUser() {
		
		Scanner scannerone = new Scanner(System.in);
		word = scannerone.next();
		return word;
		
	}
	
	public boolean checkSuccess(String lastWord) {
		
		int lastIndex = lastWord.length() - 1;
		char lastChar = lastWord.charAt(lastIndex);
		char firstChar = word.charAt(0);
		if (lastChar == firstChar) 
			return true;
		else
			return false;
		
	}
}
	
	