package apitesting;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;

public class SendGetRequestUsingRestAssured {
	
	static String username = "sk_test_51LIdfxSEy1jsAo2VqGhAU0QWXtSsqSIEmZuVmpEXsVfBa46notfrpQYk1aoOaB08WiEo8djjrY9Y1NgozsZppc9K00St1EKKAd";
	static String password = "";
	static String uri = "https://api.stripe.com/v1/customers";
/*
 * Authentication  : - Basic Auth / Bearer token using headers
 * 
 * Request ----> Set of request specification.
 * 
 * Response -----> do Validation.
 * 
 * Contetn type -->
 * 1. Using Content type().
 * 2. Adding Content type in headers.
 *
 * Testing content Strip URL  - Strip.com>>Developers>>Api full reference
 * to check customer creation on UI
 * got to dashboard>> developers >>Customer
 * for API keys >> apikeys.
 * 
 * For Resst Assured documentatation
 * got to this url : -https://rest-assured.io/>>Release note.. 
 * click on the latest release>> getting started.
 */
	public static void main(String[] args) {
		
	/*Response response = given().auth().basic(username,password)
		.params("limit", 1).get(uri);--- this also a way */
		
		Response response = given().auth().basic(username,password).formParams("limit", 1)
				.formParam("email", "trainer@way2automation.com").get(uri);
		
		//Response response = given().params("limit", 1).auth().basic(username,password).get(uri);//Strip notes to set content type
	//	response.prettyPrint(); it is also a way to print the response
		
		String Jsonresponse = response.asString();
		System.out.println(Jsonresponse);
		System.out.println("Resonse Code : - "+response.statusCode()); // this is fo status code.
		
		/*given().contentType(ContentType.JSON);
		given().contentType("application/json");
		given().header("Content-type", "application/json");
		*/
		
	}
	
	

}
