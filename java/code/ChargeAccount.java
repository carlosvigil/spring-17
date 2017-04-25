/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	April 25th, 2017
	Chapter 7 -
*/

/*
    3. Charge Account Validation
    Create a class with a method that accepts a charge account number as its
    argument. The method should determine whether the number is valid by
    comparing it to the following list of valid charge account numbers:

        5658845 4520125 8080152 4562555 1005231 6545231 7895122 8777541 5552012
        5050552 3852085 7576651 8451277 7825877 7881200 1302850 1250255 4581002

    These numbers should be stored in an array or an ArrayList object. Use a
    sequential search to locate the number passed as an argument. If the number
    is in the array, the method should return true, indicating the number is
    valid. If the number is not in the array, the method should return false,
    indicating the number is invalid.

    Write a program that tests the class by asking the user to enter a charge
    account number. The program should display a message indicating whether the
    number is valid or invalid.
*/


/**
 * ChargeAccount stores an int array of account numbers and validates account;
*/
public class ChargeAccount {
     int[] accounts = { 5658845, 4520125, 8080152, 4562555, 1005231, 6545231,
            7895122, 8777541, 5552012, 5050552, 3852085, 7576651, 8451277,
            7825877, 7881200, 1302850, 1250255, 4581002 };

    /**
     * ChargeAccount constructor receives an int for an account number and
     * checks for validity againsts a stored accounts array.
     * @param accountNum int to check for validity.
    */
    public ChargeAccount (int accountNum) {
        if (sequentialSearch(accountNum, accounts)) {
            System.out.println("Account number recognized.");
        } else {
            System.out.println("Incorrect account number.");
        }
    }

    /**
     * sequentialSearch() checks for an account number in a data store of accounts.
     * @param search int to compare.
     * @param array to search in.
     * @return Boolean which let's the calling method know of a match.
    */
    private Boolean sequentialSearch (int search, int[] array) {
        Boolean found = false;
        int index = 0;

        while(!found && index < array.length) {
            found = search == array[index] ? true : false;
            index++;
        }

        return found;
    }
}
