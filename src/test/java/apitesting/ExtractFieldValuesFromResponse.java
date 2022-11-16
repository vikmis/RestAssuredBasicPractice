package apitesting;
import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExtractFieldValuesFromResponse {
	
	static String username = "sk_test_51LIdfxSEy1jsAo2VqGhAU0QWXtSsqSIEmZuVmpEXsVfBa46notfrpQYk1aoOaB08WiEo8djjrY9Y1NgozsZppc9K00St1EKKAd";
	static String password = "";
	static String uri = "https://api.stripe.com/v1/customers";

	public static void main(String[] args) {
		
		Response response = given().auth().basic(username,password).formParams("name", "Amit1 Singh")
				.formParam("email", "amitlvec.anna@gmail.com").formParam("description", "this new customer amit")
				.formParam("address[line1]","BTM- banglore").formParam("preferred_locales[0]", "yes")
				.formParam("preferred_locales[1]", "No").post("https://api.stripe.com/v1/customers");
				
				response.prettyPrint();
				
//				JsonPath jsonPath = response.jsonPath();
//				jsonPath.get("id");
			System.out.println(response.jsonPath().get("id"));
				System.out.println(response.jsonPath().get("address.line1"));// --- validate the data
				System.out.println(response.jsonPath().getMap("$").size());//-- will check how many fields are there
				System.out.println(response.jsonPath().getMap("address").size());
				//-- will check how many fields are there in particular object
				System.out.println(response.jsonPath().getList("preferred_locales").size());

	}

}
