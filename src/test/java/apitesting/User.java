package apitesting;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class User {
	
	private String email;
	private String firstName;
	private String LastName;
	private ArrayList<Integer> mobile;
	private Address addresh;
	
	
	
	
	
	public User(String email,String firstName,String LastName,String faltNo,String city,String State,String Country) {
		this.email=email;
		this.firstName= firstName;
		this.LastName= LastName;
		this.mobile = new ArrayList<Integer>();
		this.addresh = new Address(faltNo, city, State, Country);
		
	}
	public Address getAddresh() {
		return addresh;
	}
	public void setAddresh(Address addresh) {
		this.addresh = addresh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public ArrayList<Integer> getMobile() {
		return mobile;
	}
	public void setMobile(ArrayList<Integer> mobile) {
		this.mobile = mobile;
	}
	public void setMobileNumbers(int...mobileNumbers) {
		
		for(int i=0;i<mobileNumbers.length;i++) {
			this.mobile.add(mobileNumbers[i]);
		}
	}

}
