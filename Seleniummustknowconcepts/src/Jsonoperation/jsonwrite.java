package Jsonoperation;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class jsonwrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("age", 1);
		jsonobject.put("name", "Agni");
		
		JSONArray jsonArray = new JSONArray();
		jsonArray.add("Magical Smile");
		jsonArray.add("magnetic eyes");
		
		jsonobject.put("Special features", jsonArray);
		
		FileWriter fileWriter = new FileWriter("Suku.json");
		fileWriter.write(jsonobject.toJSONString());
		fileWriter.close();
		
		
				

	}

}
