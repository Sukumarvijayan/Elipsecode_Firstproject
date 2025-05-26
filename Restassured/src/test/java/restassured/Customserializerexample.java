package restassured;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class Customserializerexample extends StdSerializer<JsonSerializepojo>{

	protected Customserializerexample(Class<JsonSerializepojo> t) {
		super(t);
		// TODO Auto-generated constructor stub
	}
	
	public Customserializerexample() {
		this(null);
	}

	@Override
	public void serialize(JsonSerializepojo value, 
			JsonGenerator gen, SerializerProvider provider) throws IOException {
		// TODO Auto-generated method stub
		
		gen.writeStartObject();
		gen.writeStringField("name", value.getName());
		gen.writeEndObject();
		
	}
	
	

}
