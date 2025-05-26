package restassured;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

public class Netwrokntjsonschemvalidator {
     @Test
	public void validatejsonschme() throws IOException {
 
		File inputjson = new File("src/test/resources/input.json");
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonnode = mapper.readTree(inputjson);
        
		//v4 because we used as draft-04 schema in schema.json file
		InputStream inputschema = new FileInputStream("src/test/resources/schema.json");
		JsonSchemaFactory factory = JsonSchemaFactory.getInstance(VersionFlag.V4);
		JsonSchema schema = factory.getSchema(inputschema);

		Set <ValidationMessage> result = schema.validate(jsonnode);
        //if result empty na, no error
		if(result.isEmpty()) {
			System.out.println("No validation error");
		} else {
			for(ValidationMessage message : result) {
				System.out.println(message);
			}
		}

	}
}
