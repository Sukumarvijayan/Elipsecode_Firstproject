package readingjsondocument;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;
import java.util.List;

public class Configurationexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String json ="{\r\n"
				+ "    \"store\": {\r\n"
				+ "        \"book\": [\r\n"
				+ "            {\r\n"
				+ "                \"category\": \"reference\",\r\n"
				+ "                \"author\": \"Nigel Rees\",\r\n"
				+ "                \"title\": \"Sayings of the Century\",\r\n"
				+ "                \"price\": [8.95,10,12]\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"category\": \"fiction\",\r\n"
				+ "                \"author\": \"Evelyn Waugh\",\r\n"
				+ "                \"title\": \"Sword of Honour\"\r\n"
				+ "        \r\n"
				+ "            }\r\n"
				+ "            \r\n"
				+ "           ] }\r\n"
				+ "    }  \r\n"
				+ "\r\n"
				+ "                        ";
    
		Configuration configuration = Configuration.defaultConfiguration();
		//configuration = configuration.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
		//configuration = configuration.addOptions(Option.ALWAYS_RETURN_LIST);
		//configuration = configuration.addOptions(Option.SUPPRESS_EXCEPTIONS);
		configuration = configuration.addOptions(Option.REQUIRE_PROPERTIES);
		
		List<Object> obj = JsonPath.using(configuration).parse(json).read("$.store.book[*].price");
		System.out.println(obj);
	}

}
