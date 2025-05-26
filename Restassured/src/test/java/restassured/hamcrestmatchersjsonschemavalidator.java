package restassured;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class hamcrestmatchersjsonschemavalidator {

	@Test
	public void hamcrestvalidator() throws IOException {
		
		File inputjson = new File("src/test/resources/input.json");
		
		String jsonconetent = FileUtils.readFileToString(inputjson);
		
		File jsonschema = new File("src/test/resources/schema.json");
		
		MatcherAssert.assertThat(jsonconetent, JsonSchemaValidator.matchesJsonSchema(jsonschema));
		
	}
}
