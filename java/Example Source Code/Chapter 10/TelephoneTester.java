/**
   This program demonstrates the Telephone
   class's static format method.
*/

public class TelephoneTester
{
   public static void main(String[] args)
   {
      // Create an unformatted number.
      String phone = "9195551212";
      
      // Get a formatted version of it.
      String properNum = Telephone.format(phone);
      
      // Display the formatted number.
      System.out.println(properNum);
   }
}
