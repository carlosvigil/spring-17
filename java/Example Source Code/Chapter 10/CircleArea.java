import java.util.Scanner;
import java.text.DecimalFormat;

/**
   This program demonstrates the Character
   class's toUpperCase method.
*/

public class CircleArea
{
   public static void main(String[] args)
   {
      double radius; // The circle's radius
      double area;   // The circle's area
      String input;  // To hold a line of input
      char choice;   // To hold a single character

      // Create a Scanner object to read keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a DecimalFormat object.
      DecimalFormat fmt = new DecimalFormat("0.00");

      do
      {
         // Get the circle's radius.
         System.out.print("Enter the circle's " +
                          "radius: ");
         radius = keyboard.nextDouble();
         
         // Consume the remaining newline character.
         keyboard.nextLine();

         // Calculate and display the area.
         area = Math.PI * radius * radius;
         System.out.println("The area is " +
                            fmt.format(area));

         // Repeat this?
         System.out.print("Do you want to do this " +
                          "again? (Y or N) ");
         input = keyboard.nextLine();
         choice = input.charAt(0);

      } while (Character.toUpperCase(choice) == 'Y');
   }
}
