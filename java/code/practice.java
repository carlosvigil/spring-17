/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	April 19th, 2017
	Chapter 6 - Personal Information Class
*/

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
        int month, year;
		Scanner keyIn = new Scanner(System.in);

		// communicate
		System.out.println("\nType in the number for the month and year,\n"
				+ "pressing enter for each.\n");

		// input + validation
		do {
			System.out.print("Month: ");
			month = keyIn.nextInt();
		} while (month < 1 || month > 12);

		do {
			System.out.print("Year: ");
			year = keyIn.nextInt();
		} while (year < 0);

		// output
		MonthDays date = new MonthDays(month, year);
		System.out.println(date.getNumberOfDays() + " days\n");
	}
}
