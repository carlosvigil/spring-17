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

    // input validation
    while (!cin.good() || years < 0)
    {
        cin.clear();
        cout << "Try again.\nEnter the number of years:\n";
        cin >> years;
    }

    // loop through each year given
    for (int y = 0; y < years; y++)
    {
        // loop through each of 12 months
        for (int m = 0; m < 12; m++)
        {
            // display the current year and month for input
            cout << "Year " << y + 1 << ", Month " << m + 1 << endl;
            //ask for rainfall input
            cout << "What is the monthly rainfall in inches?\n";
            cin >> rainfall;
            // input validation
            while (!cin.good() || rainfall < 0)
            {
                cin.clear();
                cout << "Try again.\nEnter the rainfall in inches:\n";
                cin >> rainfall;
            }
            // add rainfall to total rainfall
            total_rainfall += rainfall;
        }
    }
    // calculate average
    average_rainfall = static_cast<double>(total_rainfall) / (12 * years);
    // output results
    cout << "\nIn the " << years * 12 << " months counted,\n"
         << "Total rainfall was " << total_rainfall << " inches,\n"
         << "Average monthly rainfall was " << average_rainfall << " inches.\n";

    return 0;
}
