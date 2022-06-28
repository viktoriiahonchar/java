package PerimeterCalculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PerimeterCalculator calculator = new PerimeterCalculator();
        double a = 0;
        double b = 0;
        double answer = (a+b)*2;

        Scanner PerimeterCalculator=new Scanner(System.in);
        System.out.print("Enter two numbers");

        a = PerimeterCalculator.nextDouble();
        b = PerimeterCalculator.nextDouble();

        answer = calculator.calculate(answer, a, b);
        System.out.print("Answer is "+answer);
    }
}
