package predicates;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

public class Filterpredicates {
	
	public static void filterpred() throws IOException {
		
		File file = new File("src/test/resources/bookstore.json");
		
		Filter obj = Filter.filter(Criteria.where("price").lt(10));
		
		List<Object> pricelist = JsonPath.read(file, "$.store.book[?]",obj);

		for (Object price : pricelist) {
			System.out.println(price);
		}
		
	}
	
public static void secondfilter() throws IOException {
		
		File file = new File("src/test/resources/bookstore.json");
		
		Filter obj = Filter.filter(Criteria.where("price").lt(10).and("category").is("reference"));
		
		List<Map<String,Object>> pricelist = JsonPath.read(file, "$.store.book[?]",obj);

		System.out.println(pricelist.get(0).get("title"));
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//filterpred();
		secondfilter();
	}

}
