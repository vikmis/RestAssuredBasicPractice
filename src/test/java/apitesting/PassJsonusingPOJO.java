package apitesting;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PassJsonusingPOJO {
	
	//For file new USer.json
	
	
	public static void main(String[] args) {
		
		User user = new User("vikashmishra9457@gmail.com", "Vikash", "Mishra","f2","Bengaluru","Karnatka","India");
		user.setMobileNumbers(2344,1235);
		
		Response  response =  given().contentType(ContentType.JSON).log().all().body(user)
				.post("http://localhost:8080/api/users");		//----- u have to these lines with appropriate url
		
				response.prettyPrint();
				System.out.println("Response : - "+response.statusCode());
	}

}
