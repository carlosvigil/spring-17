#include <iostream>
#include <string>
using namespace std;

int main() {
	// variable declarations
	// variables to store user input
	int radius,				// store circle radius
		length,				// length of a rectangle
		width,				// width of a rectangle
		base,				// base length of a triangle
		height,				// height of a triangle
		selection;			// store user selection
	double pi = 3.14159;	// store a pi value

	// Variables to store output strings for readability
	string
		// selection menu
		menu = "Welcome, make a selection by entering a number:"
			"\n  1. Calculate the area of a circle"
			"\n  2. Calculate the area of a rectangle"
			"\n  3. Calculate the area of a triangle"
			"\n  4. Quit",
		// questions for formula variables
		circle_question = "What's the radius of the circle?",
		rectangle_question = "Input the length, then, the width.",
		triangle_question = "Type and enter the base, then, the height.",
		// preface result output
		pre = "The area is ",
		// positive only error message
		neg = "Enter only positive numbers";

	// Ask user for and store a menu selection
	cout << menu << endl;
	cin >> selection;

	// compare user selection to decide which formula to use
	// check input validity before continuing
	if (selection < 1 || selection > 4) {
		// restart program
		// WARN: Infinite loop when user enters non-number
		cout << "Incorrect selection. Let's start over." << endl;
		main();
	}
	// circle selected
	else if (selection == 1) {
		cout << circle_question << endl;
		cin >> radius;

		// check for positive user input
		// then do calculations and output them, or, output an error
		radius > 0
		? cout << pre << pi * (radius * radius) << endl
		: cout << neg << endl;
	}
	// rectangle selected
	else if (selection == 2) {
		cout << rectangle_question << endl;
		cin >> length >> width;

		length > 0 && width > 0
		? cout << pre << length * width << endl
		: cout << neg << endl;
	}
	// triangle selected
	else if (selection == 3) {
		cout << triangle_question << endl;
		cin >> base >> height;

		base > 0 && height > 0
		? cout << pre << (base * height) * 0.5 << endl
		: cout << neg << endl;
	} else {
		return 0;
	}
}
