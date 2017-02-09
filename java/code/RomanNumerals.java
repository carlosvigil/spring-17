import java.util.Scanner;
/*
    Carlos Vigil
    Dr. Horvath
    Java
    February 7th, 2017
*/

// Chapter 3, #1 Roman Numerals
public class RomanNumerals {
    public static void main(String[] args) {
        int num; // will store user input
        String ask = "This computer has prompted you to enter a number.\nDo so now:";
        Scanner key = new Scanner(System.in); // collects input

        // ask the user for a number and collect it in memory
        System.out.println(ask);
        num = key.nextInt();

        // output mechanism
        switch (num) {
            case 1:
                System.out.println("The Roman numeral is: I");
                break;
            case 2:
                System.out.println("The Roman numeral is: II");
                break;
            case 3:
                System.out.println("The Roman numeral is: III");
                break;
            case 4:
                System.out.println("The Roman numeral is: IV");
                break;
            case 5:
                System.out.println("The Roman numeral is: V");
                break;
            case 6:
                System.out.println("The Roman numeral is: VI");
                break;
            case 7:
                System.out.println("The Roman numeral is: VII");
                break;
            case 8:
                System.out.println("The Roman numeral is: VIII");
                break;
            case 9:
                System.out.println("The Roman numeral is: IX");
                break;
            case 10:
                System.out.println("The Roman numeral is: X");
                break;

            default:
                System.out.println("eh, try 1 through 10");
                break;
        }
    }
}

/* 1. Roman numerals
 Write a program that prompts the user to enter a number within the range of
 1 through 10. The program should display the Roman numeral version of that
 number. If the number is outside the range of 1 through 10, the program
 should display an error message. */