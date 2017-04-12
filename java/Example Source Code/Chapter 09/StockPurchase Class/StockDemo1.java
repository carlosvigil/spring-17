//**************************************************
// This program demonstrates the Precinct class's  *
// toString method.                                *
//**************************************************

public class PrecinctDemo1
{
   public static void main(String[] args)
   {
      // Create a Precinct object for the mid-town
      // area. This area has 7,569 Democrats,
      // 7,489 Republicans, and 793 Independents.
      Precinct midTownArea = new Precinct(7569, 7489, 793);
      
      // Display the object's values.
      System.out.println("Mid-town area precinct voters:");
      System.out.println(midTownArea);
   }
}