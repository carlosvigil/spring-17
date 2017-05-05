
/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	May 5th, 2017
	Chapter 8 - #9 Geometry Calculator
*/
import java.lang.Math;

public class GeometryCalculator {
    /** areaFormula calculates the area of a circle, rectangle, and triangle.
     * @param double radius of the circle
     * @return String area for displaying in output
    */
    public static String areaFormula(double radius) {
        String area;
        return area = String.valueOf(Math.PI * Math.pow(radius, 2));
    }

    /** areaFormula calculates the area of a circle, rectangle, and triangle.
     * @param double width of the rectangle
     * @param double length of the rectangle
     * @return String area for displaying in output
    */
    public static String areaFormula(double width, double length) {
        String area;
        return area = String.valueOf(width * length);
    }

    /** areaFormula calculates the area of a circle, rectangle, and triangle.
     * @param boolean tri true if calculating for a triangle
     * @param double base of the triangle
     * @param double height of the triangle
     * @return String area for displaying in output
    */
    public static String areaFormula(boolean tri, double base, double height) {
        if (tri) {
            String area;
            return area = String.valueOf(base * height * 0.5);
        }
        return "ERROR: boolean parameter \"tri\" is not set to true.";
    }
}
