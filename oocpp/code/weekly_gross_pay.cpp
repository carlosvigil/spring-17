/*
  Carlos Vigil
  Dr. T. Laurasi
  OOC++
  April 26th, 2017
  Chapter 7
*/
#include <iostream>
using namespace std;

int main() {
    // array length
    const int NUM_EMPLOYEES = 10;
    // array definition
    int employee_id[NUM_EMPLOYEES];
    double weekly_gross_pay[NUM_EMPLOYEES];

    // define accepted input
    cout << "\nUse only numbers to input information.\n";

    // Ask for and store information
    for (int i = 0; i < NUM_EMPLOYEES; i++) {
        // status variable for uniqueness
        bool unique_id = true;

        do {
            // reset uniqueness variable
            unique_id = true;

            // Announce which employee to write info for
            cout << "\nEmployee " << i + 1 << endl << "Enter ID number: ";
            // Store user entered employee id
            cin >> employee_id[i];
            cin.clear();

            // check for validity
            // greater than zero
            if (employee_id[i] < 1) {
                //notify user
                cout << "\nERROR: Employee ID cannot be 0 or negative.\n";
                // skip other checks
                continue;
            }
            // unique ID
            for (int j = 0; j < NUM_EMPLOYEES; j++) {
                if (i != j && employee_id[i] == employee_id[j]) {
                    // set status
                    unique_id = false;
                    // cout << endl << j << " flag is " << unique_id << endl;
                    break;
                }
                    // cout << endl << j << " flag is " << unique_id << endl;
            }
            // if not unique, notify user
            if (!unique_id) {
                cout << "\nERROR: Use a unique number for an ID.\n";
            }
        } while (employee_id[i] < 1 || !unique_id);

        // ask for, store, and validate gross pay
        do {
            cout << "Enter weekly gross pay: ";
            cin >> weekly_gross_pay[i];
            cin.clear();
        } while (weekly_gross_pay[i] < 0.0);
    }

    // Output stored information
    for (int i = 0; i < NUM_EMPLOYEES; i++) {
        // Announce which employee is being displayed
        cout << "\nEmployee ID: " << employee_id[i]
             << ", weekly gross pay: $" << weekly_gross_pay[i] << endl;
    }
}
