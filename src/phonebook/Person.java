package phonebook;

public class Person {
	private String firstName;
	private String lastName;
	private String middleName;
	private long phoneNumber;
	private Address address;

//constructor to set the address in Person and tie it to the correct Person object 
	public void addAddress(int streetNum, String streetName, String city, String state, String zipCode) {
		Address tempAddress = new Address(streetNum, streetName, city, state, zipCode); // the address keyword was
																						// sensitive maybe cause of the
																						// similar naming
		address = tempAddress;
	}

	public Address getAddress() {
		return this.address;

	}

//default constructor
	public Person() {

	}

	public Person(String firstName, String lastName, String middleName, long number) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.phoneNumber = number;
		// this.address = address;
	}

	public void getPerson() {
		if (middleName.length() != 0) {
			System.out.println(firstName + " " + middleName + " " + lastName);
		} else {
			System.out.println(firstName + " " + lastName);
		}
		address.printAddress(); // call to Address object
		System.out.println("Phone Number: " + formatPhone(phoneNumber));
		System.out.println("-----------------------------------------");
	
		
		address.printAddress();
		 System.out.println("Phone Number: " + this.formatPhone(this.phoneNumber));
	     System.out.println("---------------------------");
		
	
	}
	


//format phone number 
	public String formatPhone(long phone) {
		String newPhone = Long.toString(phone);
		String formattedPhone = "(" + newPhone.substring(0, 3) + ")" + newPhone.substring(3, 6) + "-"
				+ newPhone.substring(6);
		return formattedPhone;

	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String newMiddleName) {
		this.middleName = newMiddleName;
	}

	public long getPhone() {
		return this.phoneNumber;
	}

	public void setPhone(long newNumber) {
		this.phoneNumber = newNumber;
	}

	public void setAddress(Address newAddress) {
		this.address = newAddress;
	}
	
	  public String getMyState() { return this.address.getState(); }
	 

	public String getMyCity() {
		return this.address.getCity();
	}
	
	
}
/*
 * public void deletePhoneNumber(long phoneNumber) { // Remove the entry for the
 * specified name from the directory, if // there is one. If the specified name
 * does not exist in the // directory, nothing is done and no error occurs.
 * 
 * 
 * 
 * 
 * public void removeAddress(int streetNum, String streetName, String city,
 * String state, String zipCode) { Address tempAddress = new Address(streetNum,
 * streetName, city, state, zipCode); //the address keyword was sensitive maybe
 * cause of the similar naming address = tempAddress;
 * 
 * }
 */