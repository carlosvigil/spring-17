#include <iostream>
#include <string>
using namespace std;

int main()
{
    // variable declarations
    int bar_graph_ticks;   // a calculated total of bar graph ticks to add
    double sales;          // sales for a single store
    string asterisks = "", // an asterisks bar graph row
        all_sales = "";    // all bar graphs concatenated for output

    // loop through each floor
    for (int i = 0; i < 5; i++)
    {
        // ask for sales variable value
        cout << "Enter today's sales for store " << i + 1 << ": ";
        cin >> sales;
        // input validation
        while (sales < 0 || !cin.good())
        {
            cout << "Error.\nEnter today's sales for store " << i + 1 << ": ";
            cin >> sales;
        }
        // calculate the number of asterisks to display
        bar_graph_ticks = static_cast<int>(sales) / 100;
        for (bar_graph_ticks; bar_graph_ticks > 0; bar_graph_ticks--)
        {
            asterisks += "*";
        }
        // add a new string to the output bar graphs
        all_sales += "Store " + to_string(i + 1) + ": " + asterisks + "\n";

        // clear data
        asterisks = "";
    }

    // display results
    cout << "\nSALES BAR CHART\n(Each * = $100)\n" << all_sales;

    return 0;
}
