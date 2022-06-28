package CircleLengthCalculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CircleLengthCalculator calculator = new CircleLengthCalculator();
        double p = 3.14926;
        double r = 0;
        double answer =2*p*r;

        Scanner CircleLengthCalculator=new Scanner(System.in);
        System.out.print("Enter radius");

        r = CircleLengthCalculator.nextDouble();
        answer = calculator.calculate(answer, p, r);
        System.out.print("Answer is "+answer);
    }
}
