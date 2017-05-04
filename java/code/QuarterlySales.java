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
    double[] companyQuarterSales;
    // variables for calculations
    double companyYearSales, quarterAverage, divisionSales;
    int highestDivision;
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
        System.out.println("\nFULL YEAR SALES REPORT\n");

        getCompanySales();
        getDivisionalSales();
    }

    /**
     * getCompanySales displays sales totals for the company
    */
    public void getCompanySales () {
        // set year and quarterly sales accumulators
        companyYearSales = 0.0;
        companyQuarterSales = new double[QUARTERS];
        quarterAverage = 0.0;
        // report labeling
        System.out.println("\nCOMPANY SALES");
        // loop through quarters
        for (int q = 0; q < QUARTERS; q++) {
            // set highest comparator variable to zero
            highestDivision = 0;
            // add each division's sales to the accumulators and compare highest
            for (int d = 0; d < DIVISIONS; d++) {
                companyQuarterSales[q] += sales[d][q];
                companyYearSales += sales[d][q];
                if (sales[d][q] > sales[highestDivision][q]) { highestDivision = d; }
            }
            // output quarter
            System.out.printf("\n  Quarter %s: $%,3.2f", (q+1), companyQuarterSales[q]);
            // quarter comparison
            if (q > 0) { System.out.printf(" (%+,3.2f)", (companyQuarterSales[q] - companyQuarterSales[q-1])); }
            // calculate and output average
            quarterAverage = companyQuarterSales[q] / DIVISIONS;
            System.out.printf("\n    Average: $%,3.2f", quarterAverage);
            // output division with highest sales for the quarter
            System.out.printf("\n    Highest Division: %s\n", (highestDivision + 1));
        }
        // output company sales
        System.out.printf("\n  Year total: $%,3.2f\n\n", companyYearSales);
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
            System.out.print("\n  Division " + (i+1));
            // within each quarter
            for (int j = 0; j < QUARTERS; j++) {
                // add to division sales accumulator
                divisionSales += sales[i][j];
                // output divison quarter sales
                System.out.printf("\n    Quarter %s: $%,3.2f", (j+1), sales[i][j]);
                // quarter comparison
                if (j > 0) { System.out.printf(" (%+,3.2f)", (sales[i][j] - sales[i][j-1])); }
            }
            // output division year sales
            System.out.printf("\n  Year: $%,3.2f\n", divisionSales);
        }
    }
}
