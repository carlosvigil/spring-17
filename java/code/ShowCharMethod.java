/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	March 27th, 2017
	Chapter 5: #1 showChar Method
*/

public class ShowCharMethod
{
	public static void main(String[] args) {
       showChar("Hello", 4);
       showChar("WzzApP", 5);
       showChar("Onomonopia", 6);
	}

    /**
     showChar uses charAt() to display a selected character location for a
     given String.
     @param string The string for searching/parsing.
     @param num The number location of the character to display.
     @return A single character to standard out or other.
    */
    public static void showChar(String string, int num) {
        System.out.println(string.charAt(num));
    }
}
