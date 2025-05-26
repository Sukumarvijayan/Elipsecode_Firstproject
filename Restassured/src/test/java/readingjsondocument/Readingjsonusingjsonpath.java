package readingjsondocument;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class Readingjsonusingjsonpath {

	public static void jsonread() throws IOException {
		File file = new File("src/test/resources/bookstore.json");

		//we are using list, because output will have list of price
		//object using, it accept integer, string, long anything..here we can use Integer also 
		List<Object> pricelist = JsonPath.read(file, "$..price");

		for (Object price : pricelist) {
			System.out.println(price);
		}

	}
	
	public static void Parseonetime() throws IOException {
		
		//File file = new File("src/test/resources/bookstore.json");
		FileInputStream file = new FileInputStream("src/test/resources/bookstore.json");
		
		//parse will accept Inputstream only so above file change to inputstream
		Object Parsejsondocu = Configuration
				.defaultConfiguration().jsonProvider().parse(file.readAllBytes());
		
		List<Object> pricelist = JsonPath.read(Parsejsondocu, "$..price");
		for (Object price : pricelist) {
			System.out.println(price);
		}
	}
		
		public static void fluentapi() throws IOException {
			
			//first option in fluent API using DocumentContent
			File file = new File("src/test/resources/bookstore.json");
			DocumentContext jsondoc = JsonPath.parse(file);
			List<Object> pricelist = JsonPath.read(jsondoc, "$..price");

			for (Object price : pricelist) {
				System.out.println(price);
			}
			
			//second option in fluent API using Configuration
			File file1 = new File("src/test/resources/bookstore.json");
			Configuration Parsejsondocu = Configuration
					.defaultConfiguration();
		    List<Object> pricelist1 =JsonPath.using(Parsejsondocu).parse(file1).read("$..price");
			for (Object price : pricelist1) {
				System.out.println(price);
			}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		jsonread();
		//Parseonetime();
		fluentapi();

	}

}
