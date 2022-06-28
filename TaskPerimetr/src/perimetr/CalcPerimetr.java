package perimetr;

import java.util.Scanner;

public class CalcPerimetr{
    private static double nextDouble;

    public static void main(String[] args) {
        Scanner CalcPerimetr = new Scanner(System.in);
        System.out.print("Enter two numbers");
        double a = CalcPerimetr.nextDouble ();
        double b = CalcPerimetr.nextDouble ();
        double answer;
        answer= ((a + b) * 2);
        System.out.print("Answer is "+ answer);


    }
}
