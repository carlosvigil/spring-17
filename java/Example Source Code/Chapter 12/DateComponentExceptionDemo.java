/**
   This program demonstrates how the DateComponent
   class constructor throws an exception.
*/

public class DateComponentExceptionDemo
{
   public static void main(String[] args)
   {
      // Create a null String reference.
      String str = null;
      
      // Attempt to pass the null reference to
      // the DateComponent constructor.
      try
      {
         DateComponent dc = new DateComponent(str);
      }
      catch (IllegalArgumentException e)
      {
         System.out.println(e.getMessage());
      }
   }
}