
/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	March 27th, 2017
	Chapter 5: #18 ESP Game

	18. ESP Game Write a program that tests your ESP (extrasensory perception).
	The program should randomly select the name of a color from the following
	list of words:

	Red, Green, Blue, Orange, Yellow

	To select a word, the program can generate a random number. For example, if
	the number is 0, the selected word is Red; if the number is 1, the selected
	word is Green; and so forth.

	Next, the program should ask the user to enter the color that the computer
	has selected. After the user has entered his or her guess, the program
	should display the name of the ran- domly selected color. The program
	should repeat this 10 times and then display the number of times the user
	correctly guessed the selected color. Be sure to modularize the program
	into methods that perform each major task.
 */

import java.util.Scanner;
import java.util.Random;

public class EspGame {
	public static void main(String[] args) {
		// Variable declaration
		int number;							// Stores a random number
		int score; 							// Stores the user's correct guesses
		Random newRandom = new Random(5); 	// creates a random number
		String userGuess; 					// stores the user's string

		// introduce the game and color options
		intro();
		// run the game 10 times
		for (int i = 10; i != 0; i--) {
			// generate a new random number and store it
			number = newRandom.nextInt();
			// store user's input
			userGuess = getString();
			// main game function adds 1 to score if correct guess
			score += gameLogic(userGuess, number);
			System.out.println("\nRounds left: " + i);
		}
		// return total score
		totalScore(score);
	}

	/**
	 * intro Presents the game, rules, and what the user could expect
	 */
	public static void intro() {
		System.out.print("Welcome to the ESP Game!\n"
				+ "We'll take 10 turns, then show you a score.\n"
				+ "One of these colors will be randomly chosen, guess which one:\n"
				+ "- red\n- green\n- blue\n- orange\n- yellow\n");
	}

	/**
	 * getString Checks the user entered String and returns it
	 * @return userGuess The validated String entered by the user
	 */
	public static String getString() {
		Scanner keyboard = new Scanner(System.in);	// scans for key input
		String userGuess; 							// stores the user's string
		boolean valid;								// checks for a string match

		valid = userGuess == "red"
				|| userGuess == "blue" || userGuess == "green"
				|| userGuess == "orange" || userGuess == "yellow";

		// get string
		userGuess = keyboard.next();
		// ask for valid input
		while (!valid)
		{
			System.out.println("try typing the color exactly as it was shown");
			userGuess = keyboard.next();
		}
		// return validated string
		return userGuess;
	}

	/**
	 * gameLogic Checks the user entered String against the random String
	 * @param userGuess The string entered by the user in the main() method
	 * @param number The randomly generated number to use in a switch statement
	 * @return An integer to add to the score variable in main
	*/
	public static int gameLogic(String userGuess, int number) {
		// Define a switch to compare the strings
		switch (number) {
		case 0:
			if (userGuess == "red") {
				System.out.println("You got it!");
				return 1;
			} else {
				System.out.println("Nope");
				return 0;
			}
			break;
		case 1:
			if (userGuess == "green") {
				System.out.println("You got it!");
				return 1;
			} else {
				System.out.println("Nope");
				return 0;
			}
			break;
		case 2:
			if (userGuess == "blue") {
				System.out.println("You got it!");
				return 1;
			} else {
				System.out.println("Nope");
				return 0;
			}
			break;
		case 3:
			if (userGuess == "orange") {
				System.out.println("You got it!");
				return 1;
			} else {
				System.out.println("Nope");
				return 0;
			}
			break;
		case 4:
			if (userGuess == "yellow") {
                System.out.println("You got it!");
                return 1;
            } else {
                System.out.println("Nope");
                return 0;
            }
        }
    }

    /**
     * totalScore Outputs a total of user correct guesses
     * @param score The user's score stored in an interger
     */
    public static void totalScore(int score) {
        System.out.println("\nYour total score is: " + score + "/10");
    }
}
