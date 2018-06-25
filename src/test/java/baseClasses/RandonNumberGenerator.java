package baseClasses;

import java.util.Random;

public class RandonNumberGenerator {
	
	public static int getRandonNumber() {
		Random rn = new Random();
 		int  n = rn.nextInt(5000) + 1;
 		return n;
	}
}