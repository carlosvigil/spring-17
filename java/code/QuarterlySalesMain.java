/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	April 29th, 2017
	Chapter 7 - Quarterly Sales Statistics
*/
import java.util.Scanner;

public class QuarterlySalesMain {
    static QuarterlySales salesThisYear = new QuarterlySales();

	public static void main(String[] args) {
		mainMenu();
	}

	private static void mainMenu() {
		Scanner keyb = new Scanner(System.in);
		int selection;

		// persist until user exits
		do {
			// ask how to proceed with a menu
			do {
				System.out.print("\n–––––––––––––––––––––––––––––––––––––––––––––"
						+ "\nType one of the numbers shown and press enter."
						+ "\n1. Enter all sales data"
						+ "\n2. Enter sales for a single quarter in a division"
						+ "\n3. View all sales data"
						+ "\n4. Exit"
						+ "\n\nSelection: "
				);
				selection = keyb.nextInt();
			} while (selection < 0);
			System.out.println("–––––––––––––––––––––––––––––––––––––––––––––");

			majorSelectionLogic(selection);
		} while (selection != 4);
	}

	private static void majorSelectionLogic(int selection) {
		switch (selection) {
			case 1:
				salesThisYear.setAllDivisionSales();
				break;
			case 2:
				minorMenu();
				break;
			case 3:
				salesThisYear.getAllSales();
				break;
		}
	}

	private static void minorMenu() {
		Scanner keyb = new Scanner(System.in);
		int division;
		int quarter;

		do {
			System.out.print("\nEnter a division number(1-6): ");
			division = keyb.nextInt() - 1;
		} while (division < 1 || division > 6);

		do {
			System.out.print("Enter a quarter number(1-4): ");
			quarter = keyb.nextInt() - 1;
		} while (quarter < 1 || quarter > 4);

		salesThisYear.setQuarterSales(division, quarter);
    }
}
