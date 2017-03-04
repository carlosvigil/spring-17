**1\. Interest earned**  
Assuming there are no deposits other than the original instruments, the balance in a saving account after one year may be calculated as


Principal  is the balance in the saving account, Rate is the interest rate, and T is the number of times the interest is compounded during a year (T is 4 if the interest is compounded quarterly).

Write a program that asks for the principal, the interest rate, and the number of times the interest is compounded. It should display a report similar to:

```
Interest rate:		      4.25%  
Times Compounded:		     12  
Principal:            $ 1000.00  
Interest:             $   43.34  
Amount in Savings:	  $ 1043.34
```

**Answer:**

```
#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main()
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
```
___

**2\. Monthly Payments**  
The monthly payment on a loan may be calculated by the following formula:

Rate * (1 + Rate)N Payment = ((1 + Rate)N - 1) *L

Rate is the monthly interest rate, which is annual interest rate divided by 12. (12% annual interest would be 1 percent monthly interest) N is the number of payments, and L is the amount of the loan. Write a program that asks for these values and displays a report similar to:

```
Loan Amount:	        $ 10000.00  
Monthly Interest Rate:		    1%  
Number of Payments:			    36  
Monthly Payment:		$   332.14  
Amount Paid Back:		$ 11957.15  
Interest Paid:          $  1957.15
```

**Answer:**

```
#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main()
{
    double              // define variables
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
    interestRate /= 100; // convert annual interest rate to decimal form
        // calculate total interest
    interestPaid = loanAmount * (pow((1 + interestRate / numPayments), numPayments)) - loanAmount;
    total = loanAmount + interestPaid; // calculate total of loan and interest
    interestRate /= 12;            // convert interest rate from to monthly rate

    // intermission...
    double // split monthly balance equation into variables for readability
        monthBalanceEquationOne = interestRate * pow((1 + interestRate), numPayments),
        monthBalanceEquationTwo = pow((1 + interestRate), numPayments) - 1;

    // ...continue Calculations
    monthlyBalance = monthBalanceEquationOne / monthBalanceEquationTwo * loanAmount;

    // Display information
    cout << "\nLoan Amount:"           // Loan amount
         << setprecision(2) << fixed
         << right << setw(15)
         << "$" << loanAmount

         << "\nMonthly Interest Rate:" // Monthly interest rate
         << right << setw(12)
         << interestRate * 100 << "%"

         << "\nNumber of payments:"    // Number of payments
         << right << setw(16)
         << numPayments

         << "\nMonthly Payment:"       // Monthly payment
         << right << setw(13)
         << "$" << monthlyBalance

         << "\nAmount Paid Back:"      // Total to be paid
         << right << setw(10)
         << "$" << total

         << "\nInterest paid:"         // Interest paid
         << right << setw(14)
         << "$" << interestPaid;

    return 0;
}
```
___

**3\. Word Game**  
Write a program that plays game with the user. The program should display the following story, inserting the user’s input into the appropriate locations:

- His or her name
- His or her age
- The name of the city
- The name of the college
- A profession
- A type of animal
- A pet’s name

After the user has entered these items, the program should display the following story, inserting the user’s input into the appropriate locations:

> There once was a person named NAME who lived in CITY. At the age of AGE, NAME went to college at COLLEGE. NAME graduated and went to work as a PROFESSOR. Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived happily ever after!

**Answer:**

```
#include <iostream>
#include <string>

int main()
{
    string
        name,       // stores the user's name
        age,        // stores the user's age
        city,       // stores the name of a city
        college,    // stores the name of a college
        profession, // stores a profession
        animal,     // stores a type of animal
        pet;        // stores a pet's name

    // Get information from user input
    cout << "What's you're name?\n"; // ask
    getline(cin, name);              // get
    cout << "How about your age?\n";
    getline(cin, age);
    cout << "Yep, you guessed it, location?\n";
    getline(cin, city);
    cout << "Name a college.\n";
    getline(cin, college);
    cout << "Now, a profession.\n";
    getline(cin, profession);
    cout << "What about an animal?\n";
    getline(cin, animal);
    cout << "Lastly, a pet name.\n";
    getline(cin, pet);
    cout << endl; // add some space

    // Display the user's story
    cout << "There once was a person named " << name << " who lived in "
         << city << ".\nAt the age of " << age << ", " << name
         << " went to college at " << college << ".\n" << name
         << " graduated and went to work as a " << profession << ".\nThen, "
         << name << " adopted a(n) " << animal << " named " << pet
         << ".\nThey both lived happily ever after!";

    // Exit the dialog
    return 0;
}
```