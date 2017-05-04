/*
  Carlos Vigil
  Dr. T. Laurasi
  OOC++
  May 4th, 2017
  Chapter 7
*/
#include <iostream>
#include <string>
using namespace std;

const int STUDENTS = 5;
const int TESTS = 4;

void setData(string [], double [][TESTS]);
int getAverage (int, int);

int main () {
    // define arrays
    string student_names[STUDENTS];
    char letter_grades[STUDENTS];
    double test_scores[STUDENTS][TESTS];
    // give user instructions
    cout << "\nEnter each of the 5 students names and test scores.\n";
    // populate data
    setData(student_names, test_scores);
    // end program
    return 0;
}

void setData (string names[], double scores[][TESTS]) {
    // loop through students
    for (int i = 0; i < STUDENTS; i++) {
        cout << "\nStudent: " << i + 1 << endl;
        cout << "  Name: ";
        // store names
        cin >> names[i];

        cout << "\n  Test Scores\n";
        // loop through tests
        for (int j = 0; j < TESTS; j++) {
            cout << "  " << j + 1 << ": ";
            // store test scores
            do {
                cin >> scores[i][j];
            } while ();
        }
    }
    cout << "\nOK\n";
}

void getData (string names[], int scores[][TESTS], char grades[]) {
    for (int i = 0; i < STUDENTS; i++) {
        cout << "\n" << names[i] << "\nSC"
    }
}

int getAverage (int total, int divisor) {
    return total / divisor;
}

/*
 * Write a program that uses an array of string objects to hold the five
 * student names, an array of five characters to hold the five students’ letter
 * grades, and five arrays of four doubles to hold each student’s set of test
 * scores.
 */
