//
//  PersonalInformation.hpp
//  code
//
//  Created by Carlos Vigil on 2/8/17.
//  Copyright © 2017 Carlos Vigil. All rights reserved.
//
/*
  Carlos Vigil
  Dr. Laurasi
  OOC++
  Feb. 1 2017
  Chapter 2 Code Assignment
*/

// 14. Personal Information
// Displays my personal info, each item on a new line.
#include <iostream>
#include <string>
using namespace std;

int main()
{
    string name, address, phone, major;

    name = "First Last\n";
    address = "123 Street Road\nTown, QQ 012345";
    phone = "(123) 456-7890";
    major = "Computer Science";

    cout << name << address << endl << phone << endl << major << endl;

    return 0;
}
