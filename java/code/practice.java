import java.util.Set;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QDecoderStream;

/**
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	April 17th, 2017
	Chapter 6 - Employee Class
*/

public class Employee {
    private int idNumber;
	private String name;
	private String department;
	private String position;

	/**
	 * Full Constructor accepts 4 parameters and sets each for the instance
	 * @param name a String object that stores the employees name
	 * @param idNumber an integer that stores the employees ID number
	 * @param department a String object that stores the employees department
	 * @param position a String object that stores the employees job title
	*/
	public Employee (String n, int id, String dep, String pos) {
		name = n;
		idNumber = id;
		department = dep;
		position = pos;
	}

	/**
	 * Half Constructor accepts two parameters and sets remaining two as ""
	 * @param name a String object that stores the employees name
	 * @param idNumber an integer that stores the employees ID number
	*/
	public Employee (String n, int id) {
		name = n;
		idNumber = id;
		department = "";
		position = "";
	}

	/**
	 * Zero Constructor accepts no parameters and sets the instance values "", 0
	*/
	public Employee () {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}

	/**
	 * getName()
	 * @return String object with the employee's name for the current instance
	*/
	public String getName () {
		return name;
	}

	/**
	 * setName() sets the instance's name field
	 * @param n a String object representing the employee's name
	*/
	public void setName (String n) {
		name = n;
	}

	/**
	 * getIdNumber()
	 * @return Int with the employee's idNumber for the current instance
	*/
	public String getIdNumber () {
		return idNumber;
	}

	/**
	 * setIdNumber() sets the instance's idNumber field
	 * @param id an integer representing the employee's IdNumber
	*/
	public void setIdNumber (int id) {
		idNumber = id;
	}

	/**
	 * getDepartment()
	 * @return String object with the employee's department for the current instance
	*/
	public String getDepartment () {
		return department;
	}

	/**
	 * setDepartment() sets the instance's department field
	 * @param dep a String object representing the employee's department
	*/
	public void setDepartment (String dep) {
		department = dep;
	}

	/**
	 * getPosition()
	 * @return String object with the employee's position for the current instance
	*/
	public String getPosition () {
		return position;
	}

	/**
	 * setPosition() sets the instance's position field
	 * @param pos a String object representing the employee's position
	*/
	public void setPosition (String pos) {
		position = pos;
	}
}
