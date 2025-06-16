package Filereading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class usingbufferreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location = "Bufferedwriter.txt";
		
		FileReader fileReader = new FileReader(location);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String readeddata;
		
		while ((readeddata = bufferedReader.readLine())!=null) {
			System.out.println(readeddata);
		}
			}

}
