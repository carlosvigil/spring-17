/*
 	Carlos Vigil
	Dr. T. Laurasi
	OOC++
	March 20, 2017

	Chapter 4 Code Assignment
	Mobile Service Provider
*/
#include <iostream>
using namespace std;

int main () {
	char customer_selected_package;
	double used_minutes,
		package_provided_minutes,
		overage_rate,
		overage_minutes,
		monthly_service_fee;

	cout << "Enter your package letter (a, b, or c) :\n";
	cin >> customer_selected_package;

	switch (customer_selected_package) {
		case 'a':
			// package values assignments
			monthly_service_fee = 39.99;
			package_provided_minutes = 450;
			overage_rate = 0.45;

			cout << "How many minutes have you used?\n";
			cin >> used_minutes;

			// check for and charge overage
			if (used_minutes > package_provided_minutes) {
				overage_minutes = used_minutes - package_provided_minutes;
				monthly_service_fee += overage_rate * overage_minutes;

				cout << "Your total due is: $" << monthly_service_fee << endl;
			}
			else {
				cout << "Your total due is: $" << monthly_service_fee << endl;
			}
			break;

		case 'b':
			monthly_service_fee = 59.99;
			package_provided_minutes = 900;
			overage_rate = 0.40;

			cout << "How many minutes have you used?\n";
			cin >> used_minutes;

			if (used_minutes > package_provided_minutes) {
				overage_minutes = used_minutes - package_provided_minutes;
				monthly_service_fee += overage_rate * overage_minutes;

				cout << "Your total due is: $" << monthly_service_fee << endl;
			}
			else {
				cout << "Your total due is: $" << monthly_service_fee << endl;
			}

			break;

		case 'c':
			monthly_service_fee = 69.99;
			cout << "Your total due is: $" << monthly_service_fee << endl;
			break;

		default:
			cout << "That's not a valid package selection.\n";
			main(); // Start over
	}

	return 0;
}