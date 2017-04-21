/*
	Carlos Vigil
	Dr. C. Horvath
	Java @ GCC
	April 18th, 2017
	Chapter 6 - Test Scores Class
*/

/**
 * TestScores
 */
public class TestScores {
    double first, second, third;

    // Constructors
    public TestScores (double f, double s, double t) {
        first = f;
        second = s;
        third = t;
    }

    public TestScores () {
        first = 0f;
        second = 0f;
        third = 0f;
    }

    // Accessors
    public double getFirstScore() {
        return first;
    }

    public double getSecondScore() {
        return second;
    }

    public double getThirdScore() {
        return third;
    }

    // Mutators
    public void setFirstScore (double score) {
        first = score;
    }

    public void setSecondScore (double score) {
        second = score;
    }

    public void setThirdScore (double score) {
        third = score;
    }

    public double averageScore() {
        double sum = first + second + third;
        return sum / 3;
    }
}
