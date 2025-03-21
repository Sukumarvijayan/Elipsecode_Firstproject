package apiTest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestAPITesting {
	
	public void Unirestget() throws UnirestException {
		
		//below one line perform get with url & retrieve the response(Json, so use .asJscon) & stored in Jsondata variable
		HttpResponse <JsonNode> Jsondata = Unirest.get("https://reqres.in/api/users/").asJson();
		
		System.out.println("Status Code"+ Jsondata.getStatus());
		System.out.println("Status Message"+ Jsondata.getStatusText());
		System.out.println("Response Bosy"+ Jsondata.getBody());
	}
	
	public void Unirestpost() throws UnirestException {
		
		//below one line perform post with url & create with body details(body() & Json response, so use .asJscon) & stored in Jsondata variable
		HttpResponse <JsonNode> Jsondata = Unirest.post("https://dummy.restapiexample.com/api/v1/create").body("{\"name\":\"JothiSuku\",\"salary\":\"123456\",\"age\":\"43\"}").asJson();
		
		System.out.println("Status Code"+ Jsondata.getStatus());
		System.out.println("Status Message"+ Jsondata.getStatusText());
		System.out.println("Response Bosy"+ Jsondata.getBody());
	}

	
	public void Unirestupdate() throws UnirestException {
		
		//below one line perform get with url & update the response(Json, so use .asJscon) & stored in Jsondata variable
		HttpResponse <JsonNode> Jsondata = Unirest.put("https://dummy.restapiexample.com/api/v1/update/8353").body("{\"name\":\"NaveenSuku\",\"salary\":\"50000\",\"age\":\"43\"}").asJson();
		
		System.out.println("Status Code"+ Jsondata.getStatus());
		System.out.println("Status Message"+ Jsondata.getStatusText());
		System.out.println("Response Bosy"+ Jsondata.getBody());
	}

	public void Unirestdelete() throws UnirestException {
		
		//below one line perform post with url & delete (Json response, so use .asJscon) & stored in Jsondata variable
		HttpResponse <JsonNode> Jsondata = Unirest.delete("https://dummy.restapiexample.com/api/v1/delete/8353").asJson();
		
		System.out.println("Status Code"+ Jsondata.getStatus());
		System.out.println("Status Message"+ Jsondata.getStatusText());
		System.out.println("Response Bosy"+ Jsondata.getBody());
	}


	public static void main(String[] args) throws UnirestException {
		// TODO Auto-generated method stub
		UnirestAPITesting unirestAPITesting = new UnirestAPITesting();
		//unirestAPITesting.Unirestget();
		//unirestAPITesting.Unirestpost();
		//unirestAPITesting.Unirestupdate();
		unirestAPITesting.Unirestdelete();
	}

}
