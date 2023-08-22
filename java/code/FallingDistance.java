/**
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	April 4th, 2017
	Chapter 5: #5 Falling Distance

	When an object is falling because of gravity, the following formula can be
	used to determine the distance the object falls in a specific time period:
		d = 1/2 gt^2
	The variables in the formula are as follows: d is the distance in meters, g
	is 9.8, and t is the amount of time, in seconds, that the object has been
	falling.

	Write a method named fallingDistance that accepts an object’s falling time
	(in seconds) as an argument. The method should return the distance, in
	meters, that the object has fallen during that time interval. Demonstrate
	the method by calling it in a loop that passes the values 1 through 10 as
	arguments, and displays the return value.
*/
import java.lang.Math;

public class FallingDistance {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " seconds, " + fallDistance(i) + " meters");
		}
	}

	/**
	 * fallingDistance
	 * @param seconds Integer representing seconds object has fallen
	 * @return Distance the object has fallen in meters
	 */
	public static double fallDistance(int seconds) {
		double distanceFallen = 0.5 * (9.8 * Math.pow(seconds, 2));

		return distanceFallen;
	}
}
