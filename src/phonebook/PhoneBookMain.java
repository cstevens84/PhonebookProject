package phonebook;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		// menu and choices

		Scanner sc = new Scanner(System.in);
		Scanner nextLineScanner = new Scanner(System.in);
		DirectoryLogic primary = new DirectoryLogic(); // creating and object primary

		Person p1 = new Person("Brandon", "Owens", "Scott", 314224562L);
		Person p2 = new Person("John", "Tee", "Doe", 2244649362L);

		// add address for two people
		p1.addAddress(4356, " Ralph Blvd", "Atlanta", "Ga", "30349");
		p2.addAddress(2234, " James Blvd", "Atlanta", "Ga", "30312");

		// add to the directory
		primary.addPerson(p1);
		primary.addPerson(p2);

		primary.printDirectory();

		System.out.println("Enter information for the person to be added seprated by commas");
		System.out.println("Format: Name, Street Address, City(no periods), state, Zipcode, Phonenumber");

		//String info = sc.nextLine(); // scanning input

		/*
		 * int num =0;
		 * 
		 * while(num==0) { System.out.
		 * println("Menu\n1.Add Contact\n2.Display all contacts\n3.Search contact by phone\n4.Remove contact\n5.Exit"
		 * ); System.out.println("Enter your choice: "); int
		 * n=Integer.parseInt(sc.nextLine()); if(n==1) { Person obj=new Person();
		 * System.out.println("Add a Person: ");
		 * System.out.println("Enter the First Name: ");
		 * obj.setFirstName(sc.nextLine()); System.out.println("Enter the Last Name: ");
		 * obj.setLastName(sc.nextLine()); System.out.println("Enter the Phone No. : ");
		 * obj.setPhoneNumber(sc.nextLong()); //
		 * System.out.println("The contacts in the List are:"); primary.getPerson();
		 */

		/*
		 * primary.printDirectory(); for(Person temp:primary){
		 * System.out.println("First Name:"+temp.getFirstName());
		 * System.out.println("Last Name:"+temp.getLastName());
		 * System.out.println("Phone No.:"+temp.getPhoneNumber());
		 * 
		 * 
		 * 
		 * 
		 * //Separate into into an array of strings String[] tempInfo =
		 * info.split(", ");
		 * 
		 * //set variables for each index String name = tempInfo[0]; String street =
		 * tempInfo[1]; String city = tempInfo[2]; String state = tempInfo[3]; String
		 * zipCode = tempInfo[4]; long phoneNumber = Long.parseLong(tempInfo[5]);
		 * 
		 * String[] tempName = name.split(" ");
		 * 
		 * //first name is always first String firstName = tempName[0];
		 * 
		 * //last name is always first String lastName = tempName[tempName.length -1];
		 * 
		 * //empty container for middle name String middleName = "";
		 * 
		 * for(int i =1; i< tempName.length -1 ; i++) { middleName += tempName[i]; if(i
		 * != tempName.length -2) { middleName += " "; } } String[] tempAddress =
		 * street.split(" "); String streetName = ""; //places the parts of the address
		 * that make up the street name into separate Strings for(int i =1;
		 * i<tempAddress.length; i++) { streetName += tempAddress[i]; if( i!=
		 * tempAddress.length -1) { streetName += " "; } } int streetNum =
		 * Integer.parseInt(tempAddress[0]); Person p3 = new Person(firstName, lastName,
		 * middleName, phoneNumber); p3.addAddress(streetNum, streetName, city, state,
		 * zipCode); primary.addPerson(p3); //finally this adds to the information to
		 * directory
		 * 
		 * primary.printDirectory(); // print the Directory
		 * 
		 * System.out.println("Enter the phone number of the person you wish to delete"
		 * ); long phoneNum = sc.nextLong();
		 * primary.removePerson(primary.getByPhone(phoneNum)); primary.printDirectory();
		 * 
		 * 
		 * System.out.println("Enter the phone number you want to search");
		 */
	

	int choice = 0;
	//boolean var7 = false;

	while(true)
	{
		while (choice != 11) {
			choice = getMenu();
			switch (choice) {
			case 1:
				System.out.println("Please enter information for the person to be added separated by commas ");
				System.out.println(
						"    FORMAT: Name, Street Address, City(no periods, i.e. St Louis not St. Louis), State, ZipCode, Phone Number");
				String info = nextLineScanner.nextLine();
				String[] tempInfo = info.split(", ");
				String name = tempInfo[0];
				String street = tempInfo[1];
				String city = tempInfo[2];
				String state = tempInfo[3];
				String zipCode = tempInfo[4];
				long phoneNum = Long.parseLong(tempInfo[5]);
				String[] tempName = name.split(" ");
				String firstName = tempName[0];
				String lastName = tempName[tempName.length - 1];
				String middleName = "";
				int i = 1;

				for (; i < tempName.length - 1; ++i) {
					middleName = middleName + tempName[i];
					if (i != tempName.length - 2) {
						middleName = middleName + " ";
					}
				}

				String[] tempAddress = street.split(" ");
				String streetName = "";

				//int i;
				for (i = 1; i < tempAddress.length; ++i) {
					streetName = streetName + tempAddress[i];
					if (i != tempAddress.length - 1) {
						streetName = streetName + " ";
					}
				}

				i = Integer.parseInt(tempAddress[0]);
				Person p3 = new Person(firstName, lastName, middleName, phoneNum);
				p3.addAddress(i, streetName, city, state, zipCode);
				primary.addPerson(p3);
				break;
			case 2:
				System.out.println("Please enter the phone number of the person you would like to remove: ");
				long case2 = sc.nextLong();
				primary.removePerson(primary.getByPhone(case2));
				break;
			case 3:
				System.out.println("Please enter the first name of the person you are searching for: ");
				String case3 = sc.next();
				primary.printPersonArray(primary.getByFirstName(case3));
				break;
			case 4:
				System.out.println("Please enter the last name of the person you are searching for: ");
				String case4 = sc.next();
				primary.printPersonArray(primary.getByLastName(case4));
				//primary.printDirectory();
				break;
			case 5:
				System.out.println("Please enter the full name of the person you are searching for: ");
				String case5 = sc.nextLine();
				primary.printPersonArray(primary.getByFullName(case5));
				break;
			case 6:
				System.out.println("Please enter the phone number of the person you are searching for: ");
				long tempNum6 = sc.nextLong();
				primary.getByPhone(tempNum6).getPerson();
				break;
			case 7:
				System.out.println("Please enter the city of the person you are searching for: ");
				String case7 = sc.nextLine();
				primary.printPersonArray(primary.getByCity(case7));
				break;
			case 8:
				System.out.println("Please enter the state of the person you are searching for: ");
				String case8 = sc.next();
				primary.printPersonArray(primary.getByState(case8));
				break;
			case 9:
				primary.printAlphabetArray(primary.getDirectoryLogic());
				primary.printDirectory();
				break;
			case 10:
				System.out.println("Please enter the phone number of the person you are searching for: ");
				long case10 = sc.nextLong();
				primary.getByPhone(case10).getPerson();
				int updateChoice = 0;

				while (updateChoice != 8) {
					updateChoice = getUpdateMenu();
					switch (updateChoice) {
					case 1:
						System.out.println("Please enter the new first name: ");
						String newFirst = sc.next();
						primary.getByPhone(case10).setFirstName(newFirst);
						break;
					case 2:
						System.out.println("Please enter the new last name: ");
						String newLast = sc.next();
						primary.getByPhone(case10).setLastName(newLast);
						break;
					case 3:
						System.out.println("Please enter the new street address: ");
						String newStreetAddress = nextLineScanner.nextLine();
						primary.getByPhone(case10).getAddress().setStreetAddress(newStreetAddress);
						break;
					case 4:
						System.out.println("Please enter the new number: ");
						long newPhone = sc.nextLong();
						primary.getByPhone(case10).setPhone(newPhone);
						break;
					case 5:
						System.out.println("Please enter the new city: ");
						String newCity = sc.next();
						primary.getByPhone(case10).getAddress().setCity(newCity);
						break;
					case 6:
						System.out.println("Please enter the new state: ");
						String newState = sc.next();
						primary.getByPhone(case10).getAddress().setState(newState);
						break;
					case 7:
						System.out.println("Please enter the new zip code: ");
						String newZip = sc.next();
						primary.getByPhone(case10).getAddress().setZipCode(newZip);
					case 8:
					}
				}
			case 11:
			}
		}

		sc.close();
        nextLineScanner.close();
		return;
	}
	}

	public static int getMenu() {
        Scanner sc1 = new Scanner(System.in); 
		System.out.println("1. Add a new record");
		 System.out.println("2. Delete a record");
		 System.out.println("3. Search by first name");
		 System.out.println("4. Search by last name");
		 System.out.println("5. Search by full name");
		 System.out.println("6. Search by phone number");
		 System.out.println("7. Search by city");
		 System.out.println("8. Search by state");
		 System.out.println("9. Show all records alphabetically");
		 System.out.println("10. Update a record");
		 System.out.println("11. End the program");
		 System.out.print("Please enter a number: ");
		 int choice = sc1.nextInt();
		 System.out.println();
		 return choice;
	}
 

	public static int getUpdateMenu() {
      Scanner sc2 = new Scanner(System.in); 
		System.out.println("1. Update first name");
		 System.out.println("2. Update last name");
		 System.out.println("3. Update street address");
		 System.out.println("4. Update phone number");
		 System.out.println("5. Update city");
		 System.out.println("6. Update state");
		 System.out.println("7. Update zip code");
		 System.out.println("8. Exit record update");
		 System.out.print("Please enter a number: ");
		 int choice = sc2.nextInt();
		 System.out.println();
		 return choice;
	}

}
