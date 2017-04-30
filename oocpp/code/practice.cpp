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
    const int NUM_EMPLOYEES = 10;
    int employee_id[NUM_EMPLOYEES];
    double weekly_gross_pay[NUM_EMPLOYEES];

    // Ask for and enter information
    for (int i = 0; i < NUM_EMPLOYEES; i++) {
        // Announce which employee to write info for
        cout << "Employee " << i + 1 << endl << "Enter ID number: ";
        // Accept employee id
        cin >> employee_id[i];
        cin.clear();

        // Loop through second array
        for (int j = 0; j < NUM_EMPLOYEES; j++) {
            cout << "Enter weekly gross pay: ";
            cin >> weekly_gross_pay[j];
            cin.clear();
        }
    }

    // Output stored information
    for (int i = 0; i < NUM_EMPLOYEES; i++) {
        // Announce which employee is being displayed
        cout << "\nEmployee " << i + 1 << ", ID " << employee_id[i];

        for (int j = 0; j < NUM_EMPLOYEES; j++) {
            cout << "\nWeekly gross pay: " << weekly_gross_pay[j];
        }
    }
}
