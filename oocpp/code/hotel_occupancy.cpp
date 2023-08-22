#include <iostream>
using namespace std;

int main()
{
    // variable declarations
    int total_floors = 0,          // the number of floors in the hotel
        rooms = 0,                 // the number of rooms on a floor
        total_rooms = 0,           // the total of rooms in the hotel
        occupied_rooms = 0,        // the number of occupied rooms on a floor
        total_occupied = 0,        // the total of occupied rooms in the hotel
        total_unoccupied = 0;      // the total remainder of rooms unoccupied
    double percent_occupied = 0.0; // a percentage of the hotel occupancy

    // ask for number of floors
    cout << "How many floors are in the hotel?\n";
    cin >> total_floors;
    // input validation
    while (!cin.good() || total_floors < 1)
    {
        cin.clear();
        cout << "\nTry again.\nEnter the total number of floors in the hotel:\n";
        cin >> total_floors;
    }

    // loop through each floor
    for (int i = 0; i < total_floors; i++)
    {
        // let user know what floor we're asking about
        cout << "\nFloor: " << i + 1 << endl;
        // ask for floor variable value
        cout << "How many rooms are there?\n";
        cin >> rooms;
        // input validation
        while (!cin.good() || rooms < 0)
        {
            cin.clear();
            cout << "\nTry again.\nEnter the number of rooms on this floor:\n";
            cin >> rooms;
        }
        // add floor number to total_rooms
        total_rooms += rooms;
        // ask for number of occupied rooms
        cout << "How many of those are occupied?\n";
        cin >> occupied_rooms;
        // input validation
        while (!cin.good() || occupied_rooms < 0)
        {
            cin.clear();
            cout << "\nTry again.\nEnter the number of occupied rooms on the floor:\n";
            cin >> occupied_rooms;
        }
        // add occupied_rooms value to the total of total_occupied
        total_occupied += occupied_rooms;
    }

    // do calculations for percentage of occupied_rooms and total_unoccupied
    percent_occupied = static_cast<double>(total_occupied) / total_rooms;
    percent_occupied *= 100.00;
    total_unoccupied = total_rooms - total_occupied;

    // display results
    cout << "\nResult:\n"
         << "Total number of rooms: " << total_rooms << endl
         << "Total number of rooms occupied: " << total_occupied << endl
         << "Total number of rooms unoccupied: " << total_unoccupied << endl
         << "Percent occupied: " << percent_occupied << "%\n";

    return 0;
}
