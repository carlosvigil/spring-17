/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	May 5th, 2017
	Chapter 8 - #9 Geometry Calculator
*/
import java.util.Scanner;

public class GeometryCalculatorMain {
    // declare a scanner for keyboard input
	static Scanner keyb = new Scanner(System.in);

	public static void main(String[] args) {
		mainMenu();
	}

	private static void mainMenu() {
		int selection;

		// persist until user exits
		do {
			// ask how to proceed with a menu
			do {
				System.out.print("\n–––––––––––––––––––––––––––––––––––––––––––––"
						+ "\nType one of the numbers shown and press enter."
                        + "\n\nCalculate the area of a:"
						+ "\n1 circle"
						+ "\n2 rectangle"
						+ "\n3 triangle"
						+ "\n\n4 Exit"
						+ "\n\n  Enter your selection: "
				);
				selection = keyb.nextInt();
                // error messaging
                if (selection < 1 || selection > 4) {
                    System.out.println("  ERROR: Type a digit from 1 to 4.");
                    // reset selection
                    selection = 0;
                }
			} while (selection < 1 || selection > 4);
			System.out.println("–––––––––––––––––––––––––––––––––––––––––––––");
            // send selection to logic
			selectionLogic(selection);
		} while (selection != 4);
	}

	private static void selectionLogic(int selection) {
		switch (selection) {
			case 1:
				double radius;
				do {
					System.out.print("\nEnter the radius of the circle: ");
					radius = keyb.nextDouble();
					// error check
					if (radius < 0.0001) {
						System.out.println("ERROR: Enter a positive number.");
						radius = 0.0;
					}
				} while (radius < 0.0001);
				System.out.println("The area is: "
						+ GeometryCalculator.areaFormula(radius));
				break;
			case 2:
				double width, length;
				do {
					System.out.print("\nEnter the width of the rectangle: ");
					width = keyb.nextDouble();
					System.out.print("Enter the length of the rectangle: ");
					length = keyb.nextDouble();
					// error check
					if (width < 0.0001 || length < 0.0001) {
						System.out.println("ERROR: Enter only positive numbers.");
						width = 0.0;
						length = 0.0;
					}
				} while (width < 0.0001 || length < 0.0001);
				System.out.println("The area is: "
					+ GeometryCalculator.areaFormula(width, length));
				break;
			case 3:
				double base, height;
				do {
					System.out.print("\nEnter the base of the rectangle: ");
					base = keyb.nextDouble();
					System.out.print("Enter the height of the rectangle: ");
					height = keyb.nextDouble();
					// error check
					if (base < 0.0001 || height < 0.0001) {
						System.out.println("ERROR: Enter only positive numbers.");
						base = 0.0;
						height = 0.0;
					}
				} while (base < 0.0001 || height < 0.0001);
				System.out.println("The area is: "
					+ GeometryCalculator.areaFormula(true, base, height));
				break;
		}
	}
}
