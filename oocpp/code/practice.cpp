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
void major_selection_logic (int);
void setData (string [], double [][TESTS]);
void getData (string [], double [][TESTS], char []);
double getAverage (double, int);
char getGrade (double);
// define arrays
string student_names[STUDENTS];
char letter_grades[STUDENTS];
double test_scores[STUDENTS][TESTS];
// main menu function
int main () {
    int selection;
    // persist until user exits
    do {
        // persist until a selection from 1-3 is made
        do {
            // output menu
            cout << "\n–––––––––––––––––––––––––––––––––––––––––––––"
                    << "\nType one of the numbers shown and press enter."
                    << "\n1. Enter all student data"
                    << "\n2. View all student data"
                    << "\n3. Exit"
                    << "\n\nSelection: ";
            // store users' input
            cin >> selection;
            cin.ignore();
        } while (selection < 0 || selection > 3);
        // menu formatting
        cout << "–––––––––––––––––––––––––––––––––––––––––––––";
        // send selection to logic
        major_selection_logic(selection);
    } while (selection != 3);
    // end program
    return 0;
}

// Decide what to do with the user's menu selection
void major_selection_logic(int selection) {
    switch (selection) {
        case 1:
            // populate data
            setData(student_names, test_scores);
            break;
        case 2:
            // display data
            getData(student_names, test_scores, letter_grades);
            cout << endl;
            break;
        default:
            cout << "\nOK\n";
    }
}

// Ask for and store data
void setData (string names[], double scores[][TESTS]) {
    // give user instructions
    cout << "\nEnter each of the 5 students names and test scores.\n";
    // loop through students
    for (int i = 0; i < STUDENTS; i++) {
        cout << "\nStudent " << i + 1 << endl;
        cout << "  Name: ";
        // store names
        getline(cin, names[i]);
        // title
        cout << "\n  Test Scores\n";
        // loop through tests
        for (int j = 0; j < TESTS; j++) {
            cout << "  " << j + 1 << ": ";
            // store test scores
            do {
                cin >> scores[i][j];
                cin.ignore();
                if (scores[i][j] < 0 || scores[i][j] > 100) {
                    cout << "    ERROR: Enter a score from 0-100.\n  ";
                }
            } while (scores[i][j] < 0 || scores[i][j] > 100);
        }
    }
}

// show data
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
        cout << "\n  Average: " << getAverage(total_score, TESTS) << endl;
        // display grade
        cout << "  Grade: " << getGrade(getAverage(total_score, TESTS)) << endl;
    }
}

// calculate an average
double getAverage (double total, int divisor) {
    return total / divisor;
}

// calculate a grade
char getGrade (double average) {
    if (average > 59.99) {
        if (average > 89.99) { return 'A'; }
        else if (average > 79.99) { return 'B'; }
        else if (average > 69.99) { return 'C'; }
        else { return 'D'; }
    }
    else { return 'F'; }
}
