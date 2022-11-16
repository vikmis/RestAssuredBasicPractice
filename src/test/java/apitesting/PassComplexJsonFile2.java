package apitesting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PassComplexJsonFile2 {

	public static void main(String[] args) {
		
		// Forfile Comple.json
		
		HashMap<String,Object> map = new HashMap<String, Object>();
		map.put("email", "vikashmishra9457@gmail.com");
		map.put("firstName", "Vikash");
		map.put("LastName", "Mishra");
		
		ArrayList<Integer> mobileNoList = new ArrayList<Integer>();
		mobileNoList.add(2344);
		mobileNoList.add(1235);
		
		map.put("mobile", mobileNoList);
		
		HashMap<String,Object> Address = new HashMap<String, Object>();
		Address.put("faltNo", "f2");
		Address.put("city", "Bengaluru");
		Address.put("State", "Karnatka");
		Address.put("Country", "India");
		
		map.put("addresh", Address);
		
		ArrayList<String> ps = new ArrayList<String>();
		ps.add("C++");
		ps.add("Java");
		ps.add("Python");
		ps.add("ruby");
		
		map.put("PrimarySkills", ps);
		
		ArrayList<String> ss = new ArrayList<String>();
		ss.add("Shellscripting");
		ss.add("machine learning");
		ss.add("AI");
		
		map.put("ScendorySkills", ss);
		
		ArrayList<Map<String, Object>> Education = new ArrayList<Map<String,Object>>();
		
		HashMap<String, Object> course_1 = new HashMap<String, Object>();
		course_1.put("Course","B.tech");
		course_1.put("marks","75");
		
		HashMap<String, Object> course_2 = new HashMap<String, Object>();
		course_2.put("Course","M.tech");
		course_1.put("marks","80");
		
		Education.add(course_1);
		Education.add(course_2);
		
		map.put("education", Education);
		
		//Response  response = given().contentType(ContentType.JSON).log().all().body(map)
//				.post("https://reqres.in/api/users");		----- u have to these lines with appropriate url
//		
//		response.prettyPrint();
//		System.out.println("Response : - "+response.statusCode());

	}

}
