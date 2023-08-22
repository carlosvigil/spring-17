//
//  midterm.hpp
//  code
//
//  Created by Carlos Vigil on 2/28/17.
//  Copyright © 2017 Carlos Vigil. All rights reserved.
//
#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

int main() {
    //  variable declarations
    string first_name,           // store user inputted first name
           last_name;            // store user inputted last name
    double work_hours,           // store the number of worked hours
           overtime_hours,       // store the number of hours over 40 hours
           gross_pay,            // store the total pay before tax
           tax_total,            // store the calculated tax from gross pay
           net_pay,              // store the pay total after subtracting tax from gross
           pay_rate = 20.0,      // stores the rate of pay for normal hours
           overtime_rate = 25.0, // stores the rate of pay for overtime hours
           tax_percent = 0.15;   // stores the tax percent to be applied to gross

    //  collect information
    cout << "Hello there, we're going to calculate your net pay."
        << "\nBut first, what is your first name?" << endl;
    cin >> first_name;
    cout << "\nLast name:" << endl;
    cin >> last_name;

    cout << "\nOK, " << first_name << " " << last_name << ", "
        << "please enter the number of hours you worked.\n";
    cin >> work_hours;

    cout << "\nCalculating...\n\n";
    //  calculations
    overtime_hours = work_hours - 40.0;  // figure out hours for overtime
    // multiply normal hours by normal rate
    gross_pay = (pay_rate * work_hours) + (overtime_rate * overtime_hours);
    tax_total = tax_percent * gross_pay; // get tax by multiplying tax and gross
    net_pay = gross_pay - tax_total; // subtract taxes from gross pay to get net

    // output
    cout << first_name << " " << last_name
         << "\nThe work hours:" << setw(10) << work_hours
         << "\nThe overtime hours:" << setw(6) << overtime_hours
         << "\nThe gross payment:" << setw(6) << "$" << showpoint << gross_pay
         << "\nThe tax:" << setw(16) << "$" << showpoint << tax_total
         << "\nThe net payment:" << setw(8) << "$" << showpoint << net_pay;

    return 0;
}
