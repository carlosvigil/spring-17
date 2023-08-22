/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	April 19th, 2017
	Chapter 6 - Days in a Month
*/

/**
 * MonthDays finds the number of days in a month
 */
public class MonthDays {
	int month, year;
	// constructor
    public MonthDays (int m, int y) {
		month = m;
		year = y;
    }
	/**
	 * getNumberOfDays decides if the given year is a leap year then returns
	 * the number of days in the given month
	 * @return an Interger with the number of days in the month
	*/
	public int getNumberOfDays() {
		if (year % 100 == 0 && year % 400 == 0 || year % 4 == 0) {
			// return leap year days
			return months(month, true);
		} else {
			// return non leap year days
			return months(month, false);
		}
	}

	/**
	 * months holds data for days in each month including leap years
	 * @param month an interger from 1-12 representing the month
	 * @param leapYear a Boolean to decide if the year has more days than usual
	 * @return The number of days in the month
	*/
	private int months(int month, Boolean leapYear) {
		int days; // the return value of days in the selected month

		switch (month) {
			case 1:
				days = 31;
				break;
			case 2:
				days = leapYear ? 29 : 28;
				break;
			case 3:
				days = 31;
				break;
			case 4:
				days = 30;
				break;
			case 5:
				days = 31;
				break;
			case 6:
				days = 30;
				break;
			case 7:
				days = 31;
				break;
			case 8:
				days = 31;
				break;
			case 9:
				days = 30;
				break;
			case 10:
				days = 31;
				break;
			case 11:
				days = 30;
				break;
			case 12:
				days = 31;
				break;

			default:
				days = 0;
				break;
		}
		return days;
	}
}
