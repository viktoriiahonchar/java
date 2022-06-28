package goroshok;
import java.util.Scanner;
class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        System.out.println("Enter year of service: ");
        int salary = sc.nextInt();
        int year = sc.nextInt();
        double bonus = salary * 0.05;
        double sum = salary + bonus;
        String result = "Your Net bonus is";
        String totalsalary = String.valueOf(sum);
        String userdata = result + " " + sum;
        if (year>=5) {
            System.out.println(userdata);
        }
        else if (year<5) {
            System.out.println("You-looser!");
        }
    }
}
//A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.