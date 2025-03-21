package apiTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class APITestingGET {
	
	public void getmethod() throws IOException {
		
		//create object for URL(import java.net.URL)
		URL url = new URL("https://reqres.in/api/users/");
		
		//openConnection retunn type URLconnection & URLconnection parent is HttpURLConnection
		//need to use parent HttpURLConnection
		//(HttpURLConnection) - Type cast , openConnection retunn type is URLconnection but we are using HttpURLConnection, so use type cast 
		HttpURLConnection connection =   (HttpURLConnection) url.openConnection();
		
		//below line to connect with that URL
		connection.setRequestMethod("GET");
		connection.connect();
		
		//To get the responsecode
		int statuscode = connection.getResponseCode();
		System.out.println("Status code is" + statuscode);
		//To get the response message
		String statusmsg = connection.getResponseMessage();
		System.out.println("Status Message is" + statusmsg);
		
		//to read all the values in that url
		//getInputStream read all values, need to use InputStreamReader & BufferedReader
		InputStream inputstrem = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputstrem);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		//String str = bufferedReader.readLine();
		//System.out.println(str);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line = bufferedReader.readLine()) != null) {
			buffer.append(line);	
		}
		System.out.println(buffer);
	}
	
	public void putmethod() throws IOException {
		
		//create object for URL(import java.net.URL)
				URL url = new URL("https://dummy.restapiexample.com/api/v1/create");
				
				//openConnection retunn type URLconnection & URLconnection parent is HttpURLConnection
				//need to use parent HttpURLConnection
				//(HttpURLConnection) - Type cast , openConnection retunn type is URLconnection but we are using HttpURLConnection, so use type cast 
				HttpURLConnection connection =   (HttpURLConnection) url.openConnection();
				
				//below line to connect with that URL for post operation
				connection.setRequestMethod("POST");
				
				
				//--------------below line of code for post operation
				//above url, reponse is jcon..so need to give content type as below
				connection.setRequestProperty("Content-Type", "application/json");
				//For post opeartion, setDoOutput need to set as true..
				connection.setDoOutput(true);
				
				//need to give the body details in order to create the details
				String jsonbody = "{\"name\":\"Jothi\",\"salary\":\"123456\",\"age\":\"43\"}";
				//server will accept only bytes, so convert string to bytes by using getBytes.
				byte[] inputjscon =jsonbody.getBytes();
				
				//need OutputStream in order to write
				OutputStream outputStream = connection.getOutputStream();
				outputStream.write(inputjscon);
				
				//----------------------------------------
				
				//To get the responsecode
				int statuscode = connection.getResponseCode();
				System.out.println("Status code is" + statuscode);
				//To get the response message
				String statusmsg = connection.getResponseMessage();
				System.out.println("Status Message is" + statusmsg);
				
				//to read all the values in that url
				//getInputStream read all values, need to use InputStreamReader & BufferedReader
				InputStream inputstrem = connection.getInputStream();
				InputStreamReader inputStreamReader = new InputStreamReader(inputstrem);
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
				
				//String str = bufferedReader.readLine();
				//System.out.println(str);
				String line;
				StringBuffer buffer = new StringBuffer();
				while ((line = bufferedReader.readLine()) != null) {
					buffer.append(line);	
				}
				System.out.println(buffer);
		
	}
	
public void updatemethod() throws IOException {
		
		//create object for URL(import java.net.URL)
				URL url = new URL("https://dummy.restapiexample.com/api/v1/delete/1998");
				
				//openConnection retunn type URLconnection & URLconnection parent is HttpURLConnection
				//need to use parent HttpURLConnection
				//(HttpURLConnection) - Type cast , openConnection retunn type is URLconnection but we are using HttpURLConnection, so use type cast 
				HttpURLConnection connection =   (HttpURLConnection) url.openConnection();
				
				//below line to connect with that URL for post operation
				connection.setRequestMethod("PUT");
				
				
				//--------------below line of code for put operation
				//above url, reponse is jcon..so need to give content type as below
				connection.setRequestProperty("Content-Type", "application/json");
				//For post opeartion, setDoOutput need to set as true..
				connection.setDoOutput(true);
				
				//need to give the body details in order to create the details
				String jsonbody = "{\"name\":\"Jothi\",\"salary\":\"123456\",\"age\":\"100\"}";
				//server will accept only bytes, so convert string to bytes by using getBytes.
				byte[] inputjscon =jsonbody.getBytes();
				
				//need OutputStream in order to write
				OutputStream outputStream = connection.getOutputStream();
				outputStream.write(inputjscon);
				
				//----------------------------------------
				
				//To get the responsecode
				int statuscode = connection.getResponseCode();
				System.out.println("Status code is" + statuscode);
				//To get the response message
				String statusmsg = connection.getResponseMessage();
				System.out.println("Status Message is" + statusmsg);
				
				//to read all the values in that url
				//getInputStream read all values, need to use InputStreamReader & BufferedReader
				InputStream inputstrem = connection.getInputStream();
				InputStreamReader inputStreamReader = new InputStreamReader(inputstrem);
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
				
				//String str = bufferedReader.readLine();
				//System.out.println(str);
				String line;
				StringBuffer buffer = new StringBuffer();
				while ((line = bufferedReader.readLine()) != null) {
					buffer.append(line);	
				}
				System.out.println(buffer);
		
	}

public void deletmethod() throws IOException {
	
	//create object for URL(import java.net.URL)
			URL url = new URL("https://dummy.restapiexample.com/api/v1/delete/1998");
			
			//openConnection retunn type URLconnection & URLconnection parent is HttpURLConnection
			//need to use parent HttpURLConnection
			//(HttpURLConnection) - Type cast , openConnection retunn type is URLconnection but we are using HttpURLConnection, so use type cast 
			HttpURLConnection connection =   (HttpURLConnection) url.openConnection();
			
			//below line to connect with that URL for post operation
			connection.setRequestMethod("DELETE");
			
			
			//--------------below line of code for post operation
			//above url, reponse is jcon..so need to give content type as below
			connection.setRequestProperty("Content-Type", "application/json");
			//For post opeartion, setDoOutput need to set as true..
			connection.setDoOutput(true);
			
			
			//----------------------------------------
			
			//To get the responsecode
			int statuscode = connection.getResponseCode();
			System.out.println("Status code is" + statuscode);
			//To get the response message
			String statusmsg = connection.getResponseMessage();
			System.out.println("Status Message is" + statusmsg);
			
			//to read all the values in that url
			//getInputStream read all values, need to use InputStreamReader & BufferedReader
			InputStream inputstrem = connection.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputstrem);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			//String str = bufferedReader.readLine();
			//System.out.println(str);
			String line;
			StringBuffer buffer = new StringBuffer();
			while ((line = bufferedReader.readLine()) != null) {
				buffer.append(line);	
			}
			System.out.println(buffer);
	
}
	
    public static void main(String[] args) throws IOException {
    	APITestingGET obj1 = new APITestingGET();
    	//obj1.getmethod();
    	//obj1.putmethod();
    	//obj1.updatemethod();
    	obj1.deletmethod();
    }
}
