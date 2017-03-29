#include <iostream>
using namespace std;

int main()
{
    // variable declarations
    int years;               // the number of years to record
    int rainfall;            // the monthly rainfall in inches
    int total_rainfall = 0;  // the total rainfall
    double average_rainfall; // the average rainfall per month

    // ask for number of years
    cout << "\nEnter the number of years:\n";
    cin >> years;

    while (!cin.good() || years < 0)
    {
        cin.clear();
        cout << "Try again.\nEnter the number of years:\n";
        cin >> years;
    }

    // loop through each floor
    for (int y = 0; y < years; y++)
    {
        for (int m = 0; m < 12; m++)
        {
            cout << "What is the monthly rainfall in inches?\n";
            cin >> rainfall;
            while (!cin.good() || rainfall < 0)
            {
                cin.clear();
                cout << "Try again.\nEnter the rainfall in inches:\n";
                cin >> rainfall;
            }
            total_rainfall += rainfall;
        }
    }

    // calculate average
    average_rainfall = static_cast<double>(total_rainfall) / (12 * years);
    cout << endl << total_rainfall << endl << average_rainfall << endl << years * 12 << endl;

        return 0;
}
