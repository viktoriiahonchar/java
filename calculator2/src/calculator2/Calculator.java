package calculator2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double a;
        double b;
        double answer;
        char operation;
        Scanner calc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        a = calc.nextDouble();
        b = calc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        operation = calc.next().charAt(0);
        switch(operation) {
            case '+': answer = a + b;
                break;
            case '-': answer = a - b;
                break;
            case '*': answer = a * b;
                break;
            case '/': answer = a / b;
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("The result is given as follows:");
        System.out.printf(a + " " + operation + " " + b + " = " + answer);
    }
}
