/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	April 25th, 2017
	Chapter 7 -
*/
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);

		// Output instructions
		System.out.print("\nEnter a 7 digit account number:");
		ChargeAccount account = new ChargeAccount(keyb.nextInt());
	}
}
