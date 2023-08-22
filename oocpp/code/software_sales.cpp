/*
	Carlos Vigil
	Dr. T. Laurasi
	OOC++
	March 20th, 2017

	Chapter 4 Code Assignment
	Software Sales
*/

#include <iostream>
#include <string>
using namespace std;

int main () {
	// variable declaration
	int individual_package_price = 99,
		user_input_quantity,
		total_retail_price,
		total_discount,
		total_discounted_price;
	string user_prompt = "How many packages are you purchasing?",
		result_preface = "The discounted price: $";

	// Ask the user to input a quantity
	cout << user_prompt << endl;
	cin >> user_input_quantity;

	// wonder what it means
	if (user_input_quantity < 0) {
		cout << "Nope, can't buy those back." << endl;
		main(); // run again
	} else if (user_input_quantity > 99) {
		cout << "That gets you a 50% discount!" << endl;
		// do the math
		total_retail_price = individual_package_price * user_input_quantity;
		total_discount = 0.50 * total_retail_price;
		total_discounted_price = total_retail_price - total_discount;
		// output discounted price
		cout << result_preface << total_discounted_price << endl;
	} else if (user_input_quantity > 49) {
		cout << "You get 40% off for that many." << endl;
		total_retail_price = individual_package_price * user_input_quantity;
		total_discount = 0.40 * total_retail_price;
		total_discounted_price = total_retail_price - total_discount;
		cout << result_preface << total_discounted_price << endl;
	} else if (user_input_quantity > 19) {
		cout << "30% off regular price is your discount." << endl;
		total_retail_price = individual_package_price * user_input_quantity;
		total_discount = 0.30 * total_retail_price;
		total_discounted_price = total_retail_price - total_discount;
		cout << result_preface << total_discounted_price << endl;
	} else if (user_input_quantity > 9) {
		cout << "20% off for the extra mini enterprise pack." << endl;
		total_retail_price = individual_package_price * user_input_quantity;
		total_discount = 0.20 * total_retail_price;
		total_discounted_price = total_retail_price - total_discount;
		cout << result_preface << total_discounted_price << endl;
	} else {
		cout << "No discount for that many, but you get stickers." << endl;
		total_retail_price = individual_package_price * user_input_quantity;
		total_discount = 0.50 * total_retail_price;
		total_discounted_price = total_retail_price - total_discount;
		cout << result_preface << total_discounted_price << endl;
	}
}