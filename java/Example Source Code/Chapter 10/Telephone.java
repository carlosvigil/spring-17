/**
   Telephone class
*/

public class Telephone
{
   /**
      The format method accepts a String containing
      an unformatted telephone number, such as
      9195551212. It returns a String containing a
      formatted telephone number, such as (919)555-1212.
      @param number The number to format.
      @return A reference to the formatted String.
   */
   public static String format(String number)
   {
      StringBuilder str = new StringBuilder(number);

      // Insert parentheses around the area code.
      str.insert(0, '(');
      str.insert(4, ')');

      // Insert a hyphen after the prefix.
      str.insert(8, '-');

      // Return the formatted number as a string.
      return str.toString();
   }
}
