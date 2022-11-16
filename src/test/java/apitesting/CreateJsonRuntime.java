package apitesting;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateJsonRuntime {
	
	// For file newUser.json

	public static void main(String[] args) {
		
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("email", "vikashmishra9457@gmail.com");
		jsonobject.put("firstName", "Vikash");
		jsonobject.put("LastName", "Mishra");
		
		JSONArray listofmobileNO = new JSONArray();
		listofmobileNO.put(2344);
		listofmobileNO.put(1235);
		
		jsonobject.put("mobile", listofmobileNO);
		
		JSONObject Address = new JSONObject();
		Address.put("faltNo", "f2");
		Address.put("city", "Bengaluru");
		Address.put("State", "Karnatka");
		Address.put("Country", "India");
		
		jsonobject.put("addresh", Address);
		
		Response  response =  given().contentType(ContentType.JSON).log().all().body(jsonobject.toString())
				.post("https://reqres.in/api/users");		//----- u have to these lines with appropriate url
		
				response.prettyPrint();
				System.out.println("Response : - "+response.statusCode());
		

	}

	

}
