package baseClasses;

import java.util.Random;

public class RandomNameGenerator {
		
		public static String getRandomName(String name) {
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		name =  name.replaceAll("[-_][Ee]dited", "");
	 		name =  name.replaceAll("[-_]*", "");
	 		name =  name.replaceAll("[-_]*[Ee]dit", "");
	 		name =  name.replaceAll("[-_]*[cC]opy", "");
	 		name =  name.replaceAll("[-_]*[Dd]upe", "");
	 		name =  name.replaceAll("[-_]*[Dd]uplicate", "");
	 		name =  name.replaceAll("[0-9]", "");
	 		name = name.trim();
	 		name =  name+n;
	 		return name;
		}
}