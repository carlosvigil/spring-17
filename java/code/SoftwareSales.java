import java.util.Scanner;
/*
    Carlos Vigil
    Dr. Horvath
    Java
    February 7th, 2017
*/

// Chapter 3, #8 Software Sales
public class SoftwareSales
{
    public static void main(String[] args)
    {
        int bargain; // the user entered number of packages
        String prompt = "How many packages are you purchasing?\n"; // ask user
        Scanner keyboard = new Scanner(System.in); // reads input

        // Ask the user for a number
        System.out.print(prompt);
        bargain = keyboard.nextInt();

        // wonder what it means
        if (bargain > 99) {
            System.out.println("That gets you a 50% discount!");
        } else if (bargain > 49) {
            System.out.println("You get 40% off for that many.");
        } else if (bargain > 19) {
            System.out.println("30% off regular price is your discount.");
        } else if (bargain > 9) {
           System.out.println("20% off for the extra mini enterprise pack."); 
        } else {
            System.out.println("No discount for that many, but you get stickers.");
        }
    }
}


/*
    8. Software Sales
    A software company sells a package that retails for $99. Quantity discounts
    are given according to the following table:
    Quantity Discount
        10–19 20%
        20–49 30%
        50–99 40%
        100 or more 50%
    Write a program that asks the user to enter the number of packages
    purchased. The program should then display the amount of the discount (if
    any) and the total amount of the purchase after the discount.
*/