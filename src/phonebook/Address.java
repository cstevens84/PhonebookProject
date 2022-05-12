package phonebook;

public class Address {
	private int streetNum;
	// private String personName;
	private String streetName;
	private String city;
	private String state;
	private String zipCode;

	public Address(int streetNum, String streetName, String city, String state, String zipCode) {

		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	// set just the street
	public void setStreetAddress(String newAddress) {
		// split the new address entered into an array of String
		String[] temp = newAddress.split(" ");
		String newStName = ""; // temporary container
		// set the number of private variable above
		this.streetNum = Integer.parseInt(temp[0]);

		// create a string for street name
		for (int i = 1; i < temp.length; i++) {
			newStName = temp[i];
			if (i != temp.length - 2) {
				newStName += " ";
			}
		}
		this.streetName = newStName;
	}

	public int getStreetNum() {
		return streetNum;
	}

	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}

//	public String getPersonName() {
//		return personName;
//	}
//	public void setPersonName(String personName) {
//		this.personName = personName;
//	}
	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	// print address
	public void printAddress() {
		System.out.println(streetNum + " " + streetName + " ," + city + ", " + state + " " + zipCode);
	}

}
