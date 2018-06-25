package baseClasses;

import java.util.Random;

public class RandomNameGenerator {
		
		public static String getRandomName(String name) {
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		return name;
		}
}