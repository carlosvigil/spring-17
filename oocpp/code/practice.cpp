/*
  Carlos Vigil
  Dr. . Laurasi
  OOC++
*/
#include <iostream>
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

	cin.get();
	return 0;
}

int input_employees () {
	int num_employees;

	cout << "\nEnter the number of employees: ";
	cin >> num_employees;

	return num_employees;
}

int input_absences (int employees) {
	int total_absences;
	int absences;

	for (; employees > 0; employees--) {
		cout << "\nEnter how times employee " << employees << " was absent: ";
		cin >> absences;
		total_absences += absences;
	}

	return total_absences;
}
