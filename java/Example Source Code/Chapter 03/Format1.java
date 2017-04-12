import java.text.DecimalFormat;

/**
   This program demonstrates the DecimalFormat class.
*/

public class Format1
{
   public static void main(String[] args)
   {
      double number1 = 0.166666666666667;
      double number2 = 1.666666666666667;
      double number3 = 16.666666666666667;
      double number4 = 166.666666666666667;

      // Create a DecimalFormat object.
      DecimalFormat formatter = new DecimalFormat("#0.00");

      // Display the formatted variable contents.
      System.out.println(formatter.format(number1));
      System.out.println(formatter.format(number2));
      System.out.println(formatter.format(number3));
      System.out.println(formatter.format(number4));
   }
}
