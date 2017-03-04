//
//  InterestEarned.hpp
//  code
//
//  Created by Carlos Vigil on 2/15/17.
//  Copyright © 2017 Carlos Vigil. All rights reserved.
//
/*
 Carlos Vigil
 Dr. Laurasi
 GCC OOC++
 Feb. 16th 2017
 
 Chapter 3 Code Assignment
 Interest Earned
 Calculate compound interest in Savings account
*/
 
#include <iomanip>
#include <cmath>
using namespace std;

int InterestEarned()
{
    double            // variable definition
        interestRate, // the rate of interest is stored here
        principal,    // the base amount in the account
        interest,     // the calculated amount of total interest
        total;        // a calculated total adding the interest and principal
    int compound;     // the amount of times the interest is compounding
    
    // Ask for input
    cout << "Hello there, let's calculate the amount of interest you've earned."
         << endl
         << "Ok, first, let's input what your bank's interest rate is in %:\n"
         << endl;
    // Store the user input interest rate
    cin >> interestRate;
    // ask for more input
    cout << "\n"
         << "Thanks. We'll need a couple more things, so enter them one after\n"
         << "another in the order that they are mentioned. The amount\n"
         << "of times the interest has compounded, and second, the principal:\n"
         << endl;
    // Store more information in variables
    cin >> compound >> principal;

    // Calculations
    interestRate = interestRate / 100;
    interest = principal * (pow((1 + interestRate / compound), compound)) - principal;
    total = principal + interest;

    // Display information
    cout << "\nInterest rate:"     // interest rate
         << right << setw(17) << interestRate * 100 << "%";

    cout << "\nTimes compounded:"  // compound
         << right << setw(15) << compound;

    cout << "\nPrincipal:"         // principal
         << setprecision(2) << fixed
         << right << setw(15) << "$" << principal;

    cout << "\nInterest:"          // interest
         << setprecision(2) << fixed
         << right << setw(18) << "$" << interest;

    cout << "\nAmount in Savings:" // total
         << setprecision(2) << fixed
         << right << setw(7) << "$" << total;

    return 0;
}
