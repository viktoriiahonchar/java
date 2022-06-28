package goroshok;
import java.util.Scanner;
class task2 {
    public static void main(String[] args) {
        Scanner task2 = new Scanner(System.in);
        System.out.println("Enter next values a, b: ");
        int a = task2.nextInt();
        int b = task2.nextInt();
        if (a > b) {
            System.out.println(a);
        }
        else if (a == b) {
            System.out.println(" ");
        }
        else if (a < b) {
            System.out.println(b);
        }
    }
}
