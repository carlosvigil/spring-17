/**
   This program demonstrates a nested loop.
*/

import java.io.*;   // Needed for console keyboard input

public class TestAverage2
{
   public static void main(String [] args) throws IOException
   {
      int numStudents,   // Number of students
          numTests,      // Number of tests per student
          score,         // Test score
          total;         // Accumulator for test scores
      double average;    // Average test score
      String input;      // To hold user input

      // Create the necessary objects for keyboard input.
      InputStreamReader reader =
                    new InputStreamReader(System.in);
      BufferedReader keyboard =
                    new BufferedReader(reader);

      System.out.println("This program averages test scores.");

      // Get the number of students.
      System.out.print("How many students do you have? ");
      input = keyboard.readLine();
      numStudents = Integer.parseInt(input);

      // Get the number of test scores per student.
      System.out.print("How many test scores per student? ");
      input = keyboard.readLine();
      numTests = Integer.parseInt(input);

      // Process all the students.
      for (int student = 1; student <= numStudents; student++)
      {
         // Set the accumulator to zero.
         total = 0;

         // Get the test scores for a student.
         for (int test = 1; test <= numTests; test++)
         {
            System.out.print("Enter score " + test +
                             " for student " + student + ": ");
            input = keyboard.readLine();
            score = Integer.parseInt(input);
            total += score;  // Add score to total.
         }

         // Calculate and display the average.
         average = total / numTests;
         System.out.println("The average score for student " +
                            student + " is " + average);
         System.out.println();
      }
   }
}

