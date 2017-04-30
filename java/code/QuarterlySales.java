/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	April 29th, 2017
	Chapter 7 - Quarterly Sales Statistics
*/
import java.util.Scanner;

public class QuarterlySales {
    // constants for iteration etc.
    final int DIVISIONS = 6;
    final int QUARTERS = 4;
    // arrays for sales storage
    double[][] sales;
    // scanner for keyboard input
    Scanner keyb = new Scanner(System.in);

    public QuarterlySales () {
        sales = new double[DIVISIONS][QUARTERS];
    }

    /**
     * setAllDivisionSales Procedurally asks for and enters the sales data for
     * each of 4 quarters and 6 divisions.
    */
    public void setAllDivisionSales () {
        // loop through divisions
        for (int i = 0; i < DIVISIONS; i++) {
            System.out.print("\nDivision " + (i+1) + ", ");

            // loop through quarters in each division
            for (int j = 0; j < QUARTERS; j++) {
                System.out.print( "Quarter " + (j+1)
                        + "\nPlease enter the sales: ");
                do { sales[i][j] = keyb.nextDouble(); } while (sales[i][j] < 0.0);
            }
        }
    }

    public void setQuarterSales (int division, int quarter) {
        System.out.print("Enter the sales: ");
        sales[division][quarter] = keyb.nextDouble();
    }

    public void getAllSales () {
        for (int i = 0; i < DIVISIONS; i++) {
            System.out.println("Hello");
        }
    }
}
