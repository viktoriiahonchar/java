package NewCalc;
import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        calc calculatorimplementation;
        calculatorimplementation = new calc();
        double a;
        double b;
        double answer;
        char operation;
        Scanner calc = new Scanner(System.in);
        System.out.print ("Enter two numbers");
        a=calc.nextDouble();
        b=calc.nextDouble();
        System.out.print ("Enter the operation (+, -, *, / ): ");
        operation = calc.next().charAt(0);
        switch (operation) {
            case '+':
                answer = a + b;
                System.out.println(a + " + " + b + " = " + answer);
                break;


            case '-':
                answer = a - b;
                System.out.println(a + " - " + b + " = " + answer);
                break;

            case '*':
                answer = a * b;
                System.out.println(a + " * " + b + " = " + answer);
                break;

            case '/':
                answer = a / b;
                System.out.println(a + " / " + b + " = " + answer);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

    }
}