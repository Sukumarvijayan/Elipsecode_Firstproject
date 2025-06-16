package Jsonoperation;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonread {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		//1. Create object for json parser
		JSONParser jsonParser = new JSONParser();
		//2.File reader ->read from suku.json file
		FileReader fileReader = new FileReader("Suku.json");
		//3.Parse the read file using parse() & store it in object
		Object parsedobject = jsonParser.parse(fileReader);
		//4.to get the values from parsed object use get(). 
		//But to do that, we have to convert the object to Json object
		JSONObject jsonobject = (JSONObject) parsedobject;
		//5. now use, get() with key
		//To retrieve name and age and store them after type casting
		String name = (String) jsonobject.get("name");
		//Note. in json always consider number as Long not integer..so used Long
		Long age = (Long) jsonobject.get("age");
		System.out.println("The name is" +name);
		System.out.println("The age is" +age);
		
		//6. To fetch data from json array, use iterator() & iterate them and print
		JSONArray array = (JSONArray) jsonobject.get("Special features");
		Iterator iterator = array.iterator();
		while(iterator.hasNext()) {
			System.out.println("Special features is" + iterator.next());
		}
			
	}

}
