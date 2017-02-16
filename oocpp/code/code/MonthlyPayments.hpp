//
//  MonthlyPayments.hpp
//  code
//
//  Created by Carlos Vigil on 2/16/17.
//  Copyright © 2017 Carlos Vigil. All rights reserved.
//
#include <iomanip>
#include <cmath>
using namespace std;

int MonthlyPayments()
{
    // define variables
    double
        interestRate,   // monthly interest rate
        loanAmount,     // the amount of the loan
        monthlyBalance, // the amount to be paid each month
        total,          // the total paid including interest
        interestPaid;   // the interest totaled
    int numPayments;    // the number of payments

    // begin user introduction and data collection
    cout << "Hi, we're going to calculate your monthly payments for a loan.\n"
         << "Enter the following information using only numbers or decimals.\n"
         << "Loan Amount: ";            // Ask for loan amount
    cin >> loanAmount;                  // Store the loan amount
    cout << "Annual Interest Rate %: "; // Ask for the interest rate
    cin >> interestRate;                // Store the user input interest rate
    cout << "Number of Payments: ";     // Ask for the number of payments
    cin >> numPayments;                 // Store the number of payments

    // Calculations
    interestRate /= 100;                      // convert annual interest rate to decimal form
    interestPaid = loanAmount * interestRate; // calculate total interest
    total = loanAmount + interestPaid;        // calculate total of loan and interest
    interestRate /= 12;                       // convert interest rate from to monthly rate
    // intermission
    double // split monthly balance equation into variables for readibility
        monthBalanceEquationOne = interestRate * pow((1 + interestRate), numPayments),
        monthBalanceEquationTwo = pow((1 + interestRate), numPayments) - 1;
    // continue Calculations
    monthlyBalance = monthBalanceEquationOne / monthBalanceEquationTwo * loanAmount;

    // Display information
    cout << "\nLoan Amount:" // Loan amount
         << setprecision(2) << fixed
         << right << setw(15)
         << "$" << loanAmount

         << "\nMonthly Interest Rate:" // Monthly interest rate
         << right << setw(12)
         << interestRate * 100 << "%"

         << "\nNumber of payments:" // Number of payments
         << right << setw(16)
         << numPayments

         << "\nMonthly Payment:" // Monthly payment
         << right << setw(13)
         << "$" << monthlyBalance

         << "\nAmount Paid Back:" // Total to be paid
         << right << setw(10)
         << "$" << total

         << "\nInterest paid:" // Interest paid
         << right << setw(14)
         << "$" << interestPaid;

    return 0;
}
