//
//  CircuitBoardPrice.cpp
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

// 13. Circuit Board Price
// calculate sale price with 35% profit

using namespace std;

int CircuitBoardPrice()
{
    double purchasePrice = 14.95, profitMargin = 1.35, retailPrice;
    
    retailPrice = purchasePrice * profitMargin;
    
    cout << "These circuit boards should be sold at a price of $";
    cout << retailPrice << " each, to make a 35% profit.";
    
    return 0;
}
