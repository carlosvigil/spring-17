/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	April 18th, 2017
	Chapter 6 - Personal Information Class
*/

/**
 * PersonsInformation holds a name, address, age, and phone number.
 */
public class PersonsInfo {
	String name, address;
	int age, phone;

    public PersonsInfo (String n, String ad, int ag, int p) {
		name = n;
		address = ad;
		age = ag;
		phone = p;
    }

	// Accessors

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public int getPhone() {
		return phone;
	}

	// Mutators

	public void setName(String n) {
		name = n;
	}

	public void setAddress(String ad) {
		address = ad;
	}

	public void setAge(int ag) {
		age = ag;
	}

	public void setPhone(int p) {
		phone = p;
	}
}
