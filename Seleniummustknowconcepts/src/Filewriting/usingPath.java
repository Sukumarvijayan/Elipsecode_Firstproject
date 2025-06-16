package Filewriting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class usingPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "Path.txt";
		String content ="Testing purpose";
		
		//path is interface here
		Path path = Paths.get(location);
        Files.write(path, content.getBytes());
        
	}

}
