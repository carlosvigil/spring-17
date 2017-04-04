/*
  Carlos Vigil
  Dr. . Laurasi
  OOC++
  April 4th, 2017
  Chapter 6
*/

#include <iostream>
using namespace std;

int askNumOne();
int askNumTwo();
void addVar(int, int);

int main () {
  int firstNum, secondNum;
  firstNum = askNumOne();
  cin.clear();
  secondNum = askNumTwo();
  cin.clear();
  addVar(firstNum, secondNum);

  return 0;
}

int askNumOne () {
  int firstNum;

  cout << "Input the first number: ";
  cin >> firstNum;

  return firstNum;
}

int askNumTwo () {
  int secondNum;

  cout << "Input the second number: ";
  cin >> secondNum;
   return secondNum;
}

void addVar (int firstNum, int secondNum) {
  cout << "Those added together are: " << firstNum + secondNum << endl;
}

