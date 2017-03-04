//
//  WordGame.hpp
//  code
//
//  Created by Carlos Vigil on 2/17/17.
//  Copyright © 2017 Carlos Vigil. All rights reserved.
//
/*
 Carlos Vigil
 Dr. Laurasi
 GCC OOC++
 Feb. 16th 2017
 
 Chapter 3 Code Assignment
 Word Game
 Collect information and display it in a text story.
*/

#include <string>

int WordGame()
{
    string
        name,       // stores the user's name
        age,        // stores the user's age
        city,       // stores the name of a city
        college,    // stores the name of a college
        profession, // stores a profession
        animal,     // stores a type of animal
        pet;        // stores a pet's name

    // Get information from user input
    cout << "What's you're name?\n"; // ask
    getline(cin, name);              // get
    cout << "How about your age?\n";
    getline(cin, age);
    cout << "Yep, you guessed it, location?\n";
    getline(cin, city);
    cout << "Name a college.\n";
    getline(cin, college);
    cout << "Now, a profession.\n";
    getline(cin, profession);
    cout << "What about an animal?\n";
    getline(cin, animal);
    cout << "Lastly, a pet name.\n";
    getline(cin, pet);
    cout << endl; // add some space

    // Display the user's story
    cout << "There once was a person named " << name << " who lived in "
         << city << ".\nAt the age of " << age << ", " << name
         << " went to college at " << college << ".\n" << name
         << " graduated and went to work as a " << profession << ".\nThen, "
         << name << " adopted a(n) " << animal << " named " << pet
         << ".\nThey both lived happily ever after!";

    // Exit the dialog
    return 0;
}
