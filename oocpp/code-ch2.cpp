/* 
  Carlos Vigil
  Dr. Laurasi
  OOC++
  Feb. 1 2017
  Chapter 2 Code Assignment
*/

// 10. Miles Per Gallon
// calculate fixed MPG
#include <iostream>
using namespace std;

int main()
{
    int gas = 15, miles = 375;

    cout << "This vehicle gives " << miles / gas;
    cout << "MPG.";

    return 0;
}

// 13. Circuit Board Price
// calculate sale price with 35% profit
#include <iostream>
using namespace std;

int main()
{
    double purchasePrice = 14.95, profitMargin = 1.35, retailPrice;
   
    retailPrice = purchasePrice * profitMargin;
   
    cout << "These circuit boards should be sold at a price of $";
    cout << retailPrice << " each, to make a 35% profit.";

    return 0;
}

// 14. Personal Information
// Displays my personal info, each item on a new line.
#include <iostream>
#include <string>
using namespace std;

int main()
{
    string name, address, phone, major;

    name = "Carlos Vigil\n";
    address = "19 Prospect Street\nSeymour, CT 06483";
    phone = "(203) 285-5665";
    major = "Computer Science";

    cout << name << address << endl << phone << endl << major << endl;

    return 0;
}
