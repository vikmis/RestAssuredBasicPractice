package apitesting;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class SendPostRequestUsingRestAssured {
	
	static String username = "sk_test_51LIdfxSEy1jsAo2VqGhAU0QWXtSsqSIEmZuVmpEXsVfBa46notfrpQYk1aoOaB08WiEo8djjrY9Y1NgozsZppc9K00St1EKKAd";
	static String password = "";
	
	
	/*public static void main(String[] args) {
		
		Response response = given().auth().basic(username,password).formParams("name", "Amit Singh")
		.formParam("email", "amitlvec.anna@gmail.com").formParam("description", "this new customer amit")
		.post("https://api.stripe.com/v1/customers");
		
		response.prettyPrint();
		
	}*/
	
	
	public static void main(String[] args) {
		
		// website use dfor api testing---- reqres.in
		
		/*String  bodyString = "{\"email\" : \"eve.holt@reqres.in\",\"password\":\"pistol\"}";
		Response  response = given().contentType(ContentType.JSON).body(bodyString)
		.post("https://reqres.in/api/register"); //------ for body Sting .*/
		
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("email", "eve.holt@reqres.in");
		map.put("password", "pistol");
		
		Response  response = given().contentType(ContentType.JSON).body(map)
				.post("https://reqres.in/api/register"); //---------  for hashmap
		
		/*Response  response = given().contentType(ContentType.JSON).log().all().body(new File("./user.json"))
				.post("https://reqres.in/api/users");		//------ for File*/
		
		response.prettyPrint();
		System.out.println("Response : - "+response.statusCode());
		
}
}
