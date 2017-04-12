import java.util.Scanner;
import java.text.DecimalFormat;

/**
   This program allows you to purchase shares of XYZ
   company's stock.
*/

public class StockTrader
{
   public static void main(String[] args)
   {
      int sharesToBuy;  // Number of shares to buy.
      
      // Create a Stock object for the company stock.
      // The trading symbol is XYZ and the stock is 
      // currently $9.62 per share.
      Stock xyzCompany = new Stock("XYZ", 9.62);
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a DecimalFormat object to format numbers
      // as dollar amounts.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      // Display the current share price.
      System.out.println("XYZ Company's stock is currently $"
                  + dollar.format(xyzCompany.getSharePrice())
                  + " per share.");
                         
      // Get the number of shares to purchase.
      System.out.print("How many shares do you want to buy? ");
      sharesToBuy = keyboard.nextInt();
      
      // Create a StockPurchase object for the transaction.
      StockPurchase buy =
               new StockPurchase(xyzCompany, sharesToBuy);
      
      // Display the cost of the transaction.
      System.out.println("Cost of the stock: $"
                         + dollar.format(buy.getCost()));
   }
}

