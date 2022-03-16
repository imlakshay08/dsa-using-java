import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your initial principle balance P = ");
        double P = input.nextDouble();

        System.out.print("Enter your annual interest rate r = ");
        double r = input.nextDouble();

        System.out.print("Enter the time t(in years) = ");
        double t = input.nextDouble();

        double A = P * r * t;
        System.out.print("Your Simple Interest A = " + A);

    }
}
