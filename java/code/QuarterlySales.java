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
    // variables for calculations
    double companySales, companyQuarter, quarterSales, quarterAverage, divisionSales;
    // scanner for keyboard input
    Scanner keyb = new Scanner(System.in);

    // Constructor; creates array set
    public QuarterlySales () {
        sales = new double[DIVISIONS][QUARTERS];
    }

    // MUTATORS
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

    /**
     * setQuarterSales sets the sales for a single quarter within a division
     * @param division Integer of the division selected
     * @param quarter Integer of the quarter selected
    */
    public void setQuarterSales (int division, int quarter) {
        System.out.print("Enter the sales: ");
        sales[division][quarter] = keyb.nextDouble();
    }

    // ACCESSORS
    /**
     * getAllSales displays all sales data for the year across the company.
    */
    public void getAllSales () {
        // report labeling
        System.out.println("\nFULL YEAR SALES REPORT");

        getDivisionalSales();
        getCompanySales();
    }

    /**
     * getDivisionalSales displays sales for all divisions.
    */
    public void getDivisionalSales () {
        // report labeling
        System.out.println("\nDIVISIONAL SALES");

        // within each division
        for (int i = 0; i < DIVISIONS; i++) {
            divisionSales = 0.0;

            // division labeling
            System.out.print("\nDivision " + (i+1));

            // within each quarter
            for (int j = 0; j < QUARTERS; j++) {
                divisionSales += sales[i][j];

                // output divison quarter sales
                System.out.print("\nQuarter " + (j+1) + " sales: $" + sales[i][j]);

                // Quarter comparisons
                if (j > 0 && sales[i][j] > sales[i][j-1]) {
                    // if greater than last quarter, display difference
                    System.out.print("  (+ $" + (sales[i][j] - sales[i][j-1]) + ")");
                }
                else if (j > 0 && sales[i][j] < sales[i][j-1]) {
                    // if lesser than last quarter, display difference
                    System.out.print("  (- $" + (sales[i][j-1] - sales[i][j]) + ")");
                }

                // TODO: find top and averages

                // outside of quarter
            }

            // output division year sales
            System.out.println("\nYear sales for division: $" + divisionSales);
        }
    }

    /**
     * getCompanySales displays sales totals for the company
    */
    public void getCompanySales () {
        companySales = 0.0;
        companyQuarter = 0.0;
        // companySales +=

        // loop through quarters
        for (int i = 0; i < QUARTERS; i++) {
            for (int j = 0; j < DIVISIONS; j++) {

            }
        }

        // output company sales
        System.out.println("\nYear sales for company: $" + companySales);
    }
}
