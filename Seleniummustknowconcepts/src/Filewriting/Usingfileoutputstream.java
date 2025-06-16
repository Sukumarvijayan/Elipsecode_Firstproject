package Filewriting;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Usingfileoutputstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "fileoutputstream.txt";
		String content ="Testing purpose";
		
		FileOutputStream fileWriter = new FileOutputStream(location);
		byte[] bs = content.getBytes();
		fileWriter.write(bs);
		System.out.println(bs);

	}

}
