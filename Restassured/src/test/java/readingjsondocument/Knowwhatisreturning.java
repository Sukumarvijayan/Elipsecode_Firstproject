package readingjsondocument;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class Knowwhatisreturning {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("src/test/resources/bookstore.json");

		//we are using list, because output will have list of price
		//object using, it accept integer, string, long anything..here we can use Integer also 
		String pricelist = JsonPath.read(file, "$.store.book[1].author");
		System.out.println(pricelist);
		
//		for (Object price : pricelist) {
//			System.out.println(price);
//		}


	}

}
