/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	March 8th, 2017
	Chapter 4: #3 Distance File
*/
import java.io.*;		  // for file I/O
import java.util.Scanner; // to read keyboard input

public class DistanceFile {
	public static void main(String[] args) throws FileNotFoundException {
		// variable declarations
		int time,	  // store the hours traveled
			speed,    // stores the speed in mph
			distance; // store a calculation of time * speed
		Scanner key = new Scanner(System.in); // reads input from keyboard
		PrintWriter writer = new PrintWriter("Distance File.txt"); // writes to file

		// validate input with do-while wrappers
		do { // ask user for input at least once
			print("Hello there,\ntell me the speed of the thing in MPH:");
			speed = key.nextInt(); // store keyed integer in speed
		} while (speed < 0); 	   // check input validity; non-negative

		do { // ask at least once
			print("Thanks, now the time of travel in hours:");
			time = key.nextInt(); // store data in hours
		} while (time < 1); 	  // check input validity; is positive

		// begin writing to file with a table header
		writer.println("Hour  |  Distance Traveled\n--------------------------");
		// do math for each in hour and print result, use -time & +counter
		for (int i = 1; time != 0; time--, i++ ) {
			distance = speed * i;
			writer.printf("%2d %15d\n", i, distance);
		}
		writer.close(); // close file
	}

	// define a less annoying print function call
	public static void print(Object l) {
		System.out.println(l);
	}
}
