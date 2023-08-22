import java.util.Scanner;
/*
Carlos Vigil
Dr. C. Horvath
GCC Java
February 9th, 2017

Chapter 3
6. Time Calculator
Write a program that asks the user to enter a number of seconds.
    • There are 60 seconds in a minute. If the number of seconds entered by the
    user is greater than or equal to 60, the program should display the number
    of minutes in that many seconds.
    • There are 3,600 seconds in an hour. If the number of seconds entered by
    the user is greater than or equal to 3,600, the program should display the
    number of hours in that many seconds.
    • There are 86,400 seconds in a day. If the number of seconds entered by the
    user is greater than or equal to 86,400, the program should display the
    number of days in that many seconds.
*/

public class TimeCalculator {                   // boiler plate
    public static void main(String[] args) {    //boiler plate
        // variable definitions
        double
            seconds,                            // user entered integer
            minute = 60,                        // seconds in a minute
            hour   = 3_600,                     // seconds in an hour
            day    = 86_400,                    // seconds in a day
            mathed;                             // stores a calculated value
        Scanner scan = new Scanner(System.in);  // collects user input

        // Collect data from the user, with a friendly attitude
        System.out.println("Hey, gimme a number of seconds.");
        seconds = scan.nextInt();               // store user's integer
        System.out.println("Ok, thanks.");

        // think about it
        if (seconds >= day) {                   // is it a day?
            mathed = seconds / day;             // do some math
            System.out.printf("That's %.2f day(s).", mathed); // share results
        }
        else if (seconds >= hour) {             // is it an hour?
            mathed = seconds / hour;
            System.out.printf("That's %.2f hour(s).", mathed);
        }
        else if (seconds >= minute) {           // is it a minute?
            mathed = seconds / minute;
            System.out.printf("That's %.2f minute(s).", mathed);
        }
        else {                                // it's under a minute
            System.out.println("That's not much to work with...");
            if (seconds == 30) {
                System.out.println("that's half a minute.");
            }
            else if (seconds > 30) {
                System.out.println("it's over half a minute.");
            } else {
                System.out.println("it's under half a minute.");
            }
        }

        // add a line break
        System.out.println();
    }
}