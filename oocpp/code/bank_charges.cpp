/*
  Carlos Vigil
  Dr. T. Laurasi
  OOC++
  March 20th 2017

  Chapter 4 Code Assignment
  Bank Charges
*/
#include <iostream>
#include <iomanip>
using namespace std;

int main () {
    // variable declarations
    double
        monthly_charge = 10,
        minimum_balance_charge = 15,
        beginning_balance,
        number_of_checks,
        check_charge_rate,
        check_charge,
        fee_total = 0;

    // ask for beginning balance and the number of checks
    cout << "What is the beginning account balance this month?\n";
    cin >> beginning_balance;
    cout << "And how many checks did you write?\n";
    cin >> number_of_checks;

    // Input validation
    if (beginning_balance < 0) {
        cout << "Be sure to budget, and save 15% of gross income.\nOh, URGENT!\n";
    }
    else if (number_of_checks < 0) {
        cout << "No, positive numbers only. Try again." << endl;
        main(); // Start program over
    }

    // if/else if through number of checks input by user and give total fees
    // less than 20 checks
    else if (number_of_checks < 20) {
        // let user know what charges are being added to the total
        cout << setprecision(2) << fixed
            << "Monthly checking account charge: $" << monthly_charge << endl;

        // Check minimum balance
        if (beginning_balance < 400) {
            // let user know what charges are being added and the total
            cout << setprecision(2) << fixed
                << "Minimum account balance charge: " << setw(2)
                << "$" << minimum_balance_charge << endl;
            fee_total += monthly_charge + minimum_balance_charge;
        } else {
            fee_total += monthly_charge;
        }

        // calculate check charge and add it to fee total
        check_charge_rate = 0.10;
        check_charge = check_charge_rate * number_of_checks;
        fee_total += check_charge;

        // let user know what charges are being added and the total
        cout << setprecision(2) << fixed
            << "Individual check charge rate: "
            << setw(4) << "$" << check_charge_rate << endl
            << "Check charge total: " << setw(14) << "$" << check_charge << endl
            << "Total service fees: " << setw(14) << "$" << fee_total << endl;

    }
    // less than 40 checks
    else if (number_of_checks < 40) {
        cout << setprecision(2) << fixed
            << "Monthly checking account charge: $" << monthly_charge << endl;

        if (beginning_balance < 400) {
            cout << "Minimum account balance charge: " << setw(2)
                << "$" << minimum_balance_charge << endl;
            fee_total += monthly_charge + minimum_balance_charge;
        } else {
            fee_total += monthly_charge;
        }

        check_charge_rate = 0.08;
        check_charge = check_charge_rate * number_of_checks;
        fee_total += check_charge;

    cout << setprecision(2) << fixed
            << "Individual check charge rate: "
            << setw(4) << "$" << check_charge_rate << endl
            << "Check charge total: " << setw(14) << "$" << check_charge << endl
            << "Total service fees: " << setw(14) << "$" << fee_total << endl;
    }
    // less than 60 checks
    else if (number_of_checks < 60) {
        cout << setprecision(2) << fixed
            << "Monthly checking account charge: $" << monthly_charge << endl;

        if (beginning_balance < 400) {
            cout << "Minimum account balance charge: " << setw(2)
                << "$" << minimum_balance_charge << endl;
            fee_total += monthly_charge + minimum_balance_charge;
        } else {
            fee_total += monthly_charge;
        }

        // calculate check charge and add it to fee total
        check_charge_rate = 0.06;
        check_charge = check_charge_rate * number_of_checks;
        fee_total += check_charge;

        cout << setprecision(2) << fixed
            << "Individual check charge rate: "
            << setw(4) << "$" << check_charge_rate << endl
            << "Check charge total: " << setw(14) << "$" << check_charge << endl
            << "Total service fees: " << setw(14) << "$" << fee_total << endl;
    }
    // More than 60 checks
    else if (number_of_checks >= 60) {
        cout << setprecision(2) << fixed
            << "Monthly checking account charge: $" << monthly_charge << endl;

        if (beginning_balance < 400) {
            cout << "Minimum account balance charge: " << setw(2)
                << "$" << minimum_balance_charge << endl;
            fee_total += monthly_charge + minimum_balance_charge;
        } else {
            fee_total += monthly_charge;
        }

        check_charge_rate = 0.04;
        check_charge = check_charge_rate * number_of_checks;
        fee_total += check_charge;

        cout << setprecision(2) << fixed
            << "Individual check charge rate: "
            << setw(4) << "$" << check_charge_rate << endl
            << "Check charge total: " << setw(14) << "$" << check_charge << endl
            << "Total service fees: " << setw(14) << "$" << fee_total << endl;
    }

    return 0;
}
