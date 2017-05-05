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
// constants
const int STUDENTS = 5;
const int TESTS = 4;
// prototypes
void setData (string [], double [][TESTS]);
void getData (string [], double [][TESTS], char []);
int getAverage (double, int);

int main () {
    // define arrays
    string student_names[STUDENTS];
    char letter_grades[STUDENTS];
    double test_scores[STUDENTS][TESTS];
    // give user instructions
    cout << "\nEnter each of the 5 students names and test scores.\n";
    // populate data
    setData(student_names, test_scores);
    // display data
    getData(student_names, test_scores, letter_grades);
    // end program
    return 0;
}

void setData (string names[], double scores[][TESTS]) {
    // loop through students
    for (int i = 0; i < STUDENTS; i++) {
        cout << "\nStudent " << i + 1 << endl;
        cout << "  Name: ";
        // store names
        getline(cin, names[i]);
        cin.ignore();
        cin.clear();
        // title
        cout << "\n  Test Scores\n";
        // loop through tests
        for (int j = 0; j < TESTS; j++) {
            cout << "  " << j + 1 << ": ";
            // store test scores
            do {
                cin >> scores[i][j];
            } while (scores[i][j] < 0 || scores[i][j] > 100);
        }
    }
}

void getData (string names[], double scores[][TESTS], char grades[]) {
    // declare acculumator
    double total_score;
    // title
    cout << "\n\nSTUDENT GRADES\n";
    // iterate through students
    for (int i = 0; i < STUDENTS; i++) {
        // set accumulator to zero
        total_score = 0.0;
        // display name, then, scores
        cout << "\nStudent: " << names[i] << "\n  Scores: ";
        // iterate through tests scores
        for (int j = 0; j < TESTS; j++) {
            // output formatting
            if (j < TESTS - 1) {
                cout << scores[i][j] << ", ";
            } else {
                cout << scores[i][j];
            }
            // accumulation
            total_score += scores[i][j];
        }
        // display average
        cout << "\n  Grade: " << getAverage(total_score, TESTS) << endl;
    }
}

int getAverage (double total, int divisor) {
    return total / divisor;
}

/*
 * Write a program that uses an array of string objects to hold the five
 * student names, an array of five characters to hold the five students’ letter
 * grades, and five arrays of four doubles to hold each student’s set of test
 * scores.
 */
