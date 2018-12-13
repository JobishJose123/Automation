package baseClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class TextFileUtil{

public static void main(String args[]) throws Exception {
				  
//	TextFileUtil ob=new TextFileUtil();
//	ob.readTxtFile("Models//PYTHON_INPUT");
}


public String readTxtFile(String data) throws IOException {
	File file = new File("Models//"+data+".txt"); 

	BufferedReader br = new BufferedReader(new FileReader(file)); 
	  
	  String st;
	  StringBuilder strBuilder = new StringBuilder();
	  
	  while ((st = br.readLine()) != null) {
		  strBuilder.append(st);
		  strBuilder.append("\n");
}
	 // System.out.println(strBuilder);
	    return strBuilder.toString();
}

}
  
