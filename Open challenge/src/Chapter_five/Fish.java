package Chapter_five;

import java.util.Random;

public class Fish extends GameObject {
	
	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}
	protected String getShape() {
		String f = "@";
		return f;
	}
	protected void move() {
		Random random = new Random();
		int location = random.nextInt(9);
		if (location == 0) { x = x-distance; }
		if (location == 1) { x = x+distance; }
		if (location == 2) { y = y-distance; }
		if (location == 3) { y = y+distance; }	
	}
	
}
	



