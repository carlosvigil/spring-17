/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	April 25th, 2017
	Chapter 7 - 1. Rainfall Class
*/

// 1. Rainfall Class
// Write a RainFall class that stores the total rainfall for each of 12 months
// into an array of doubles. The program should have methods that return the
// following:

// Demonstrate the class in a complete program.
// Input Validation: Do not accept negative numbers for monthly rainfall figures.

import java.util.Scanner;

/**
 * RainFall stores the total rainfall for 12 months into an array.
 */
public class RainFall {
    final int MONTHS_IN_YEAR = 12;
    double rainfallTotal;
    double[] rainfallRecords = new double[MONTHS_IN_YEAR];

    /**RainFall constructor only creates an instance without changing fields.*/
	public RainFall () {}

    /**
     * setRecords() outputs a month number and waits for input, storing each
     * value into an array, 12 times.
    */
    public void setRecords() {
        rainfallTotal = 0.0;
        Scanner keyb = new Scanner(System.in);

        for (int i = 0; i < MONTHS_IN_YEAR; i++) {
            System.out.println("\nMonth: " + (i + 1) + "\nHow much did it rain?");
            rainfallRecords[i] = keyb.nextDouble();
            rainfallTotal += rainfallRecords[i];
        }
    }

    /**
     * getRecords() outputs the rainfall values for each month and the year
     * total.
    */
    public void getRecords() {
        for (int i = 0; i < MONTHS_IN_YEAR; i++) {
            System.out.println("Month " + (i + 1) + ": " + rainfallRecords[i]);
        }
        System.out.println("Total: " + rainfallTotal);
    }
}
