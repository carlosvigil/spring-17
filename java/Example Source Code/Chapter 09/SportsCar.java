import java.text.DecimalFormat;

/**
   SportsCar class
*/

public class SportsCar
{
   private CarType make;    // The car's make
   private CarColor color;  // The car's color
   private double price;    // The car's price
   
   /**
      The constructor initializes the car's make, 
      color, and price.
      @param aMake The car's make.
      @param aColor The car's color.
      @param aPrice The car's price.
   */
   
   public SportsCar(CarType aMake, CarColor aColor,
                    double aPrice)
   {
      make = aMake;
      color = aColor;
      price = aPrice;
   }

   /**
      getMake method
      @return The car's make.
   */
   
   public CarType getMake()
   {
      return make;
   }

   /**
      getColor method
      @return The car's color.
   */
   
   public CarColor getColor()
   {
      return color;
   }
   
   /**
      getPrice method
      @return The car's price.
   */
   
   public double getPrice()
   {
      return price;
   }
   
   /**
      toString method
      @return A string indicating the car's make,
              color, and price.
   */
   
   public String toString()
   {
      // Create a DecimalFormat object for
      // dollar formatting.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      // Create a string representing the object.
      String str = "Make: " + make + 
                   "\nColor: " + color +
                   "\nPrice: $" + dollar.format(price);
      
      // Return the string.
      return str;
   }
}
