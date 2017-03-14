import java.util.Scanner;
/*
Carlos Vigil
Dr. C. Horvath
GCC Java
February 9th, 2017

Chapter 3
7. Sorted names
Write a program that asks the user to enter three names, and then displays
the names sorted in ascending order. For example, if the user entered
“Charlie”, “Leslie”, and “Andy”, the program would display:
    Andy Charlie Leslie
*/

public class SortedNames {
    public static void main(String[] args) {
        // variable definitions
        String name1, // store user input for a name
               name2,
               name3,
               ask = "Please enter 3 names by typing each and pressing enter:";
        Scanner scan = new Scanner(System.in); // create input scanner shorthand

        // gather information by asking for names
        System.out.println(ask);
        name1 = scan.nextLine(); // user enters names
        name2 = scan.nextLine();
        name3 = scan.nextLine();
        System.out.println();    // add space for readibility in terminal

        // logic; prints are displaying the prioritized name
        if (name1.compareTo(name2) < 0 && name1.compareTo(name3) < 0) {
            System.out.println(name1);
            if (name2.compareTo(name3) < 0) {
                System.out.println(name2);
                System.out.println(name3);
            }
            else {
                System.out.println(name3);
                System.out.println(name2);
            }
        }
        else if (name2.compareTo(name1) < 0 && name2.compareTo(name3) < 0) {
            System.out.println(name2);
            if (name1.compareTo(name3) < 0) {
                System.out.println(name1);
                System.out.println(name3);
            }
            else {
                System.out.println(name3);
                System.out.println(name1);
            }
        }
        else {
            System.out.println(name3);
            if (name1.compareTo(name2) < 0) {
                System.out.println(name1);
                System.out.println(name2);
            }
            else {
                System.out.println(name2);
                System.out.println(name1);
            }
        }

        // Tell them what happened
        System.out.println("The names are now sorted alphabetically.");
    }
}
