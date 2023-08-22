/*
  Carlos Vigil
  Dr. T. Laurasi
  OOC++
  May 4th, 2017
  Chapter 7
*/
#include <iostream>
using namespace std;

// declare function/method
void larger_than_n(int[], int, int);

int main() {
    // array length
    const int size = 5;
    // array definition
    int test_array[size] = {12, 234, 5, 56, 11};
    // test function/method
    larger_than_n(test_array, size, 45);

    return 0;
 }

// define function/method
void larger_than_n (int array[], int array_size, int num) {
    cout << "\nOf the numbers: ";
    // output array
    for (int i = 0; i < array_size; i++) {
        cout << array[i];
        if (i < array_size - 1) {
            cout << ", ";
        } else {
            cout << ".";
        }
    }
    // output logic
    cout << "\nThese are greater than " << num << ": ";
    // output results
    for (int i = 0; i < array_size; i++) {
        if (array[i] > num) {
            cout << array[i];
            if (i < array_size - 1) {
                cout << ", ";
            } else {
                cout << ".";
            }
        }
    }
    cout << endl << endl;
}

/* In a program, write a function that accepts three arguments: an array, the
 size of the array, and a number n. Assume that the array contains integers.
 The function should display all the numbers in the array that are greater
 than the number n.*/
