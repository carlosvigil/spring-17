/**
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	April 4th, 2017
	Chapter 5

	#15. even/odd counter
	You can use the following logic to determine whether a number is even or odd:

	if ((number % 2) == 0) {
	// The number is even. }
	else {
	// The number is odd. }

	Write a program with a method named isEven that accepts an int argument.
	The method should return true if the argument is even, or false otherwise.
	The program’s main method should use a loop to generate 100 random
	integers. It should use the isEven method to determine whether each random
	number is even, or odd. When the loop is finished, the program should
	display the number of even numbers that were generated, and the number of
	odd numbers.

*/

public class practice {
	public static void main(String[] args) {
		int even = 0, odd = 0;

		for (int i = 1; i <= 100; i++) {
			if (isEven(i)) even++; else odd++;
		}
		System.out.println("Even: " + even + ", Odd: " + odd);
	}

	/**
	 */
	public static boolean isEven(int num) {
		if ((num % 2) == 0) {
			System.out.println("The number " + num + " is even");
			return true;
		} else {
			System.out.println("The number " + num + " is odd");
			return false;
		}
	}
}
