package perimetr;
import java.util.Scanner;

public class CircleLengthCalculator {
    private static double nextDouble;

    public static void main(String[] args) {
        Scanner CircleLengthCalculator = new Scanner(System.in);
        System.out.print("Enter radius");
        double r = CircleLengthCalculator.nextDouble();
        double p = 3.14926;
        double answer;
        answer = (2 * p * r);
        System.out.print("Answer is " + answer);
    }
}