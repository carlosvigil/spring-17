/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	March 8th, 2017
	Chapter 4: #3 Distance File
*/
import java.util.Scanner; // to read keyboard input

public class DistanceFile {
	public static void main(String[] args) {
		// variable declarations
		int time,   // used to store the hours traveled
			speed,  // stores the speed in mph
			distance;// stores a culculation of time * speed
		Scanner key = new Scanner(System.in);

		// validate input with do-while wrappers
		do { // ask user for input at least once
			print("Hello there,\n tell me the speed of the thing in MPH:");
			speed = key.nextInt(); // store integer in speed
		} while (speed < 0); // find out if stored data is not negative

		do {
			print("Thanks. Now the time of travel in hours:");
			time = key.nextInt(); // store hours
		} while (time < 1); // find out if stored data is a positive interger

		// being printing output with tabel heading
		print("Hour  |  Distance Traveled\n--------------------------");
		// do math for each hour and print it, use -time & +counter
		for (int i = 1; time != 0; time--, i++) {
			distance = speed * i;
			System.out.printf("%2d %15d\n", i, distance);
		}
	}

	// define a less annoying function call
	public static void print(Object l){
		System.out.println(l);
	}
}
