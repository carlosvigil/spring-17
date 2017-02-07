/*
  Carlos Vigil
  Dr. Horvath
  Java
  February 3rd, 2017
*/

// Chapter 2, #16 Word game

public class WordGame
{
    public static void main(String[] args) 
    {
        String
            name, // stores the user's name
            age,  // stores the user's age
            city, // stores the name of a city
            college, // stores the name of a college
            profession, // stores a profession
            animal, // stores a type of animal
            pet; // stores a pet's name

        // Get information from user input
        name = JOptionPane.showInputDialog("What's you're name?");
        age = JOptionPane.showInputDialog("How about your age?");
        city = JOptionPane.showInputDialog("Yep, you guessed it, location?");
        college = JOptionPane.showInputDialog("Name a college.");
        profession = JOptionPane.showInputDialog("Now, a profession.");
        animal = JOptionPane.showInputDialog("What about an animal?");
        pet = JOptionPane.showInputDialog("Lastly, a pet name.");

        // Display the user's story
        JOptionPane.showMessageDialog(null, "There once was a person named " +
            name + " who lived in " + city + ".\n At the age of " + age + ", " +
            name + " went to college at " + college + ".\n " + name + " graduated"
            + " and went to work as a " + profession + ".\n Then, " + name +
            " adopted a(n) " + animal + " named " + pet + ".\n They both lived " +
            "happily ever after!");

        // Exit the dialog
        System.exit(0);
   }
}

/*18. Word game
 Write a program that plays a word game with the user. The program should ask
 the user to enter the following:
• His or her name
• His or her age
• The name of a city
• The name of a college 
• A profession
• A type of animal
• A pet’s name

 After the user has entered these items, the program should display the
 following story, inserting the user’s input into the appropriate locations:
 There once was a person named NAME who lived in CITY. At the age of AGE,
 NAME went to college at COLLEGE. NAME graduated and went to work as a
 PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived
 happily ever after!*/