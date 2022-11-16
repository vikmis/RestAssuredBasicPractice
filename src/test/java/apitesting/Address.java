package apitesting;

public class Address {
	
	private String faltNo;
	private String city;
	private String State;
	private String Country;
	
		public Address(String faltNo,String city,String State,String Country) {
			this.faltNo = faltNo;
			this.city = city;
			this.State= State;
			this.Country = Country;
			
		}

		public String getFaltNo() {
			return faltNo;
		}

		public void setFaltNo(String faltNo) {
			this.faltNo = faltNo;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return State;
		}

		public void setState(String state) {
			State = state;
		}

		public String getCountry() {
			return Country;
		}

		public void setCountry(String country) {
			Country = country;
		}

}
