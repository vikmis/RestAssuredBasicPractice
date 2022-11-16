package apitesting;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PassComplexJSON_File {
	
	public static void main(String[] args) {
		
		// Forfile newUser.json
		
		HashMap<String,Object> map = new HashMap<String, Object>();
		map.put("email", "vikashmishra9457@gmail.com");
		map.put("firstName", "vikash");
		map.put("LastName", "Mishra");
		
		ArrayList<Integer> listofMobileNumber = new ArrayList<Integer>();
		listofMobileNumber.add(2344);
		listofMobileNumber.add(1235);
		
		map.put("mobile",listofMobileNumber );
		
		HashMap<String,Object> Address = new HashMap<String, Object>();
		Address.put("faltNo", "f2");
		Address.put("city", "Bengaluru");
		Address.put("State", "Karnatka");
		Address.put("Country", "India");
		
		map.put("addresh", Address);
		
//		Response  response = given().contentType(ContentType.JSON).log().all().body(map)
//				.post("https://reqres.in/api/users");		----- u have to these lines with appropriate url
//		
//		response.prettyPrint();
//		System.out.println("Response : - "+response.statusCode());
		
		
	}

}
