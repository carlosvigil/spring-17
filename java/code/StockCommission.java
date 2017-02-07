/*
  Carlos Vigil
  Dr. Horvath
  Java
  February 3rd, 2017
*/

// Chapter 2, #14 Stock Commision

public class StockCommission
{
  public static void main(String[] args)
  {
      float
          shares = 600f, // the number of shares Kathryn bought
          buyingPrice = 21.77f, // stock price at purchase
          commission = 0.02f, // broker commision percentage
          totalBuy = shares * buyingPrice, // the price of all the shares bought
          totalPaid = totalBuy * (1f + commission);
                  // the total Kathryn paid for the transaction

      // display transaction details
      System.out.println("Kathryn paid $" + shares * buyingPrice + " for 600 shares."); 
      System.out.println("The broker's 2% commission was $" + totalBuy * commission + "."); 
      System.out.println("The total for the transaction was $" + totalPaid + ".");
  }
}

/* 14. Stock Commission Kaihryn bought 600 shares of stock at a price of $21.77
 per share. She must pay her stock- broker a 2 percent commission for the
 transaction. Write a program that calculates and displays the following:

- The amount paid for the stock alone (without the commission)
- The amount of the commission
- The total amount paid (for the stock plus the commission) */