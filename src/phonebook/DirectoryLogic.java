package phonebook;

import java.util.Arrays;

public class DirectoryLogic {
	//create an array of people 
	Person[] person = new Person[0];
	
	public DirectoryLogic() {
		
	}
	
	//adPerson to the array 
	public void addPerson(Person newPerson) {
		//create temp array one larger than current  array
		Person[] temp = new Person[this.person.length +1];
		
		//add people in the original array to the temporary array 
		for(int i =0; i<this.person.length; i++) {
			temp[i] = this.person[i]; 
		}
		//at the end of the array add the new person object 
		temp[temp.length -1] =newPerson; 
		
		//reassign the original array to the temp one 
		this.person = temp; 
	}

	public Person[] getDirectoryLogic() {
        return this.person;
    }
	
	// print the entire directory 
	public void printDirectory() {
		for(int i =0; i<person.length; i++) {
			this.person[i].getPerson();
		}
		
	}
	
	public Person getByPhone(long phoneNumber) {
		int reference = 0;
		for (int i = 0; i < this.person.length; i++) {
			if(this.person[i].getPhone() == phoneNumber) {
				reference = i;
				break;
			}
		}
		return this.person[reference];
		
	}
	
	public void removePerson(Person noPerson) {
		Person[] temp = new Person[this.person.length -1]; //Delete the one person and leaves the rest of the people in array 
		int count =0; 
		for(int i =0; i<this.person.length; ++i) {
			if(this.person[i] != noPerson ) {
				temp[count]=this.person[i];
				++count;
			}
		}
		this.person = temp; 
	}

	
	public Person[] getPerson() {
		return person; 
	}
	
	public Person[] getByFirstName(String first) {
		int counter = 0; 
		
		for(int i = 0; i< this.person.length; ++i) {
			if(this.person[i].getFirstName().equals(first)) {
				
				++counter; 
			}
		}
		Person[] newArray = new Person[counter];
		int x = 0; 
		
		for(int j = 0; j < this.person.length; ++j) {
			if(this.person[j].getFirstName().equals(first)) {
				newArray[x] = this.person[j];
				++x; 
			}
		}
		return newArray; 
	}
	

	public Person[] getByLastName(String last) {
		int counter = 0; 
		
		for(int i = 0; i< person.length; i++) {
			if(this.person[i].getLastName().equals(last)) {
				
				++counter; 
			}
		}
		Person[] newArray = new Person[counter];
		int x = 0; 
		
		for(int j = 0; j < person.length; ++j) {
			if(this.person[j].getLastName().equals(last)) {
				newArray[x] = this.person[j];
				++x; 
			}
		}
		return newArray; 
	}
	
	public Person[] getByFullName(String full) {
		int counter =0; 
		
		for(int i = 0; i < this.person.length; ++i) {
			if((this.person[i].getFirstName()+" "+this.person[i].getLastName()).equals(full)){
			++counter; 
			}
		}
		
		Person[] newArray = new Person[counter];
		int x = 0; 
		
		for(int j = 0; j< this.person.length; ++j) {
			if((this.person[j].getFirstName() +" "+ this.person[j].getLastName()).equals(full)) {
				newArray[x] = this.person[j];
				++x; 
			}
		}
		return newArray; 
	}
	
	public Person[] getByState(String state) {
        int counter = 0;

        for(int i = 0; i < this.person.length; ++i) {
            if (this.person[i].getMyState().toLowerCase().equals(state.toLowerCase())) {
                ++counter;
            }
        }

        Person[] newArray = new Person[counter];
        int x = 0;

        for(int j = 0; j < person.length; ++j) {
            if (person[j].getMyState().toLowerCase().equals(state.toLowerCase())) {
                newArray[x] = person[j];
                ++x;
            }
        }

        return newArray;
    }
	
	public Person[] getByCity(String city) {
        int counter = 0;

        for(int i = 0; i < this.person.length; ++i) {
            if (this.person[i].getMyCity().toLowerCase().equals(city.toLowerCase())) {
                ++counter;
            }
        }

        Person[] newArray = new Person[counter];
        int x = 0;

        for(int j = 0; j < person.length; ++j) {
            if (this.person[j].getMyCity().toLowerCase().equals(city.toLowerCase())) {
                newArray[x] = this.person[j];
                ++x;
            }
        }

        return newArray;
    }


    public void printPersonArray(Person[] searched) {
        for(int i = 0; i < searched.length; ++i) {
            searched[i].getPerson();
        }

    }


    public void printAlphabetArray(Person[] searched) {
        String[] alphabet = new String[searched.length];

        int j;
        for(j = 0; j < searched.length; ++j) {
            alphabet[j] = searched[j].getFirstName();
        }

        Arrays.sort(alphabet);

        for(j = 0; j < alphabet.length; ++j) {
            for(int k = 0; k < this.person.length; ++k) {
                if (alphabet[j] == this.person[k].getFirstName()) {
                    this.person[k].getPerson();
                }
            }
        }

    }
	
	}
	

