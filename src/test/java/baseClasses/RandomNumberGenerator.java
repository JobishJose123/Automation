package baseClasses;

import java.util.Random;

public class RandomNumberGenerator {
	
	public static int getRandomNumber() {
		Random rn = new Random();
 		int  n = rn.nextInt(5000) + 1;
 		return n;
	}
}