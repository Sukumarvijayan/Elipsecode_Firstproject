package Filewriting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Usingbufferedwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location = "Bufferedwriter.txt";
		String content ="Testing purpose";
		
		FileWriter fileWriter = new FileWriter(location);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		fileWriter.write(content);
		fileWriter.close();
	}

}
