package Filewriting;

import java.io.FileWriter;
import java.io.IOException;

public class Usingfilewriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "filewriter.txt";
		String content ="Testing purpose";
		
		FileWriter fileWriter = new FileWriter(location);
		fileWriter.write(content);
		fileWriter.close();
	}

}
