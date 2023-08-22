/*
  Carlos Vigil
  Dr. T. Laurasi
  OOC++, GCC
  April 13th, 2017
  Chapter 6 Project
*/

#include <iostream>
#include <iomanip>
using namespace std;

int input_employees();
int input_absences(int);
double average_absences(int, int);

int main () {
	int number_employees;
	int days_absent;
	double average_days_absent;

	number_employees = input_employees();
	days_absent = input_absences(number_employees);
	average_days_absent = average_absences(number_employees, days_absent);

	cout << setprecision(2)
		 << "\nTotal absences: " << days_absent
		 << "\nAverage absences: " << average_days_absent << endl;

	cin.get();
	return 0;
}

int input_employees () {
	int num_employees;

    do {
		cin.clear();
		cout << "\nEnter the number of employees: ";
		cin >> num_employees;
	} while (num_employees < 1);

	return num_employees;
}

int input_absences (int employees) {
	int total_absences = 0;
	int absences;

	for (; employees > 0; employees--) {
        do {
			absences = 0;
			cout << "\nEnter how times employee " << employees << " was absent: ";
			cin >> absences;
		} while (absences < 0);

		total_absences += absences;
	}
	return total_absences;
}

double average_absences (int employees, int absences) {
	return static_cast<double>(absences) / employees;
}
