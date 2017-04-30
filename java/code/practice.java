/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	April 29th, 2017
	Chapter 7 - Quarterly Sales Statistics
*/
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		mainMenu();
	}

	private void mainMenu() {
		Scanner keyb = new Scanner(System.in);
		int selection;

		// ask how to proceed with a menu
		do {
			System.out.println(
					"\n1. Enter all sales data"
					+ "\n2. Enter data for a single quarter in a division"
					+ "\n3. View all sales data"
			);
			selection = keyb.nextInt();
		} while (selection < 0);

		majorSelectionLogic(selection);
	}

	private void majorSelectionLogic(int selection) {
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

			default:
				break;
		}
	}

	private int minorMenu() {
		Scanner keyb = new Scanner(System.in);
		int division;
		int quarter;

		// ask how to proceed with a menu
		do {
			System.out.print("Enter a division number(1-6): ");
			division = keyb.nextInt();
		} while (selection < 0 || selection > 6);

		do {
			System.out.print("Enter a quarter number(1-4): ");
			quarter = keyb.nextInt();
		} while (selection < 0 || selection > 4);

		setQuarterSales(division, quarter);
	}
